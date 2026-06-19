import java.awt.geom.Arc2D;

public class OperadorInstancedOf {
    public static void main(String[] args) {

        Object texto = new String("Creando un objeto del tipo String"); // aqui cambiamos de string a object, pero eso no cambia nada, ya que la cadena sigue siendo string

        Number num = Integer.valueOf(7); // y el interger lo cambiamos por Number

        Boolean b1 = texto instanceof String;
        System.out.println("texto del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto del tipo objeto = " + b1);

        b1 = num instanceof Integer;
        System.out.println("numero del tipo interger = " + b1);

        b1 = num instanceof Number;
        System.out.println("numero del tipo interger = " + b1);

        b1 = num instanceof Object;
        System.out.println("numero del tipo interger = " + b1);

        b1 = num instanceof Long; // esto es falsoo, no es del tipo long
        System.out.println("numero del tipo Long = " + b1);

        b1= num instanceof Double; //este tambien es falso, por que es un numero entero
        System.out.println("numero del tipo Double = " + b1);

        Number decimal = Float.valueOf(45.54f) ; //aqui cambiamos de Duble a Number
        b1 = decimal instanceof Double;
        System.out.println("decimal del tipo Double = " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal del tipo FLoat = " + b1);

        b1 = decimal instanceof Integer;
        System.out.println("decimal del tipo Integerv  = " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal del tipo number = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 del tipo boolean = " + b1);
    }
}
