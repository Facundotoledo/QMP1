package domain.atuendo;

import java.util.Collections;
import java.util.List;

public class atuendo {
    private List<Prenda> prendas;

    public void cargarPrenda(Prenda ... prenda){
        Collections.addAll(this.prendas, prenda);
    }
}
