package c01_beginner;

public class DataTypes {
    public static void main(String[] args) {

        // Tipos de datos primitivos
        int myInt = 37; // dato entero
        System.out.println(myInt);

        double myDouble = 1.77;// dato con decimales
        char myChar = 'a';// dato tipo caracter
        boolean myBoolean = true;// Valor lógico, "falso" o "verdadero"

        float myFloat = 1.5f; // como el double pero con precisión simple
        long myLong = 321321321L; // almacena números enteros que ocupa 8 bytes


        String myString = "Hola, Java";// cadena de texto
        System.out.println(myString);

        // Tipo de dato en tiempo de compilación
        System.out.println(myString.getClass().getSimpleName());
    }
}
