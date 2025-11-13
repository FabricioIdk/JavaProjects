package c03_strings;

public class Strings {
    public static void main(String[] args) {
        // Cadenas de texto

        String name = "Fabricio";
        var username = new String("Jaramillo");

        // Concatenación
        System.out.println(name + " " + username);

        // Length, retorna la longitud del string
        System.out.println(name.length());

        // charART, obtener caracter
        System.out.println(name.charAt(1));
        // es decir que el .length lee la longitud y -1, sería el último caracter
        System.out.println(name.charAt(name.length() - 1));

        // Subcadena-substring
        System.out.println(name.substring(2));
        // lee lo que hay entre el índice 1 al 3, excluye el índice final
        System.out.println(name.substring(1, 3));

        // toUpperCase/toLowerCase
        System.out.println(name.toUpperCase());// imprime todo mayuscula
        System.out.println(name.toLowerCase());// imprime todo minuscula

        // contains, comprobar si contiene
        System.out.println("Hola, Java".contains("Fabricio"));
        System.out.println("Hola, Java".contains("ava"));
        System.out.println("Hola, Java".contains("AVA"));

        // equals, comparación si una cadena de texto es igual a otra
        System.out.println("Comparación con equals: ");
        System.out.println(name.equals("Fabricio"));
        // el .equalsIgnoreCase ignora si es mayuscula o minuscula
        System.out.println(name.equalsIgnoreCase("fabricio"));

        // Trim
        System.out.println("  Hola, mundo ".trim());// elimina espacios de inicio y final

        // Replace
        // el caracter antiguo es reemplazado por uno nuevo
        System.out.println(" Hola, mundo   ".replace("Fabricio", "Drako"));

        // Format
        var age = 24;
        System.out.println(String.format("Hola, %s. Tengo %d años.", name, age));

    }
}
