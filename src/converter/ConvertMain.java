package converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertMain {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the temperature type(kelvin/fahrenheit) in what you want to convert");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String in;
        while (!(in = bufferedReader.readLine()).isEmpty()) {
            double result;
            switch(in){
                case "kelvin":
                    Kelvin kelvin = new Kelvin();
                    kelvin.convert();
                    break;
                case "fahrenheit":
                    Fahrenheit fahrenheit = new Fahrenheit();
                    fahrenheit.convert();
                    break;
                default :
                    System.out.println("Error , try one more time");

            }
        }
    }
}
