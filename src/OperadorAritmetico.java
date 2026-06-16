import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {

        int i = 5;  // tambien se puede hacer de esta forma en la misma linea - int i = 5 , j = 4;
        int j = 4;  // igual la suma - int i = 3, j = 4, suma = i + j

        int suma = i + j;

        System.out.println("suma = " + suma);
        System.out.println("i + j = " + (i + j));
        
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i - j = " + (i-j));

        int multiplicacion = i * j;
        System.out.println("multiplicacion = " + multiplicacion);
        
        int division = i / j;
        float divsion2 = (float) i / (float) j; // usamos este float, para que nos de los decimales completos
        System.out.println("division = " + division);
        System.out.println("divsion2 = " + divsion2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
        if (numero % 2 == 0){
            System.out.println("numero par = " + numero);
        }else{
            System.out.println("numero impar = " + numero);
        }
    }
}
