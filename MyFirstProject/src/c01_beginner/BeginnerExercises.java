package c01_beginner;

public class BeginnerExercises {
    public static void main(String[] args) {
    // 1. Declara una variable de tipo string y asignale tu nombre.
        String myName = "Fabricio";
        System.out.println(myName);
     // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 22;
        System.out.println(age);
    // 3. Crea una variable double con tu altura en metros.
        double height = 1.61;
        System.out.println(height);
    // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean meGustaProgramar = true;
        if (meGustaProgramar) {
            System.out.println("Si me gusta programar");
        } else {
            System.out.println("No me gusta programar");
        }

    // 5. Declara una constante con tu email.
        final String EMAIL = "Kdbr1815@gmail.com";
        System.out.println(EMAIL);

    // 6. Crea una variable de tipo char y guárdale tu inicial.
        char myInicial = 'F';
        System.out.println(myInicial);

    // 7. Declara una variable de tipo String con tu localidad y
    // acontinuación cambia su valor y vuelvea imprimirla

        String local = "Jr. progreso";

        local = "Jr. Progreso 195";
        System.out.println("La dirección cambiada es: " + local);

    // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas
        int a = 2, b = 3;
        System.out.println("la suma de a y b es:" + a + b);

     //9. Intenta declarar una variable sin inicializarla y luego asignale un valor antes

        int number;
        number = 90;
        System.out.println("número: " + number);

    // 10. Imprime el tipo de dos variables creadas anteriormente
        System.out.println("Nombre: " + myName + " | Edad: " + age);
        // también se puede usar el printf:
        System.out.printf("Nombre: %s | Edad: %d%n", myName, age);
        // %s->para cadenas string; %d->para enteros; %n->salto de linea; %b->booleano

    }
}
