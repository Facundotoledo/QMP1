package domain.atuendo;

import java.util.Arrays;
import java.util.List;

public class RepositorioPrendas {

  private static List<Prenda> prendasSuperiores = Arrays.asList();
  private static List<Prenda> prendasInferiores = Arrays.asList();
  private static List<Prenda> prendasAccesorios = Arrays.asList();
  private static List<Prenda> prendasCalzados = Arrays.asList();
  private static RepositorioPrendas INSTANCE = new RepositorioPrendas();

  public static RepositorioPrendas getInstance() {
    return INSTANCE;
  }

  public static void agregarPrenda(Prenda prenda) {
    switch (prenda.getCategoria()){
      case PARTESUPERIOR: prendasSuperiores.add(prenda);
      case CALZADO: prendasCalzados.add(prenda);
      case ACCESORIO: prendasAccesorios.add(prenda);
      case PARTEINFERIOR: prendasInferiores.add(prenda);
    }
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
}
