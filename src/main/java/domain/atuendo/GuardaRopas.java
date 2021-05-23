package domain.atuendo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GuardaRopas {
  private static CriterioVestidor criterioVestidor;
  private static List<Prenda> prendasSugeridasParaAgregar;
  private static List<Prenda> prendasSugeridasParaQuitar;
  private static List<Prenda> prendasQuitadas;
  private static List<Prenda> prendasAgregadas;

  private static List<Prenda> prendasSuperiores = Arrays.asList();
  private static List<Prenda> prendasInferiores = Arrays.asList();
  private static List<Prenda> prendasAccesorios = Arrays.asList();
  private static List<Prenda> prendasCalzados = Arrays.asList();

  public GuardaRopas(CriterioVestidor criterioVestidor){
    this.criterioVestidor = criterioVestidor;
  }

  public static void agregarPrenda(Prenda prenda) {
    switch (prenda.getCategoria()){
      case PARTESUPERIOR: prendasSuperiores.add(prenda);
      case CALZADO: prendasCalzados.add(prenda);
      case ACCESORIO: prendasAccesorios.add(prenda);
      case PARTEINFERIOR: prendasInferiores.add(prenda);
    }
  }

  public static void quitarPrenda(Prenda prenda){
    switch (prenda.getCategoria()){
      case PARTESUPERIOR: prendasSuperiores.remove(prenda);
      case CALZADO: prendasCalzados.remove(prenda);
      case ACCESORIO: prendasAccesorios.remove(prenda);
      case PARTEINFERIOR: prendasInferiores.remove(prenda);
    }
  }

  public static List<Prenda> getRopaSugeridaParaAgregar() {
    return prendasSugeridasParaAgregar;
  }

  public static List<Prenda> getRopaSugeridaParaQuitar() {
    return prendasSugeridasParaQuitar;
  }

  public static List<Prenda> getPrendasSuperiores() {
    return prendasSuperiores;
  }

  public static List<Prenda> getPrendasInferiores() {
    return prendasInferiores;
  }

  public static List<Prenda> getPrendasAccesorios() {
    return prendasAccesorios;
  }

  public static List<Prenda> getPrendasCalzados() {
    return prendasCalzados;
  }

  public static void sugerirAgregarPrenda(Prenda prenda){
    prendasSugeridasParaAgregar.add(prenda);
  }

  public static void sugerirQuitarPrenda(Prenda prenda){
    prendasSugeridasParaQuitar.add(prenda);
  }

  public static void agregarPrendasSugeridas(){
    prendasAgregadas.addAll(prendasSugeridasParaAgregar);

    prendasSugeridasParaAgregar.stream().forEach(prenda -> agregarPrenda(prenda));

    prendasSugeridasParaAgregar.clear();
  }

  public static void quitarPrendasSugeridas(){
    prendasQuitadas.addAll(prendasSugeridasParaQuitar);

    prendasSugeridasParaQuitar.stream().forEach(prenda -> quitarPrenda(prenda));

    prendasSugeridasParaQuitar.clear();
  }

  public static void dehacerPrendasQuitdas(){
  prendasQuitadas.forEach(prenda -> agregarPrenda(prenda));
  prendasQuitadas.clear();
  }

  public static void deshacerPrendasAgregadas(){
    prendasAgregadas.forEach(prenda -> quitarPrenda(prenda));
    prendasAgregadas.clear();
  }
}
