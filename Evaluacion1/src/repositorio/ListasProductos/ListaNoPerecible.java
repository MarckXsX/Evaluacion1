package repositorio.ListasProductos;

import modelos.Lacteo;
import modelos.NoPerecible;
import repositorio.AbstracLista;

public class ListaNoPerecible extends AbstracLista<NoPerecible> {

    @Override
    public void Eliminar(String a) {
        this.data.remove(buscarProducto(a));
    }

    @Override
    public void Editar(NoPerecible noPerecible) {
        NoPerecible No = buscarProducto(noPerecible.getNombre());
        No.setNombre(noPerecible.getNombre());
        No.setPrecio(noPerecible.getPrecio());
    }
}
