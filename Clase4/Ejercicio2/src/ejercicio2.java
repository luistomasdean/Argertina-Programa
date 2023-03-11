import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2 {


    public static void main(String[] args) {


        File file = new File("src/numeros.txt");
        int[] array = null;
//************************************************
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] tokens = line.split(",");

            array = new int[tokens.length];


            for (int i = 0; i < tokens.length; i++) {
                array[i] = Integer.parseInt(tokens[i].trim());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        for (int i = 0; i < array.length; i++) {
            ;
        }
        System.out.println("El documento tiene los numeros :"+ Arrays.toString(array));
        ////++++++++++++++++++++++++++++++++++++++++++++++
        Scanner scanner = new Scanner(System.in);
        String eleccion;
        System.out.println("ELIJA SUMAR O MULTIPLICAR?(s/m)");
        eleccion = scanner.next();


        if (eleccion.equalsIgnoreCase("s")) {
            System.out.println(suma(array));

        }
        if (eleccion.equalsIgnoreCase("m")) {


            System.out.println(multiplcacion(array));
        }

    }

//****************************************************
    public static int suma(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = array[i] + suma;
        }

        return suma;

    }
//***************************************************
    public static int multiplcacion(int[] array) {
        int multiplicacion = 1;
        for (int i = 0; i < array.length; i++) {
            multiplicacion *= array[i];
        }
        return multiplicacion;
    }

}

