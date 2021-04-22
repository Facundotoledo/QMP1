package domain.atuendo;

public class Prenda {
    private Tipo tipo;
    private Categoria categoria = tipo.getCategoria();
    private String material;
    private String color;
    private String colorSecundario;
}