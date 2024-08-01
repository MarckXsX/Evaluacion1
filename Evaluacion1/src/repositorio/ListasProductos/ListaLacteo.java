package repositorio.ListasProductos;

import modelos.Fruta;
import modelos.Lacteo;
import repositorio.AbstracLista;

public class ListaLacteo extends AbstracLista<Lacteo> {

    @Override
    public void Eliminar(String a) {
        this.data.remove(buscarProducto(a));
    }

    @Override
    public void Editar(Lacteo lacteo) {
        Lacteo L = buscarProducto(lacteo.getNombre());
        L.setNombre(lacteo.getNombre());
        L.setPrecio(lacteo.getPrecio());
    }
}
