import java.util.Scanner;  // necessary to use Scanner

class WeatherReporter {
    Scanner scanner = new Scanner(System.in);  // create scanner and connect to console

    public void readCityAndTemperature() {
        String city;
        double temperature;

        // ask for city name
        System.out.print("Enter your city: ");
        city = scanner.next();  // read next word from input

        // ask for temperature
        System.out.print("Enter today's temperature in °C: ");
        temperature = scanner.nextDouble();  // read a double (decimal number) from input

        // output the results
        System.out.println("Today in " + city + ", it is " + temperature + "°C.");
    }

    public static void main(String[] args) {
        // creates object and starts method readCityAndTemperature
        (new WeatherReporter()).readCityAndTemperature();
    }
}