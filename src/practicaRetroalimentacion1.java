import java.util.Scanner;

public class practicaRetroalimentacion1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();

        char nombrePrimeraLetra = nombre.toUpperCase().charAt(0);

        char nombreLetraFinal = nombre.charAt(nombre.length()- 1);

        int cantidadLetras = nombre.length();

        System.out.println("La primera letra de tu nombre es: " + nombrePrimeraLetra +
                "\nLa ultima letra de tu nombre es: " + nombreLetraFinal +
                "\nLa cantidad de letras de tu nombre es: " + cantidadLetras);

    }
}
