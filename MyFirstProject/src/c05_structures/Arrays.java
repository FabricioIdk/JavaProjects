package c05_structures;

public class Arrays {
    public static void main(String[] args) {
        // Declaración y creación
        int[] numbers = new int[3];
        System.out.println(numbers);

        String[] names = {"Fabricio", "Jaramillo", "Drako"};
        System.out.println(names);

        // Acceso
        System.out.println(numbers[0]);
        System.out.println(names[1]);

        System.out.println((new String[3])[0]);

        // Modificación
        numbers[0] = 1;
        numbers[1] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        // numbers[3] = 2; Error

        System.out.println(names[2]);
        names[2] = "Kdfbr1815@gmail.com";
        System.out.println(names[2]);

        // en los array no existe eliminación, pero si una limpieza
        System.out.println(names.length);//.length longitud
        names[2] = null;
        System.out.println(names[2]);
        System.out.println(names.length);//la longitud sigue siendo la misma

        // numbers[2] = null; Error - porque el tipo de dato es primitivo y no objeto como String

        boolean[] booleans = new boolean[5];
        System.out.println(booleans[4]);
    }
}
