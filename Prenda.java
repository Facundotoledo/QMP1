package domain.atuendo;

public class Prenda {
    private TipoPrenda tipo;
    private Categoria categoria;
    private Material material;
    private Color color;
    private Color colorSecundario;
    private Trama trama;


    public Prenda(TipoPrenda tipo, Categoria categoria, Material material, Color color, Color colorSecundario, Trama trama) {
        this.tipo = tipo;
        this.categoria = categoria;
        this.material = material;
        this.color = color;
        this.colorSecundario = colorSecundario;
        this.trama = trama;
    }

    public Prenda(TipoPrenda tipo, Categoria categoria, Material material, Color color, Trama trama) {
        this.tipo = tipo;
        this.categoria = categoria;
        this.material = material;
        this.color = color;
        this.trama = trama;
    }

}