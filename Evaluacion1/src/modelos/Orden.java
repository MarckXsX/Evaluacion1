package modelos;

import java.util.ArrayList;
import java.util.List;

public class Orden {

    //private int id;
    //private static int idcontador;
    private List<BolsaSupermercado<? extends Producto>> bolsas;

    public Orden(){
        this.bolsas = new ArrayList<>();
    }


    public void agregarBolsa(BolsaSupermercado<? extends Producto> bolsa) {
        this.bolsas.add(bolsa);
    }


    public List<BolsaSupermercado<? extends Producto>> getBolsas() {
        return bolsas;
    }


}
