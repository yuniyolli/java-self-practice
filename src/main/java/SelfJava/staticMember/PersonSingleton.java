package SelfJava.staticMember;

public class PersonSingleton {
    final String nation = "Korea";
    final String ssn;
    String name;

    public PersonSingleton(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
