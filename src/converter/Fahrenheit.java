package converter;

public class Fahrenheit implements Converter {
    public double convert(double degrees){
        double q= ((degrees*5/9)+32);
        return  q;
    }
}
