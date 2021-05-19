package Clima;

import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class ClimaEnBuenosAires {

  public Integer condicionesBuenosAiresAhora(){
    Map<String, Object> climaActual = new AccuWeatherAPI().getWeather("Buenos Aires, Argentina").get(0);
    HashMap<String, Object> temp = (HashMap<String, Object>) climaActual.get("Temperature");
    return (int) temp.get("Value");
  }

}
