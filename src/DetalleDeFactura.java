import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura: ");

        String factura = sc.nextLine();

        System.out.println("Ingrese el valor de un Jugo: ");
        double valorJugo = sc.nextDouble();

        System.out.println("Ingrese el valor de un Almuerzo: ");
        double valorAlmuerzo = sc.nextDouble();


        double subtotal = valorJugo + valorAlmuerzo;
        double iva = subtotal * (19.0/100.0);
        double total = subtotal + iva;

        String mensaje = "La factura producto del consumidor tiene un total bruto de " + subtotal + ",con un impuesto de " + iva + " ,por lo que, el monto después de impuesto es de " + total;

        System.out.println(mensaje);
    }
}