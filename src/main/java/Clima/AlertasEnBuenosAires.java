package Clima;

import java.util.List;
import java.util.Map;

public class AlertasEnBuenosAires {

  private static AlertasEnBuenosAires instance= new AlertasEnBuenosAires();

  public static AlertasEnBuenosAires getInstance() {
    return instance;
  }

  public List<Alerta> getAlertasBuenosAiresAhora(){
    List<Alerta> alertas = new AccuWeatherAPI().getAlertas();
    return alertas;
  }
}
