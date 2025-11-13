package c05_structures;
import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        // Estructura dinámica y no se necesita declarar valor fijo

        // Declaración y creación
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        // Tamaño

        System.out.println(names.size());

        // Inserción

        names.add("Fabricio");
        names.add("Jaramillo");
        names.add("Amaya");
        System.out.println(names.size());

        // Acceso

        System.out.println(names.getFirst());//para obtener primer valor
        System.out.println(names.get(1));// llama al índice 1 del arraylist
        System.out.println(names.getLast());// para obtener el último valor

        // Modificación

        names.set(2, "Kdfbr1815@gmail.com");
        System.out.println(names.getLast());

        // Eliminación

        names.remove(2);
        // System.out.println(names.get(2)); // Error
        System.out.println(names.size());

        // Búsqueda

        System.out.println(names.contains("Fabricio"));
        System.out.println(names.contains("Kdfbr1815@gmail.com"));

        // Limpieza

        names.add("Drako");
        System.out.println(names);
        names.clear();
        System.out.println(names.size());
    }
}
