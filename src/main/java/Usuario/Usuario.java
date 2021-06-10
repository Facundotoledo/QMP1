package Usuario;

import Validaror.GuardarropasNoPerteneceAUsuarioException;
import domain.atuendo.CriterioVestidor;
import domain.atuendo.GuardaRopas;
import domain.atuendo.Prenda;
import domain.atuendo.Vestidor;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private static List<GuardaRopas> guardarropas = new ArrayList<>();
  private static Prenda sugerenciaDiaria;
  private static Boolean prefiereMail;

  public static void compartirGuardarropas(GuardaRopas unGuardarropas, Usuario nuevoDuenio) throws GuardarropasNoPerteneceAUsuarioException {
    if(!guardarropas.contains(unGuardarropas)){throw new GuardarropasNoPerteneceAUsuarioException();}

    nuevoDuenio.agregarGuardarropas(unGuardarropas);
  }

  public static void agregarGuardarropas(GuardaRopas unGuardarropas){
    guardarropas.add(unGuardarropas);
  }

  public static void crearGuardarropas(CriterioVestidor criterioVestidor, List<Prenda> prendas){
    guardarropas.add(new GuardaRopas(criterioVestidor,prendas));
  }

  public void setSugerenciaDiaria(Prenda prenda) {
    this.sugerenciaDiaria = prenda;
  }

// ver sugerencia nueva


  public static List<GuardaRopas> getGuardarropas() {
    return guardarropas;
  }

  public Boolean prefiereMails(){
    return prefiereMail;
  }
}
