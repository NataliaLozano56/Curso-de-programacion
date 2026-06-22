import javax.swing.*;

public class EjercicioOperadores1 {
    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog("Ingrese su nombre completo: ");
        System.out.println(nombre1);

        String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre completo de un familiar o amigo: ");
        System.out.println(nombre2);

        String nombre3 = JOptionPane.showInputDialog("Ingrese el nombre completo de un familiar o amigo: ");
        System.out.println(nombre3);

        String calculo = (nombre1.split(" ")[0].length() < nombre2.split( " ")[0].length()) ? nombre2 : nombre1;
        calculo = (nombre3.split(" ")[0].length() < calculo.split(" ")[0].length()) ? calculo : nombre3;

        String mensaje = "El nombre mas largo es:" + calculo;

        JOptionPane.showMessageDialog(null, mensaje);
    
    }
}
