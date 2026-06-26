import javax.swing.*;

public class practicaRetroalimentacion3 {
    public static void main(String[] args) {

        String palabra = JOptionPane.showInputDialog("Ingrese una palabra");

        String palabraA = palabra.toLowerCase().replace("a", "*");

        JOptionPane.showMessageDialog(null,"la palabra que usaste fue: " + palabra + "\ny esta reemplazada seria: " +
                palabraA);

    }
}
