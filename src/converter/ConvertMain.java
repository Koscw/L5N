package converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConvertMain {
    public static void main(String[] args) throws IOException {


        System.out.println("Enter the temperature type(kelvin/fahrenheit) in what you want to convert");
        Scanner scanner = new Scanner(System.in);
        String in;
        while (!(in = scanner.next()).isEmpty()) {
            System.out.println("enter the degrees ");
            Converter object = null;
            switch (in) {

                case "kelvin":
                    object = new Kelvin();

                    break;
                case "fahrenheit":
                    object = new Fahrenheit();

                    break;
                default:
                    System.out.println("Error , try one more time");


            }
            System.out.println(object.convert(scanner.nextDouble()));

        }


    }


}