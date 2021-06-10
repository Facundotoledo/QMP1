package Repositorios;

import Clima.Alerta;
import Clima.AlertasEnBuenosAires;
import Clima.ClimaEnBuenosAires;
import Notificador.Notificador;

import java.util.List;

public class RepositoriosAlretas {
  private List<Alerta> alertas;

  // Lo hace el/la empleade
  public void actualizarAlertas(){
    this.alertas = AlertasEnBuenosAires.getInstance().getAlertasBuenosAiresAhora();

    if(alertas.contains(Alerta.GRANIZO)) {
      Notificador.getInstance().notificarUsuarios(Alerta.GRANIZO);
    }

    if(alertas.contains(Alerta.TORMENTA)) {
      Notificador.getInstance().notificarUsuarios(Alerta.TORMENTA);
    }
  }
  }

