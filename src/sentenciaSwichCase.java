import java.util.Scanner;

public class sentenciaSwichCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes entre 1 -12 : ");

        int mes = sc.nextInt();
        String nombreMes = null;

        switch (mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Indefinido";

        }

        System.out.println("Nombre del mes = " + nombreMes);


        int num = 'z';// tambien puede usar Interger, int, short, char
        switch(num){

            case 0:
                System.out.println("el num es cero");
                break;
            case 1:
                System.out.println("el num es uno");
                break; // aqwi nos salimos del swicth, y si no tiene break, continua con los demas casos en cadena, hasta que encuentre el break necesario
            case 2:
                System.out.println("el num es dos");
                break;
            case 3:
                System.out.println("el num es tres");
                break;

        }

        String nombre = "Natalia";

        switch (nombre){
            case "admin":
                System.out.println("Hola admin, bienvenido");
                break;
            case "Natalia":
                System.out.println("Hola, Natalia!");
                break;
            case "Mariana":
                System.out.println("Hola, Mariana!");
                break;
            default:
                System.out.println("Usuario desconocido");
        }
    }
}
