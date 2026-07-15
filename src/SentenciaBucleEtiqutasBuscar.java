public class SentenciaBucleEtiqutasBuscar {
    public static void main(String[] args) {

        String frase = "trigoTres tristres tigres tragan trigo en un trigal";
        String palabra = "tragan";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;


        int cantidad = 0;
        char letra = 'g';
        buscar:
        for (int i = 0; i <= maxFrase; i++) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra; // aqui solo automatizamos un poco el codigo, pero sigue haciendo lo mismo
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra " + palabra + " en la frase ");
    }
}
