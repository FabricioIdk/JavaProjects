package c05_structures;
import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        // el Set es una estructura desordenada

        // Declaración y creación
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Tamaño

        System.out.println(names.size());

        // Inserción

        names.add("Fabricio");
        names.add("Pepe");
        names.add("Julio");
        names.add("Fabricio@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Eliminación

        names.remove("Fabricio");
        System.out.println(names.size());

        // Búsqueda

        System.out.println(names.contains("Fabricio"));
        System.out.println(names.contains("Julio@gmail.com"));

        System.out.println(names);
        names.add("Pepe");
        names.add("Pepe");
        names.add("Pepe");
        System.out.println(names);

        // Conjuntos

        // names.addAll(numbers); Error por el tipode dato, uno es integer y otro string

        var countries = new HashSet<String>();
        countries.add("España");
        countries.add("México");
        countries.add("Argentina");
        countries.add("MoureDev");

        names.addAll(countries);// .addAll agrega todos los datos de countries a names
        System.out.println(names);// se verá todos los paises y nombres

        names.removeAll(countries);// .removeAll elimina una colección
        System.out.println(names);

        names.retainAll(countries);// .retainAll solo deja elementos comunes
        System.out.println(names);
    }
}
