import javax.swing.*;

public class practicaRetroalimentacion2 {
    public static void main(String[] args) {

        String palabra = JOptionPane.showInputDialog("Ingrese una palabra");

        boolean palabraA = palabra.toUpperCase().startsWith("A");

        boolean palabraE = palabra.toLowerCase().contains("e");

        String mensaje = "Su palabra fue: " + palabra + "\n¿La palabra comienza con la A?: " + palabraA + "\n¿La palabra contiene la letra E? " +
                palabraE;

        JOptionPane.showMessageDialog(null,mensaje);


    }
}
