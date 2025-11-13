package c02_operators;

public class OperatorsExercises {
    public static void main(String[] args) {
        // 1. Crea una variable con el resultado de cada operación aritmética.
        int a = 4, b = 2;
        System.out.println("Operaciones aritmeticas: ");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        // 2. Crea una variable para cada tipo de operación de asignación.
        System.out.println("Operación de asignación");
        a = b;
        System.out.println(a);
        a = b * 2;
        System.out.println(a);
        a += 1;
        System.out.println(a);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de
        // comparación.
        System.out.println("Operaciones 3 verdades");
        System.out.println(a == 5);
        System.out.println(a >= 5);
        System.out.println(a > b);

        // 4. Imprime 3 comparaciones falsas con diferntes operadores de comparación.
        System.out.println("Operaciones 3 falcedades");
        System.out.println(b > a);
        System.out.println(b >= a);
        System.out.println(b == a);

        // 5. Utiliza el operador lógico and.
        System.out.println("Operadores lógicos con Y(AND)");
        System.out.println(a == 5 && b < 1);

        // 6. Utiliza el operador lógico or.
        System.out.println("Operadores lógicos con O");
        System.out.println(false || false);

        // 7. Combina ambos operadores lógicos.
        var nota = 15;
        boolean asistencia = true;
        // aprueba si la nota es mayor o igual que 13 y asistió. O si su nota es 20.
        System.out.println("¿Aprueba el curso? " + ((nota >= 13 && asistencia) || nota == 20));

        // 8. Añade alguna negación.
        boolean activo = true;

        System.out.println("Valor original: " + activo);
        System.out.println("Negación con NOT (!): " + !activo);
        System.out.println(!(15 > 19));

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        char u = 2;
        System.out.println(+2);
        System.out.println(-2);
        System.out.println(++u);

        // 10. Combina operadores aritméticos, de compración y lógicos.
        int edad = 20, puntos = 85, intentos = 3;

        System.out.println("¿Cumple los requisitos? " +
                ((edad + intentos > 21 && puntos >= 80) || !(edad < 18)));

    }
}
