package c05_structures;
import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        // Declaración y creación
        // tipo de clave y tipo de valor <Strinmg, String>
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // Tamaño

        System.out.println(names.size());

        // Inserción

        names.put("Fabricio", "Fabricio@gmail.com");// el put es como un .add
        names.put("Jaramillo", "Jaramillo@gmail.com");
        names.put("Drako", "Drako@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        // Acceso
        System.out.println(names.get("Jaramillo"));//obtener acceso a la clave
        System.out.println(names.get("Granola"));

        // Verificación elementos
        System.out.println(names.containsKey("Jaramillo"));//verifica si contiene la clave
        System.out.println(names.containsKey("Granola"));

        System.out.println(names.containsValue("Drako@gmail.com"));// verifica el valor

        // Eliminación
        System.out.println(names.remove("Jaramillo"));
        System.out.println(names.remove("Drako"));
        System.out.println(names);

        // Limpieza

        names.clear();
        System.out.println(names);

        // Modificación

        names.put("Fabricio", "Fabricio@gmail.com");// agrega
        System.out.println(names);

        names.put("Fabricio", "FabricioIdk@gmail.com");// hace un reemplazo
        System.out.println(names);

        names.replace("Jaramillo", "Jaramillo@gmail.com"); // Reemplaza solo si el valor existe
        System.out.println(names);

        names.putIfAbsent("Jaramillo", "Jara@gmail.com"); // Solo lo añade si no existe
        System.out.println(names);

        // Otras operaciones
        System.out.println(names.isEmpty());//comprueba si está vacío o no
        var values = names.values();//devuelve una colección de valores
        System.out.println(values);
    }
}
