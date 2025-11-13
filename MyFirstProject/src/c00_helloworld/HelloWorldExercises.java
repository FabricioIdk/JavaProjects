package c00_helloworld;

public class HelloWorldExercises {
    public static void main(String[] args) {
        // Variables
        String name = "Fabricio";
        System.out.println(name);

        /* cambia el nombre 3 veces */
        name = "Drako";
        System.out.println(name);

        // error, es cadena de texto, no se puede modificar
        // name = 22;

        int age = 22;
        System.out.println(age);

        /*
         * el var es una variable, lo que pongamos primero el sistema
         * va a inferir de que tipo de variable sea
         */
        var year = 2025;
        System.out.println(year);

        var email = "kdfbr1815@gmail.com";
        System.out.println(email);

        /*
         * Constantes; es una variable cuyo valor no puede cambiar
         * una vez que se ha asignado
         */
        final String EMAIL = "Kdfbr1815@gmail.com";
        // email = "ffff@gmail.com"; ES constante
        System.out.println(EMAIL);
    }
}
