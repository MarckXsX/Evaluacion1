package repositorio;

import modelos.Fruta;
import modelos.Producto;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstracLista<T extends Producto> implements CrudProductos<T> {

    protected List<T> data;

    public AbstracLista(){
        this.data = new ArrayList<>();
    }
    @Override
    public List<T> listarProducto() {
        return this.data;
    }

    @Override
    public T buscarProducto(String a) {
        T resultado = null;
        for(T item: data){
            if(item.getNombre() != null && item.getNombre().equals(a)){
                resultado = item;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crearProducto(T a) {
        this.data.add(a);
    }
}
