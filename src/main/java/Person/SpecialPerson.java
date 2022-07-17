package Person;

import Person.Person;

public class SpecialPerson extends Person {

   public SpecialPerson(){
       super("1234","Bobo","abc@gmail.com");
       System.out.println("Constructor special person");
       System.out.println("Parametru protected: "+ protectedAcces);

   }
}
