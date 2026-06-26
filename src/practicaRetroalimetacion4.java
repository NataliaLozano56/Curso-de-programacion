import javax.swing.*;

public class practicaRetroalimetacion4 {
    public static void main(String[] args) {

        String palabra = JOptionPane.showInputDialog("Ingrese una palabra:");

        String palabra2 = JOptionPane.showInputDialog("Ingrese otra palabra:");

        boolean comparar =  palabra.equals(palabra2);

        int alfabeto = palabra.compareTo(palabra2 );

        String resultado;

        if (alfabeto < 0) {
            resultado = palabra + " va primero alfabéticamente.";
        } else if (alfabeto > 0) {
            resultado = palabra2 + " va primero alfabéticamente.";
        } else {
            resultado = "Las dos palabras son iguales.";
        }

        String mensaje = "La primera palabra fue: " + palabra + "\nLa segunda palabra fue: " + palabra2 + "\n¿Las palabras son iguales?: " +
               comparar + "\n¿Cual de las dos va primero alfabeticamente?: " + resultado;

        JOptionPane.showMessageDialog(null,mensaje);
    }
}
