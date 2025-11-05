public class App {
    public static void main(String[] args) throws Exception {
        int numeroIntroducido = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero positivo: "));

        int numero = numeroIntroducido;
        int volteado = 0;
        int longitud = 0;

        while (numero > 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
            longitud++;
        }

        int cifra = 0;

        for (int i = 0; i < longitud; i++) {
            cifra = volteado % 10;
            volteado /= 10;
            for (int j = 0; j < cifra; j++) {
                System.out.print("|");
            }
            if (i < longitud-1)
                System.out.print("-");
        }

        
    }
}
