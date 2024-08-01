package repositorio.ListasProductos;

import modelos.Lacteo;
import modelos.Limpieza;
import repositorio.AbstracLista;

public class ListaLimpieza extends AbstracLista<Limpieza> {


    @Override
    public void Eliminar(String a) {
        this.data.remove(buscarProducto(a));
    }

    @Override
    public void Editar(Limpieza limpieza) {
        Limpieza L = buscarProducto(limpieza.getNombre());
        L.setNombre(limpieza.getNombre());
        L.setPrecio(limpieza.getPrecio());
    }
}
