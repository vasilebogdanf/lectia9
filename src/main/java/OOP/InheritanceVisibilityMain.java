package OOP;

import Person.Person;

public class InheritanceVisibilityMain {
    public static void main(String[] args) {
        Person person = new Person("123456789", "Vasile Dumitru", "abc@gmail.com");
        // modificatorul de acces default ofera vizibilitate maxim la nivel de pachet
//        System.out.println(person.defaultAccess);


//        System.out.println(person.protectedAcces);
        System.out.println(person.publicAcces);
        System.out.println(Person.PERSON_USAGE);

       // Person specialPerson=new SpecialPerson();
    }
}
