import java.util.Scanner;

class kelvinconverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double temperature;

        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();

        System.out.print("Enter the temperature: ");
        temperature = input.nextDouble();

        switch (choice) {
            case 1:
                double celsius = (temperature - 32) * 5 / 9;
                System.out.println("Celsius: " + celsius);
                break;
            case 2:
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.println("Fahrenheit: " + fahrenheit);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}