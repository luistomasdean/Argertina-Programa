public class Ejercicio2 {
    public static void main(String[] args) {
        String mensaje = "abcdefghijklmnñopqrstuvwxyz";

        String resultado = "";
        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);
            if (Character.isLetter(caracter)) {
                char desplazamiento = 1;
                caracter = (char) ((caracter + desplazamiento - 'a') % 26 + 'a');
            }
            resultado += caracter;
        }
        System.out.println(resultado);
    }
}

