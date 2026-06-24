import javax.swing.*;

public class practicaAi3 {
    public static void main(String[] args) {

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));

        String mensaje = edad >= 18 ? "Eres mayor de edad" : "Eres menor de edad";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
