import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class sistemasNumericosEntradaSccaner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");

        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt();// Integer.parseInt(numeroStr);
        } catch (InputMismatchException e){
            System.out.println("Error, ingrese un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);


        String mensajeOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);


        String mensajeHexagesimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHexagesimal;

        System.out.println(mensaje);;
    }
}