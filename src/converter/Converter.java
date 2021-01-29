package converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface Converter {

    public static double kelvin(double celsius){
        double result = celsius+273.15;
        return result;
    }
    public static double fahrenheit(double celsius){
        double result =(9/5*celsius)+32;
        return result;
    }

}
