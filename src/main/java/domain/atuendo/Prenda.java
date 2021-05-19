package domain.atuendo;

import Clima.AccuWeatherAPI;
import Clima.ClimaEnBuenosAires;

public class Prenda {
    private TipoPrenda tipo;
    private Categoria categoria;
    private Material material;
    private Color color;
    private Color colorSecundario;
    private Trama trama;
    private Integer temperaturaMaxima;


    public Prenda(TipoPrenda tipo, Categoria categoria, Material material, Color color, Color colorSecundario, Trama trama, Integer temperaturaMaxima) {
        this.tipo = tipo;
        this.categoria = categoria;
        this.material = material;
        this.color = color;
        this.colorSecundario = colorSecundario;
        this.trama = trama;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public Prenda(TipoPrenda tipo, Categoria categoria, Material material, Color color, Trama trama) {
        this.tipo = tipo;
        this.categoria = categoria;
        this.material = material;
        this.color = color;
        this.trama = trama;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public boolean usableAhora() {
        return temperaturaMaxima < ClimaEnBuenosAires.
    }
}