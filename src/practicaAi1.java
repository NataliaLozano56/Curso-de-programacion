import javax.swing.*;

public class practicaAi1 {
    public static void main(String[] args) {

       String nombre = JOptionPane.showInputDialog("Ingrese su nombre completo");
        System.out.println("nombre = " + nombre);

        String nombreMayuscula = nombre.toUpperCase();

        String nombreMinuscula = nombre.toLowerCase();

        char nombreLetra = nombre.charAt(0);

        String nombre3letras = nombre.substring(nombre.length()-3);

        JOptionPane.showMessageDialog(null, "Nombre en Mayuscula: " + nombreMayuscula + "\n Nombre en Minuscula: "
        + nombreMinuscula + "\nNombre con primera letra: " + nombreLetra + "\nNombre ultimas tres letras: " + nombre3letras);



    }
}
