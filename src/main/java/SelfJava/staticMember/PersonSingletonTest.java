package SelfJava.staticMember;

public class PersonSingletonTest {
    public static void main(String[] args) {
        PersonSingleton p1 = new PersonSingleton("124434-23244", "honggildong") ;

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //p1.nation = "usa";
        //lp1.ssn = "454646-343535";
        p1.name = "HongSamwon";
    }
}
