import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class supermercado {
    public static void main(String[] args) {

        Producto[] listaCompras = ingresarListaCompras();
        guardarLista(listaCompras, "src/lista_compras.txt");
        ItemCarrito itemCarrito = new ItemCarrito();
        itemCarrito.leerArchivo();
        Carrito miCarrito = new Carrito();
        miCarrito.costo();


    }

    public static Producto[] ingresarListaCompras() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        double precio;
        int cantidad;
        int numProductos = 0;

        System.out.print("Ingrese la cantidad de productos que desea comprar: ");
        numProductos = sc.nextInt();
        sc.nextLine();

        Producto[] lista = new Producto[numProductos];

        for (int i = 0; i < numProductos; i++) {
            System.out.print("Ingrese el nombre del producto: ");
            nombre = sc.nextLine();
            System.out.print("Ingrese el precio del producto: ");
            precio = sc.nextDouble();
            sc.nextLine();
            System.out.print("Ingrese cantidad del producto: ");
            cantidad = sc.nextInt();
            sc.nextLine();
            lista[i] = new Producto(nombre, precio, cantidad);
        }

        return lista;
    }

    public static void guardarLista(Producto[] lista, String archivo) {
        try {
            FileWriter writer = new FileWriter(new File(archivo));
            for (Producto p : lista) {
                writer.write(p.getNombre() + "," + p.getPrecio() + "," + p.getCantidad() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}