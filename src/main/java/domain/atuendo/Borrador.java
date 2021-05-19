package domain.atuendo;

import Validaror.AlgunaVariableEsNullException;

public class Borrador {
  private TipoPrenda tipo;
  private Categoria categoria;
  private Material material;
  private Color color;
  private Color colorSecundario;
  private Trama trama;
  private Integer temperaturaMaxima;

  public Borrador setTipo(Tipo tipo) {
    this.tipo = tipo.getTipo();
    this.categoria = tipo.getCategoria();
    return this;
  }


  public Borrador setDisenio(Disenio disenio) {

    this.material = disenio.getterMaterial();
    this.color = disenio.getterColor();
    this.colorSecundario = disenio.getterColorSecundario();

    if( disenio.getterTrama() == null ){
      this.trama = Trama.LISA;
    } else {
      this.trama = disenio.getterTrama();
    }
    return this;
  }

  public Borrador setTemperatura(Integer temperaturaMaxima){
    this.temperaturaMaxima = temperaturaMaxima;
    return this;
  }


  public Prenda build() throws AlgunaVariableEsNullException {
    if(this.esPrendaValida()){
      if(colorSecundario == null) { return new Prenda(tipo, categoria, material, color, trama); } else { return new Prenda(tipo, categoria, material, color, colorSecundario, trama, temperaturaMaxima); }
      } else { throw new AlgunaVariableEsNullException();}
    }

    public Boolean esPrendaValida(){
     return !(tipo == null && categoria == null && color == null && trama == null);
    }

  }


