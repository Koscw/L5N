package converter;

import java.io.IOException;

public class Kelvin extends Celsium implements Converter {
    public void convert() throws IOException {
        double celsius=super.Celsium();
        double result = celsius+273.15;
        System.out.println(result+" kelvins");
    }
}
