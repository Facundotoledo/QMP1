package Repositorios;

import Usuario.Usuario;
import domain.atuendo.GuardaRopas;
import domain.atuendo.Prenda;

import java.util.List;

public class RepositorioUsuarios {
  private static RepositorioUsuarios instance = new RepositorioUsuarios();
  List<Usuario> usuarios;


  public static RepositorioUsuarios getInstance(){
    return instance;
  }

  //Lo hace el/la empleade TODO ver como hacer para que se calcule la prenda
  public void enviarSugerenciaDiaria(Prenda prenda){
    usuarios.stream().forEach(usuario -> usuario.setSugerenciaDiaria(prenda));
  }

  public List<Usuario> getUsuarios() {
    return usuarios;
  }
}
