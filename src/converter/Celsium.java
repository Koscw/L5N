package converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Celsium {
   double celsius;
   public double Celsium() throws IOException {
       System.out.println("Enter the degrees in celsius");
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       this.celsius = Integer.parseInt(bufferedReader.readLine());
       return celsius;
   }
}
