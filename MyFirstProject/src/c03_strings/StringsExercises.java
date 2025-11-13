package c03_strings;

public class StringsExercises {
    public static void main(String[] args) {
        // 1. Concatena dos cadenas de texto.
        String name = "Fabricio", lastname = "Jaramillo";
        System.out.println("Mi nombre es " + name + " " + lastname);
        // 2. Muestra la longitud de una cadena de texto.
        System.out.println("La longitud del nombre es " + name.length());
        // 3. Muestra el primer y último carácter de un string.
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length() - 1));
        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        // 5. Comprueba si una cadena de texto contiene una palabra.
        System.out.println(name.contains("cio"));
        // 6. Formatea un string con un entero.
        String numeroTexto = "10";
        // con el Integer.parseInt convertimos un string a un int
        int numeroEntero = Integer.parseInt(numeroTexto);
        System.out.println("String original: " + numeroTexto);
        System.out.println("Entero convertido: " + numeroEntero);
        System.out.println("Operación aritmética: " + (numeroEntero + 10));
        // 7. Elimina los espacios en blanco al princio y final.
        System.out.println("   Eliminando los espacios en blanco   ".trim());
        // 8. Sustituye todos los espacios en blanco de un string.
        System.out.println("   Eliminando los espacios en blanco   ".replace("  ", " "));
        // 9. Comprueba si dos strings son iguales.
        String name2 = "fabricio";
        System.out.println(name.equals(name2));
        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println("¿Tienen la misma longitud? " + (name.length() == lastname.length()));

    }
}
