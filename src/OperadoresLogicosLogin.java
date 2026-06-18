import java.util.Scanner;

public class OperadoresLogicosLogin {

    public static void main(String[] args) {

        String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = " Natalia";
        passwords[0] = " Maria123";

        usernames[1] = " Tohru";
        passwords[1] = " Kyou";

        usernames[2] = " Risa";
        passwords[2] = " Otani";

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el Username");
        String u = sc.nextLine();

        System.out.println("Ingrese el password");
        String p = sc.nextLine();

        boolean esAutentico = false;

        for (int i = 0; i < usernames.length; i++) { // aqui hicimos el cambio en la clase operador ternario
            esAutentico = (usernames[i].equals(u) && passwords[i].equals(p))? true : esAutentico;

            //if (usernames[i].equals(u) && passwords[i].equals(p)) {

                //esAutentico = true;
                //break;
            //}
        }

        String mensaje = esAutentico ? "Bienvenido usuario".concat(u).concat("!") :
                "Username o contraseña incorrecta! \n Lo sentimos, requiere autenticacion";
        System.out.println(mensaje);

        //if (esAutentico) {

           // System.out.println("Bienvenido usuario " + u + "!");

        //} else {

           // System.out.println("Username o contraseña no válida");
          //  System.out.println("Lo siento, requiere autentificación");
      //  }
    }
}

