import java.util.*;
abstract class Shape 
{
    abstract public void rectanglearea(int l, int b);
    abstract public void squarearea(int side);
    abstract public void circlearea(int radius);
}

class Area extends Shape 
{
    public void rectanglearea(int l, int b) 
    {
        int area = l * b;
        System.out.println("Area of rectangle with length = " + l + " and breadth = " + b + " is " + area);
    }

    public void squarearea(int side) {
        int area = side * side;
        System.out.println("Area of square with side = " + side + " is " + area);
    }

    public void circlearea(int r) {
        double area = 3.14 * r * r;
        System.out.println("Area of circle with radius = " + r + " is " + area);
    }
}

class User {
    public static void main(String[] st) {
        Scanner data = new Scanner(System.in);
        int ch = -1; // Initialize choice
        Shape ref;
        Area ob = new Area();

        while (ch != 0) {
            System.out.print("\nEnter your choice for Area calculation:\n"
                    + "1. Rectangle\n"
                    + "2. Square\n"
                    + "3. Circle\n"
                    + "0. Exit\n"
                    + "Enter your choice: ");
            ch = data.nextInt();
            ref = ob;

            switch (ch) {
                case 1:
                    System.out.print("Enter length: ");
                    int l = data.nextInt();
                    System.out.print("Enter breadth: ");
                    int b = data.nextInt();
                    ref.rectanglearea(l, b);
                    break;
                case 2:
                    System.out.print("Enter side: ");
                    int side = data.nextInt();
                    ref.squarearea(side);
                    break;
                case 3:
                    System.out.print("Enter radius: ");
                    int radius = data.nextInt();
                    ref.circlearea(radius);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        data.close();
    }
}
