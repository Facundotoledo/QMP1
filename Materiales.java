package domain.atuendo;

public class Materiales {
  private Trama trama = Trama.LISA;
  private Material material;
  private Color color;
  private Color colorSecundario;

  public Trama getterTrama(){
    return trama;
  }

  public Material getterMaterial(){
    return material;
  }

  public Color getterColor(){
    return color;
  }

  public Color getterColorSecundario(){
    return colorSecundario;
  }
}
