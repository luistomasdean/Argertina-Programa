import java.util.Arrays;
import java.util.Scanner;

public class Ejerciciob {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orden[] = new int[]{13, 12, 55};
        String eleccion;
        orden = Arrays.stream(orden).sorted().toArray();

        System.out.print(" (Ascendente=A/Decreciente=D): ");
        eleccion = scanner.next();

        if (eleccion.equalsIgnoreCase("A")) {
            orden = Arrays.stream(orden).sorted().toArray();
            System.out.println(Arrays.toString(orden));

        }
        if (eleccion.equalsIgnoreCase("D")) {
            orden = Arrays.stream(orden).sorted().toArray();
            System.out.println(Arrays.asList(orden[2], orden[1], orden[0]));


        }
    }
}



