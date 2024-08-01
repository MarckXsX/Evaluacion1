package modelos;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T extends Producto>  {
    private List<T> productos;
    private static final int MAX_PRODUCTO = 5;

    public BolsaSupermercado(){
        this.productos = new ArrayList<>();
    }


    public List<T> getProductosr() {
        return this.productos;
    }

    public void addProducto(T a) {
        if(productos.size()<MAX_PRODUCTO){
            this.productos.add(a);
        }else{
            throw new RuntimeException("Maximo de productos alcanzados");
        }
    }

}
