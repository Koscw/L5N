package converter;

public class Kelvin implements Converter {
    public double convert(double degrees){
        double q =degrees+273.15;
        return q;
    }
}
