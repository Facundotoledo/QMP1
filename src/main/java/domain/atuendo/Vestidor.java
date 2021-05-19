package domain.atuendo;

import java.util.List;
import java.util.stream.Collectors;

public class Vestidor {
  private static RepositorioPrendas repositorio = RepositorioPrendas.getInstance();;


  public static Atuendo generarAtuendoAptoTemperatura(){
    Prenda prendaSuperiorApta = prendaAleatoreaApta(repositorio.getPrendasSuperiores());
    Prenda prendaInferiorApto = prendaAleatoreaApta(repositorio.getPrendasInferiores());
    Prenda prendaCalzadoApto = prendaAleatoreaApta(repositorio.getPrendasCalzados());
    Prenda prendaAccesoriosApta = prendaAleatoreaApta(repositorio.getPrendasAccesorios());

    Atuendo atuendo= new Atuendo();
    atuendo.cargarPrenda(prendaSuperiorApta,prendaAccesoriosApta,prendaInferiorApto,prendaCalzadoApto);
    return atuendo;
  }


  public static Prenda prendaAleatoreaApta(List<Prenda> lista){
    return lista.stream().filter(prenda -> prenda.usableAhora()).collect(Collectors.toList()).get((int) Math.floor(Math.random()*(lista.size()+1)));
  }
}
