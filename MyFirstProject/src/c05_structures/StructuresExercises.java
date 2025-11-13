package c05_structures;

import java.util.*;
import java.util.Arrays;

public class StructuresExercises {
    public static void main(String[] args) {
        // 1. Crea un Array con 5 valores e imprime su longitud.
        int[] array01 = new int[5];
        System.out.println("El tamaño del primer array es: " + array01.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println("Valor sin modificar: " + array01[0]);
        System.out.println("Valor sin modificar: " + array01[1]);
        array01[0] = 1;
        array01[1] = 10;
        System.out.println("Valor modificado: " + array01[0]);
        System.out.println("Valor modificado: " + array01[1]);

        // 3. Crea un ArrayList vacío.
        int[] array02 = new int[0];
        System.out.println(array02.length);

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        var array03 = new ArrayList<String>();
        array03.add("Valor1"); // índice 0
        array03.add("Valor2"); // índice 1
        array03.add("Valor3"); // índice 2
        array03.add("Valor4"); // índice 3
        System.out.println(array03);
        array03.remove(1);
        System.out.println(array03);
        // 5. Crea un HashSet con 2 valores diferentes.
        var array04 = new HashSet<String>();
        array04.add("Fabricio");
        array04.add("Drako");
        System.out.println(array04);
        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        array04.add("Fabricio");
        array04.add("Andres");
        System.out.println(array04);

        // 7. Elimina uno de los elementos del HashSet.
        array04.remove("Fabricio");
        System.out.println(array04);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        var array05 = new HashMap<String, Integer>();
        array05.put("Fabricio", 937667857);
        array05.put("Drako", 937645857);
        array05.put("Andres", 937661111);
        System.out.println(array05);
        // 9. Modifica uno de los contactos y elimina otro.

        array05.put("Fabricio", 123);
        System.out.println(array05);
        array05.remove("Andres");
        System.out.println(array05);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.

        // Array inicial
        String[] arrayInicial = {"Manzana", "Banana", "Naranja", "Manzana", "Pera"};
        System.out.println("Array original: " + Arrays.toString(arrayInicial)); // convierte el contenido de un array en cadena de texto

        // Transformar Array en ArrayList
        // Usamos Arrays.asList() y lo pasamos al constructor de ArrayList para crear una lista mutable.
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arrayInicial));
        System.out.println("ArrayList: " + arrayList);

        // 3. Transformar ArrayList en HashSet
        // Pasar el ArrayList al constructor de HashSet elimina automáticamente los duplicados.
        HashSet<String> hashSet = new HashSet<>(arrayList);
        System.out.println("HashSet (sin duplicados): " + hashSet);

        // 4. Transformar HashSet en HashMap con clave y valor iguales
        // Iteramos sobre el HashSet y añadimos cada elemento como clave y valor en el HashMap.
        HashMap<String, String> hashMap = new HashMap<>();
        for (String elemento : hashSet) {
            hashMap.put(elemento, elemento); // Clave y valor son el mismo elemento
        }

        System.out.println("HashMap (clave=valor): " + hashMap);

        // Opcional: Imprimir el HashMap de forma más legible
        System.out.println("HashMap (formato detallado):");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }
}
