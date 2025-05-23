import java.util.*;
interface VolumeShape 
{
    void displayVolume();
}

class Cone implements VolumeShape 
{
    double radius, height;
    public void datacone(double radius, double height) 
    {
        this.radius = radius;
        this.height = height;
    }
    public void displayVolume() {
        double volume = (1.0 / 3) * 3.14 * radius * radius * height;
        System.out.printf("Volume of Cone: %.2f\n", volume); 
    }
}
class Cylinder implements VolumeShape 
{
    double radius, height;

    public void datacylinder(double radius, double height) 
    {
        this.radius = radius;
        this.height = height;
    }
    public void displayVolume() 
    {
        double volume = 3.14 * radius * radius * height;
        System.out.printf("Volume of Cylinder: %.2f\n", volume);
    }
}

class Hemisphere implements VolumeShape 
{
    double radius;

    public void datahemisphere(double radius) 
    {
        this.radius = radius;
    }
    public void displayVolume() 
    {
        double volume = (2.0 / 3) * 3.14 * Math.pow(radius, 3);
        System.out.printf("Volume of Hemisphere: %.2f\n", volume);
    }
}

public class VolumeCalculator 
{
    public static void main(String[] st) 
    {
        VolumeShape ref;
        Cone cone=new Cone();
        Cylinder cyl=new Cylinder();
        Hemisphere hemi=new Hemisphere();
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the choice: ");
        int ch=data.nextInt();
        switch(ch)
        {
        case 1:
            System.out.print("Enter radius and height of the cone: ");
            double r = data.nextDouble();
            double h = data.nextDouble();
            cone.datacone(r,h) ;
            ref=cone;
        ref.displayVolume();
            break;
        case 2:
            System.out.print("Enter radius and height of the cylinder: ");
            r = data.nextDouble();
            h = data.nextDouble();
            cyl.datacylinder(r,h);
            ref=cyl;
            ref.displayVolume();
            break;
        case 3:
            System.out.print("Enter radius of the hemisphere: ");
            r = data.nextDouble();
            hemi.datahemisphere(r);
            ref=hemi;
            ref.displayVolume();
            break;

        case 0:
            break;
        }
        data.close();
        
    }
}    