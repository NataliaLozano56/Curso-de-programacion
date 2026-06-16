public class OperadorAsignacion {
    public static void main(String[] args) {

        int i = 5; // el operador es el igual, ew el que asigna un valor a una variable
        int j = i + 4;
        System.out.println("j = " + i);
        System.out.println("j = " + j);

        i = i + 2; // o se puede usar += para que sea mas facil y no escribir el "i+2"
        System.out.println("i = " + i);

        i += 5;
        System.out.println("i = " + i);

        // esto tambien se puede hacer con la resta
        j -= 4; // j = j - 4
        System.out.println("j = " + j);
        
        //esto sera lo mismo, para todos los operaodres aritmeticos 
        j *= 3;
        System.out.println("j = " + j);


    }
}
