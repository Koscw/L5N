package converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertMain {
    public static void main(String[] args) throws IOException {

        System.out.println("enter the temperature");
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
        double celsius = Double.parseDouble(bufferedReader1.readLine());
        System.out.println("Enter the temperature type(kelvin/fahrenheit) in what you want to convert");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String in;
        while (!(in = bufferedReader.readLine()).isEmpty()) {
            double result ;
            switch (in) {
                case "kelvin":
                    result=Converter.kelvin(celsius);
                    System.out.println(result+" kelvins");
                    break;
                case "fahrenheit":
                    result =Converter.fahrenheit(celsius);
                    System.out.println(result+" fahrenheits");
                    break;
                default:
                    System.out.println("Error , try one more time");



            }

        }



    }
}
