//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class cadenas {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numero int: " + numeroInt);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicStr = "true";
        boolean logicBoolean = Boolean.parseBoolean(logicStr);
        System.out.println("logicBoolean = " + logicBoolean);

        //Aquí empieza la otra clase
        int otroNumeroInt = 100;

        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr+100);

        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        //Aquí comienza la clase dos

        int i = 327680;
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
    }
}
