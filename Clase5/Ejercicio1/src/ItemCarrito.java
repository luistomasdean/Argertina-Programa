import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ItemCarrito {

    public static void leerArchivo() {


        File archivo = new File("src/lista_compras.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(archivo);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }

        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            String[] partes = linea.split(",");

            String nombre = partes[0];
            double precio = Double.parseDouble(partes[1]);
            int cantidad = Integer.parseInt(partes[2]);


            System.out.println("nombre del producto :" + nombre);
            System.out.println("precio :" + precio);
            System.out.println("cantidad :" + cantidad);


        }

        scanner.close();
    }
}


