import modelos.Fruta;
import modelos.Producto;
import repositorio.CrudProductos;
import repositorio.ListasProductos.ListaFruta;

import java.util.List;

public class MainProductos {
    public static void main(String[] args) {

        CrudProductos<Fruta> Fruta = new ListaFruta();
        Fruta.crearProducto(new Fruta("Mango",6.25,16,"Verdde"));
        Fruta.crearProducto(new Fruta("Pera",7.25,17,"Verdde"));
        Fruta.crearProducto(new Fruta("Uva",1.25,6,"Verdde"));
        List<Fruta> misFrutas = Fruta.listarProducto();
        for (Fruta item: misFrutas){
            System.out.println("Nombre: " + item.getNombre());
            System.out.println("Precio: " + item.getPrecio());
            System.out.println("Peso: " + item.getPeso());
            System.out.println("Color: " + item.getColor());
            System.out.println("\n");
        }

        Fruta Frutita = new Fruta("Mango",8.25,16,"Doradito");
        Fruta encontrada = Fruta.buscarProducto("Mango");
        System.out.println("encontrada.getNombre() = " + encontrada.getNombre());
        System.out.println("encontrada.getNombre() = " + encontrada.getPrecio());

        System.out.println(" === Edicion ===");
        Fruta.Editar(Frutita);
        for (Fruta item: misFrutas){
            System.out.println("Nombre: " + item.getNombre());
            System.out.println("Precio: " + item.getPrecio());
            System.out.println("Peso: " + item.getPeso());
            System.out.println("Color: " + item.getColor());
            System.out.println("\n");
        }

        System.out.println(" === Eliminacion ===");
        Fruta.Eliminar("Mango");
        for (Fruta item: misFrutas){
            System.out.println("Nombre: " + item.getNombre());
            System.out.println("Precio: " + item.getPrecio());
            System.out.println("Peso: " + item.getPeso());
            System.out.println("Color: " + item.getColor());
            System.out.println("\n");
        }



    }
}
