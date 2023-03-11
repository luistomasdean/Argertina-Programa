import java.io.*;
import java.util.Scanner;

public class Carrito {
    public double costo() {
        double costoTotal = 0;

        Descuento descuento10 = new Descuento(0.5);


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


            double precio = Double.parseDouble(partes[1]);
            int cantidad = Integer.parseInt(partes[2]);
            costoTotal += (precio * cantidad);


        }

        scanner.close();
        System.out.println("Costo total :" + costoTotal);
        Descuento descuento20 = new Descuento(0.5);

        System.out.println("Precio final con descuento de 50%  = " + descuento10.calcularDescuento(costoTotal));


        return costoTotal;
    }


}






