package repositorio.ListasProductos;

import modelos.Fruta;
import repositorio.AbstracLista;

public class ListaFruta extends AbstracLista<Fruta> {


    @Override
    public void Eliminar(String a) {
        this.data.remove(buscarProducto(a));
    }

    @Override
    public void Editar(Fruta fruta) {
        Fruta F = buscarProducto(fruta.getNombre());
        F.setNombre(fruta.getNombre());
        F.setPrecio(fruta.getPrecio());
    }
}
