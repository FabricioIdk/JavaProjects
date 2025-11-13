package c01_beginner;

public class VariablesAndConstants {
    public static void main(String[] args) {
        // Variables

        String name = "Fabricio";
        System.out.println(name);

        name = "Drako";
        System.out.println(name);

        // name = 37; Error (no podemos cambiar el tipo de dato)

        int age = 37;
        System.out.println(age);

        var email = "Kdbr1815@gmail.com";
        System.out.println(email);

        var year = 2025;
        System.out.println(year);

        // Constantes, valor que no se puede modificar luego de inicializarla

        final String EMAIL = "Kdbr1815@gmail.com";
        // EMAIL = "Kdbr1815@gmail.com"; Es constante
        System.out.println(EMAIL);
    }
}
