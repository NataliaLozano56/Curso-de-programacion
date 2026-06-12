public class EjmploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Natalia";

        System.out.println("nombre.legth() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Natalia\") = " + nombre.equals("Natalia"));
        System.out.println("nombre.equals(\"natalia\") = " + nombre.equals("natalia"));
        System.out.println("nombre.equalsIgnoreCase(\"natalia\") = " + nombre.equalsIgnoreCase("natalia"));
        System.out.println("nombre.compareTo(\"Natalia\") = " + nombre.compareTo("Natalia"));
        System.out.println("nombre.compareTo(\"Natalia\") = " + nombre.compareTo("Maia"));
        System.out.println(" nombre.charAt(5) = " + nombre.charAt(5));
        System.out.println("nombre = " + nombre.substring(1));

        //aquí comienza la otra clase
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.starsWith = " + trabalenguas.startsWith("n"));
        System.out.println("trabalenguas.endWith = " + trabalenguas.endsWith("s"));
        System.out.println(  "trabalenguas"  );
        System.out.println(  "trabalenguas"  .trim());


    }





    }

