import java.util.Scanner;

public class OperdaorTernarioMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = sc.nextInt();

        System.out.println("Ingrese un numero");
        int num2 = sc.nextInt();

        System.out.println("Ingrese un numero");
        int num3 = sc.nextInt();

        max = (num1 > num2)? num1 : num2; // aqui lo que hacemos es comparar los tres numeros, para saber cual es mas grande-
        max = (max > num3)? max: num3;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("el numero mayor es = " + max);
    }
}
