package repositorio;

import java.util.List;

public interface CrudProductos<T> {
    List<T> listarProducto();
    void crearProducto(T a);
    T buscarProducto(String a);
    void Eliminar(String a);
    void Editar(T t);
}
