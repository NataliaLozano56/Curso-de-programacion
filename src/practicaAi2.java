import java.util.Scanner;

public class practicaAi2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra1 = sc.nextLine();

        System.out.println("Ingrese otra palabra");
        String palabra2 = sc.nextLine();

        boolean palabrafinal = palabra1.equals(palabra2);
        boolean palabraFinal1 = palabra1.startsWith("A");
        boolean palbraFinal2 = palabra2.startsWith("A");

        System.out.println("las palabras que escribiste son iguales? = " + palabrafinal +
                "\n Las palabra 1 empieza por a? = " + palabraFinal1 +
                "\n La palabra 2 empieza por a? = " + palbraFinal2);


    }
}
