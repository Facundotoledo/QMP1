package domain.atuendo;

class AlgunaVariableEsNullException extends Exception {
}

public class Borrador {
  private TipoPrenda tipo;
  private Categoria categoria;
  private Material material;
  private Color color;
  private Color colorSecundario;
  private Trama trama;

  public Borrador setTipo(Tipo tipo) {
    this.tipo = tipo.getTipo();
    this.categoria = tipo.getCategoria();
    return this;
  }


  public Borrador setMaterial(Materiales tela) {

    this.material = tela.getterMaterial();
    this.color = tela.getterColor();
    this.colorSecundario = tela.getterColorSecundario();

    if( tela.getterTrama() == null ){
      this.trama = Trama.LISA;
    } else {
      this.trama = tela.getterTrama();
    }
    return this;
  }


  public Prenda build() throws AlgunaVariableEsNullException {
    if(this.esPrendaValida()){
      if(colorSecundario == null) { return new Prenda(tipo, categoria, material, color, trama); } else { return new Prenda(tipo, categoria, material, color, colorSecundario, trama); }
      } else { throw new AlgunaVariableEsNullException();}
    }

    public Boolean esPrendaValida(){
     return !(tipo == null && categoria == null && color == null && trama == null);
    }

  }


