import java.util.*;
abstract class Temperature 
{
    double temp;
    void setTempData(double t) 
    {
        temp = t;
    }
    abstract void changeTemp();
}
class Fahrenheit extends Temperature 
{
    double ctemp;
    void changeTemp() 
    {
        ctemp = (5.0 / 9) * (temp - 32);
        System.out.println("Fahrenheit to Celsius: " + ctemp + " °C");
    }
}
class Celsius extends Temperature 
{
    double ftemp;
    void changeTemp() 
    {
        ftemp = (9.0 / 5) * temp + 32;
        System.out.println("Celsius to Fahrenheit: " + ftemp + " °F");
    }
}

public class Temperabs
{
    public static void main(String[] st) 
    {
        Scanner  data =new Scanner(System.in);
        Fahrenheit f = new Fahrenheit();
        System.out.println("Enter the Fahrenheit temperature: ");
        double fahren=data.nextDouble();
        f.setTempData(fahren);
        f.changeTemp();
        Celsius c = new Celsius();
        double cel=data.nextDouble();
        c.setTempData(cel);
        c.changeTemp();
    }
}
