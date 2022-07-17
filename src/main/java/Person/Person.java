package Person;

public class Person {

    public final static String PERSON_USAGE="Folosit la primarie";
    private final String CNP;
    private final String nume;
    private final String email;

    String defaultAccess="Acces default";
    protected String protectedAcces= "Acces protejat";

    public String publicAcces="Public Acces";

    private Person() {
        throw new IllegalStateException("Missing Mandatory Properties");
    }

    public Person(String CNP, String nume, String email) {
        System.out.println("Constructor person: setare paramentri");
        this.CNP = CNP;
        this.nume = nume;
        this.email = email;
    }

    public String getCNP() {
        return CNP;
    }

    public String getNume() {
        return nume;
    }

    public String getEmail() {
        return email;
    }
}

class Dumy{


}