package thirdparty;

import java.util.Random;

public class StaticMethods {
    private static final String[] salutations = {"Greetings", "Wilkommen", "Merhaba", "Bonjour", "¡Hola"};
    private static final Random random = new Random();

    public static String greet(String name) {
	return salutations[random.nextInt(4)] + ", " +  name + "!";
    }
}
