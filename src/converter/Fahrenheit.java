package converter;

import java.io.IOException;

public class Fahrenheit extends Celsium implements Converter {
    @Override
    public void convert() throws IOException {
        double celsius = super.Celsium();
        double result =(9/5*celsius)+32;
        System.out.println(result+" fahrenheits");
    }
}
