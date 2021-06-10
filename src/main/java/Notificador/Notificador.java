package Notificador;

import Clima.Alerta;
import Repositorios.RepositorioUsuarios;
import Usuario.Usuario;

public class Notificador {
  private static final Notificador instance = new Notificador();
  public static Notificador getInstance(){
    return instance;
  }

  public void notificarUsuarios(Alerta alerta){
    RepositorioUsuarios.getInstance().getUsuarios().forEach(usuario -> notificarUsuario(alerta, usuario));
  }

  public void notificarUsuario (Alerta alerta, Usuario usuario){
    if(usuario.prefiereMails() ){
      // se manda mail y dependiendo de si hay granizo o tormentacon ifs manda determinado mail Mailer.send(usuario.mail(), "texto alerta")
    }
    else {
      // notificar texto en pantalla y dependiendo de si hay granizo o tormenta con ifs manda determinado mensaje NotificationService.notify("texto alertay dependiendo de si hay granizo o tormenta manda determinado")
    }
  }
}
