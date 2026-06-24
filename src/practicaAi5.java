import java.util.Scanner;

public class practicaAi5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();

        String nombreMayuscula = nombre.substring(0,1).toUpperCase();

        String nombreUltimasLetras = nombre.substring(nombre.length()-2);

        int caracteres = nombre.length();

        System.out.println(nombreMayuscula + "-" + nombreUltimasLetras + "-" + caracteres);
    }
}
