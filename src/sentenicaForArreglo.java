import javax.swing.*;

public class sentenicaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Andres", "Natalia", "Maria", "Mariana","Jose","Pablo","Jhon","Beatriz"};
        int count = nombres.length;
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase("Andres") ||
                    nombres[i].equalsIgnoreCase("Beatriz".toUpperCase())){
                    continue; // aqui esa para ignorar si es lo queremos ignorar algunas parte, tambien podemos usar el metodo contains
            }
            System.out.println(i + "-" + nombres[i]);
        }
        //en este ejemplo queremos buscar un nombre
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, como \"Maria\" :");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, buscar + " Fue encontrado!");
        }else{
            JOptionPane.showMessageDialog(null, buscar +" No existe en el sistema");
        }
    }
}
