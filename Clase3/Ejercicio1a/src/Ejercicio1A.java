public class Ejercicio1A {
    private static Object Locale;

    public static void main(String[] args) {
        String cadenaDeTexto = "Argentina programa";

        char letra = 'a';
        int contador = 0;
        for (int i = 0; i < cadenaDeTexto.length(); i++) {

            if (cadenaDeTexto.toLowerCase().charAt(i) == letra) {
                contador++;

            }


        }
        System.out.println("La cantidad de veces que " + cadenaDeTexto + ",contiene la letra " + letra+" es: " + contador);
    }
}

