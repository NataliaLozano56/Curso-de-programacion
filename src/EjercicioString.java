import java.util.Scanner;

public class EjercicioString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre de un familiar o amigo:");
        String nombre1 = scanner.nextLine();

        System.out.println("Ingrese otro nombre de un familiar o amigo:");
        String nombre2 = scanner.nextLine();

        System.out.println("Ingrese otro nombre de un familiar o amigo:");
        String nombre3 = scanner.nextLine();

        String nombreFinal1 = nombre1.toUpperCase().charAt(1)
                + "." + nombre1.substring(nombre1.length() - 2);

        String nombreFinal2 = nombre2.toUpperCase().charAt(1)
                + "." + nombre2.substring(nombre2.length() - 2);

        String nombreFinal3 = nombre3.toUpperCase().charAt(1)
                + "." + nombre3.substring(nombre3.length() - 2);

        String resultado = nombreFinal1 + "_" + nombreFinal2 + "_" + nombreFinal3;

        System.out.println(resultado);

        //scanner.close();
    }
}

        //String nombre1 = "Natalia";
        //String nombre2 = "Pablo";
        //String nombre3 = "Beatriz";

        //String nombreFinal = nombre1.substring( 3-2).toUpperCase()  + "." + nombre1.substring(10-5);
        //System.out.println(nombreFinal);

        //String nombreFinal2 = nombre2.substring( 3-2).toUpperCase()  + "." + nombre2.substring(6-3);
        //System.out.println(nombreFinal2);

        //String nombreFinal3 = nombre3.substring( 3-2).toUpperCase()  + "." + nombre3.substring(10-5);
        //System.out.println(nombreFinal3);

        //String nombreFinal4 = nombreFinal + "_" + nombreFinal2 + "_" + nombreFinal3;
        //System.out.println(nombreFinal4);







