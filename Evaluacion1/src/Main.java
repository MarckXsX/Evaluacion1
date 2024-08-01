import modelos.*;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BolsaSupermercado<Fruta> Frutas = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> Limpiezas = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> Lacteos = new BolsaSupermercado<>();

        Frutas.addProducto(new Fruta("Platano",5.25,15,"Amarillo"));

        Limpiezas.addProducto(new Limpieza("aromatizante", 1.56, "esencia de coco", 16));
        Limpiezas.addProducto(new Limpieza("jabon de mano", 1.2, "esencia de vanilla", 2));

        Lacteos.addProducto(new Lacteo("Leche",16.50,10,500));
        Lacteos.addProducto(new Lacteo("Crema",1.50,10,500));
        Lacteos.addProducto(new Lacteo("Queso",6.50,10,500));

        System.out.println(" ======== Frutas ========" );
        for(Fruta item: Frutas.getProductosr()){
            System.out.println("Nombre: " + item.getNombre());
            System.out.println("Precio: " + item.getPrecio());
            System.out.println("Peso: " + item.getPeso());
            System.out.println("Color: " + item.getColor());
        }
        System.out.println(" ================" );

        System.out.println(" ======== Limpieza ========" );
        for(Limpieza item: Limpiezas.getProductosr()){
            System.out.println("Nombre: " + item.getNombre());
            System.out.println("Precio: " + item.getPrecio());
            System.out.println("Peso: " + item.getComponentes());
            System.out.println("Color: " + item.getLitros());
        }
        System.out.println(" ================" );

        Orden orden1 = new Orden();
        orden1.agregarBolsa(Frutas);
        orden1.agregarBolsa(Limpiezas);
        orden1.agregarBolsa(Lacteos);

        System.out.println(" ======== Producto de las bolsas de la orden ======" );
        for(BolsaSupermercado<? extends Producto> bolsa: orden1.getBolsas()){
            for(Producto item: bolsa.getProductosr()){
                System.out.println("Nombre: " + item.getNombre() + " Precio: " + item.getPrecio());
            }
        }
    }
}