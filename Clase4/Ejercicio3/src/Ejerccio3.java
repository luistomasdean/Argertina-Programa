/*3. Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si es una
       codificación o decodificación, el valor del desplazo, y 2 archivos, uno para la entrada y
        otro para la salida. Que por pantalla solo indique si terminó o no correctamente, los
        resultados deben estar en el archivo de salida*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejerccio3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String eleccion;
        System.out.println("ELIJA CODIFICAR O DECODIFICAR?(c/d)");
        eleccion = scanner.next();


        if (eleccion.equalsIgnoreCase("c")) {
            System.out.println(" Ingrese mensaje");
            String mensaje = scanner.next();


            System.out.println(" desplazamiento");
            int desplazamiento = scanner.nextInt();


            System.out.println(sumatoria(desplazamiento, mensaje));

        }
        if (eleccion.equalsIgnoreCase("d")) {
String mensajeleido="";
            FileReader leer = new FileReader("Mensajeacodificar.txt");
            BufferedReader leerr = new BufferedReader(leer);
            String mensaje = leerr.readLine();

            FileReader despla = new FileReader("despalza.txt");
            BufferedReader desplas = new BufferedReader(despla);
            mensajeleido=desplas.readLine();
            int desplazamiento = Integer.parseInt(mensajeleido)*-1;



            System.out.println(sumatoria(desplazamiento, mensaje));

        }


    }

    private static String sumatoria(int pdesplazamiento, String ptexto) {
        String resultado = "";
        String desplasar = String.valueOf(pdesplazamiento);
        for (int i = 0; i < ptexto.length(); i++) {
            char caracter = ptexto.charAt(i);
            if (Character.isLetter(caracter)) {
                caracter = (char) ((caracter + pdesplazamiento -'a' ) % 26 + 'a');
            }
            resultado += caracter;

        }
        try {
            FileWriter fichero = new FileWriter("Mensajeacodificar.txt");
            fichero.write(resultado);
            fichero.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter desplaza = new FileWriter("despalza.txt");
            desplaza.write(desplasar);
            desplaza.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return resultado;

    }


}

