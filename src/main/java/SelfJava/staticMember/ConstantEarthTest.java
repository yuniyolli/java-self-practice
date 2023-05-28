package SelfJava.staticMember;

public class ConstantEarthTest {
    public static void main(String[] args) {
        System.out.println("Earth Radius: " + ConstantEarth.EARTH_RADIUS + "km");
        System.out.printf("Earth Area: %f km^2\n", ConstantEarth.EARTH_AREA);
        System.out.println("Earth Area: " + ConstantEarth.EARTH_AREA + "km^2");
        System.out.printf("Earth Area: %e km^2\n", ConstantEarth.EARTH_AREA);
        System.out.printf("Earth Area: %g km^2\n", ConstantEarth.EARTH_AREA);
        //why does printf show different result from println of Earth Area?
        //probably as printf is float type while println is double one.
        //then how can I format float to double?
        System.out.printf("Earth Area: %s km^2\n", String.valueOf(ConstantEarth.EARTH_AREA));

    }
}
