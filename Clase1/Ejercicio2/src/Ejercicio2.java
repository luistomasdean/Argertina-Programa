import java.util.Scanner;

public class Ejercicio2 {
   


//Entradas : Ingresos ,vehiculos,inmuebles, embarcacion.
        //salida :Segmemento al que pernece.

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            float ingresos;
            int vehiculos;
            int inmuebles;
            boolean embarcacion;

            System.out.print("Ingresos mensuales totales del hogar: ");
            ingresos = scanner.nextFloat();

            System.out.print("cantidad de vehículos con antigüedad menor a 5 años: ");
            vehiculos = scanner.nextInt();

            System.out.print("Cantidad de inmuebles: ");
            inmuebles = scanner.nextInt();

            System.out.print("¿Posee una embarcación, una aeronave de lujo o es titular de activos societarios que demuestren capacidad económica plena? (true/false): ");
            embarcacion = Boolean.parseBoolean(scanner.next());

            if (ingresos >= 489083 || vehiculos >= 3 || inmuebles >= 3 || embarcacion) {
                System.out.println("Pertenece al segmento de ingresos altos.");
            } else {
                System.out.println("Pertenece al segmento de ingresos altos.");
            }
        }
    }


