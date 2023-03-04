public class EjerccioC {
    public static void main(String[] args) {
        int numeros[] = new int[]{13, 12, 55,90,100};
        int resultado = 0;
        int x=3;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > x) {
                resultado += numeros[i];
            }
        }
        System.out.println(resultado);
    }
        
    }

