package c08_test_oop;

// Modificadores de acceso

import c08_oop.Person;

public class Classes {
    public static void main(String[] args) {
        var person = new Person("Fabricio", 22, "123456789A");

//        person.name = "Brais";
//        person.age = 38;

        person.sayHello();

//        person.name = "Brais Moure";
//        System.out.println(person.name);
    }
}
