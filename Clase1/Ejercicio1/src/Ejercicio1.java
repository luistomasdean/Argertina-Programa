import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroInicial = 5;
        int numeroFinal = 14;
        System.out.println("Ejercio A:");

        while (numeroInicial <= numeroFinal) {
            System.out.print(numeroInicial + ", ");
            numeroInicial++;
        }
        System.out.println("");
        System.out.println("Ejercio B y D:");
        numeroInicial = 5;
        for (int i = numeroFinal; i >= numeroInicial; i--) {
            if (i % 2 == 0) {
                System.out.println("par " + i);
            }
        }


        System.out.println("Ejercio C:");
        boolean mostrarPoI;
        System.out.print("Mostrar Pares o Impares? (true=par/false= impar): ");
        mostrarPoI = Boolean.parseBoolean(scanner.next());
        for (int i = numeroInicial; i <= numeroFinal; i++) {
            if (i % 2 == 0 && mostrarPoI) {
                System.out.println("par " + i);
            } else if (i % 2 != 0 && !mostrarPoI) {
                System.out.println("Impar " + i);
            }
        }


        }
    }