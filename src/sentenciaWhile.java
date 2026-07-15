public class sentenciaWhile {
    public static void main(String[] args) {

        int i = 0;
        while (i <= 5) { //el while primero prueba y luego ejecuta el codigo
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;

        while (prueba) {

            if (i == 7) {
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        prueba = false;
        do {
            System.out.println("Se ejecuta al menos una vez");
        } while (prueba);


    }
}
