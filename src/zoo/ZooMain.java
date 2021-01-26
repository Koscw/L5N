package zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZooMain {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String in;
        while (!(in = bufferedReader.readLine()).isEmpty()) {
            Object object = null;
            switch (in) {
                case "tiger":
                    object = new Tiger();
                case "cat":
                    object = new Cat();
                case "duck":
                    object = new Duck();
                case "Dog":
                    object = new Dog();
                    defaul:
                    System.out.println("Error^ try one more time");

            }
            if (object instanceof Run) {
                ((Run) object).run();
            }
            if (object instanceof Fly) {
                ((Fly) object).fly();
            }
            if (object instanceof Climb) {
                ((Climb) object).climb();
            }


        }
    }
}
