import java.util.Arrays;
import java.util.Scanner;

public class Ejeracicioabc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();

        System.out.print("Ingrese la letra: ");
        char letra = scanner.next().charAt(0);

        String[] arreglo = new String[]{Integer.toString(numero1), Integer.toString(numero2), Integer.toString(numero3), Character.toString(letra)};

        Arrays.sort(arreglo);
        System.out.println(Arrays.toString(arreglo));
    }}
