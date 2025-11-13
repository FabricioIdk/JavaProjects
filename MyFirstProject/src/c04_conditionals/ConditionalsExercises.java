package c04_conditionals;

public class ConditionalsExercises {
    public static void main(String[] args) {
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
            int edad = 15;
            if (edad >= 18){
                System.out.println("Puedes votar");
            }else {
                System.out.println("No puedes votar");
            }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
            int a = 6, b = 3;
            if (a>=b){
                System.out.println("A es mayor o igual que B");
            } else {
                System.out.println("B es mayor o igual que B");
            }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
            int c = 4;
            if (c >= 0){
                System.out.println(c + " Número positivo o igual a cero");
            }else {
                System.out.println(c + " Número negativo");
            }
        // 4. Crea un programa que diga si un número es par o impar.
            int d = 2;
            if (d % 2 == 0){
                System.out.println(d + " es número par");
            }else {
                System.out.println(d + " es número impar");
            }
        // 5. Verifica si un número está en el rango de 1 a 100.
            int e = 150;
            if (e>1 && e <100){
                System.out.println(e + " está en el rango de 1 a 100");
            }else {
                System.out.println(e+" no está en el rango de 1 a 100");
            }
        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
            var day = 5;
            switch (day){
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Solo existe 7 días de la semana bro");
            }
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
            int nota = 100;
            if (nota >= 90 && nota==100){
                System.out.println("Nota sobre saliente: " + nota);
            } else if (nota>=50 && nota < 90) {
                System.out.println("Aprobado con: " + nota);
            }else if (nota<50 && nota > 1){
                System.out.println("Desaprobo con: "+ nota );
            }else {
                System.out.println("Solo se permite valores del 0 al 100");
            }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        int age = 19; // Ejemplo: Edad de la persona
        boolean vaAcompanadoDeAdulto = false; // Ejemplo: Si va acompañado de alguien mayor
        boolean puedeEntrar;
        // Evaluar las condiciones
        if (age >= 15) {
            // Si tiene 15 años o más, puede entrar solo.
            puedeEntrar = true;
        } else {
            // Si es menor de 15 años, debe ir acompañado de un adulto.
            puedeEntrar = vaAcompanadoDeAdulto;
        }

        // Mostrar el resultado
        System.out.println("--- Verificador de Entrada al Cine ---");
        System.out.println("Edad ingresada: " + age + " años");
        System.out.println("Acompañado de adulto: " + (vaAcompanadoDeAdulto ? "Sí" : "No"));

        if (puedeEntrar) {
            System.out.println("\n¡Sí puedes entrar al cine!");
        } else {
            System.out.println("\nLo siento, no puedes entrar al cine bajo las condiciones actuales.");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        char letra = 'E';
        // Convertir la letra a minúscula para simplificar la comparación
        // y manejar tanto mayúsculas como minúsculas.
        char letraMinuscula = Character.toLowerCase(letra);
        String resultado;

        // Evaluar si la letra es una vocal usando la estructura switch
        switch (letraMinuscula) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                resultado = " es una vocal.";
                break;
            default:
                // Se asume que la entrada es una letra válida del alfabeto.
                resultado = " es una consonante.";
                break;
        }
        System.out.println("La letra '" + letra + "'" + resultado);

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
            int number1 = 3, number2 = 3, number3 = 5;
            if (number1 >= number2 && number1 >= number3){
                System.out.println("El primer número es mayor: " + number1);
            } else if (number2 >= number1 && number2 >= number3) {
                System.out.println("El segundo número es mayor: " + number2);
            }else {
                System.out.println("El tercer número es mayor: " + number3);
            }

    }
}
