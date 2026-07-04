import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingrese otro número: ");
        int numero2 = sc.nextInt();

        int mayor = (numero1 >= numero2) ? numero1 : numero2;
        int menor = (numero1 >= numero2) ? numero2 : numero1;

        System.out.println("Orden de mayor a menor:");
        System.out.println(mayor);
        System.out.println(menor);

    }
}




