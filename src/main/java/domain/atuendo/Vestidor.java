package domain.atuendo;

import java.util.List;
import java.util.stream.Collectors;

public class Vestidor {
  private static GuardaRopas guardaRopas;

  public Vestidor(GuardaRopas guardaRopas){
    this.guardaRopas = guardaRopas;
    guardaRopas.setVestidor(this);
  }


  public static Atuendo generarAtuendoAptoTemperatura(){
    Prenda prendaSuperiorApta = prendaAleatoreaAptaAlClima(guardaRopas.getPrendasSuperiores());
    Prenda prendaInferiorApto = prendaAleatoreaAptaAlClima(guardaRopas.getPrendasInferiores());
    Prenda prendaCalzadoApto = prendaAleatoreaAptaAlClima(guardaRopas.getPrendasCalzados());
    Prenda prendaAccesoriosApta = prendaAleatoreaAptaAlClima(guardaRopas.getPrendasAccesorios());

    Atuendo atuendo= new Atuendo();
    atuendo.cargarPrenda(prendaSuperiorApta,prendaAccesoriosApta,prendaInferiorApto,prendaCalzadoApto);
    return atuendo;
  }


  public static Prenda prendaAleatoreaAptaAlClima(List<Prenda> lista){
    return lista.stream().filter(prenda -> prenda.usableAhora()).collect(Collectors.toList()).get((int) Math.floor(Math.random()*(lista.size()+1)));
  }

}


