public class PresedenciaDeLosOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 28;

        double promedio = (i + j + k) / 3d; //la prioridad siempre debe de ser el parantesis, para que de el resultado correcto
        System.out.println("promedio = " + promedio);

        promedio = i + j + k / 3d * 10; // aqui estamos observando, quien tiene la prioridad, si la division o multiplicacion
        System.out.println("promedio = " + promedio);

        promedio = ++i + j-- + k / 3d * 10; // aqui estamos haciendo el pre incremento y el post decremento
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
