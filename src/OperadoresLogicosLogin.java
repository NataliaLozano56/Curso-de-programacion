import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String username = "Natalia";
        String password = "Maria123";

        String username2 = "Tohru";
        String password2 = "Kyou";

        Scanner sc = new Scanner((System.in));

        System.out.println("Ingrese el Username");

        String u = sc.nextLine();

        System.out.println("Ingrese el password");
        String p = sc.nextLine();

        boolean esAutentico = false;

        if (username.equals(u) && password.equals(p) || username2.equals(u) && password2.equals(p) ) {
            esAutentico = true; //para comparar una igualdad entre dos valores del tipo String
        } else {
            System.out.println("Username o contraseña no valida");
        }

        if (esAutentico) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));

        } else {
            System.out.println("lo siento, requiere autentificación");
        }
    }
}