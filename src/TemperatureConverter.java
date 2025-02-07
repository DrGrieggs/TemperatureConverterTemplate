import java.util.Scanner;

public class TemperatureConverter {
    public double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0/9.0;
    }
    public double toFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;

    }

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        TemperatureConverter con = new TemperatureConverter();
        double far;
        double cel;

        System.out.print("Enter a temperature in Fahrenheit: ");
        far = scnr.nextDouble();
        cel = con.toCelsius(far);

        System.out.printf("%.1fF is equal to %.1fC", far, cel);
        System.out.println();

    }

}
