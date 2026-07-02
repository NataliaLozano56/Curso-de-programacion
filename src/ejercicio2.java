import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de gasolina que tiene su vehiculo actualmente: ");
        int tanque = sc.nextInt();

       //int tanque1 = 70; - NO TIENE NINGUNA FUNCION EN EL CODIGO

        if(tanque < 0 || tanque > 70 ){
            System.out.println("Cantidad invalida");
        } else if (tanque >= 60 && tanque < 70){
            System.out.println("El tanque esta casi lleno");
        } else if (tanque >= 40 && tanque < 60){
            System.out.println("El tanque en 3/4");
        } else if (tanque >= 35 && tanque < 40){
            System.out.println("El tanque esta medio lleno");
        } else if (tanque >= 20 && tanque < 35){
            System.out.println("El tanque es suficiente");
        } else if (tanque == 70) {
            System.out.println("El tanque esta lleno");
        } else {
            System.out.println("El tanque es insuficiente");
        }

    }
}
