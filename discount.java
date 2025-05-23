import java.util.Scanner;

class discount {
    public static void main(String[] st) {
        Scanner data = new Scanner(System.in);
        String name, address, type;
        double amount, disc = 0;

        System.out.print("Enter name: ");
        name = data.nextLine();

        System.out.print("Enter Address: ");
        address = data.nextLine();

        System.out.print("Enter Amount: ");
        amount = data.nextDouble();
        data.nextLine();

        System.out.print("Enter Type of purchase (L/D): ");
        type = data.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Address: " + address);

        switch (type) {
            case "L":
                if (amount <= 25000) {
                    System.out.println("Amount after discount: " + amount);
                    break;
                } 
                else if (amount <= 57000) 
                {
                    disc = amount * 0.05;
                    amount -= disc;
                    System.out.println("Amount after discount: " + amount);
                    break;
                } 
                else if (amount <= 100000) 
                {
                    amount -= amount * 0.075;
                    System.out.println("Amount after discount: " + amount);
                    break;
                } 
                else 
                {
                    amount -= amount * 0.1;
                    System.out.println("Amount after discount: " + amount);
                    break;
                }

            case "D":
                if (amount <= 25000) 
                {
                    disc = amount * 0.05;
                    amount -= disc;
                    System.out.println("Amount after discount: " + amount);
                    break;
                } 
                else if (amount <= 57000) 
                {
                    disc = amount * 0.075;
                    amount -= disc;
                    System.out.println("Amount after discount: " + amount);
                } 
                else if (amount <= 100000) 
                {
                    amount -= amount * 0.1;
                    System.out.println("Amount after discount: " + amount);
                    break;
                } 
                else 
                {
                    amount -= amount * 0.15;
                    System.out.println("Amount after discount: " + amount);
                    break;
                }

            default:
                System.out.println("Invalid type of purchase. Please enter 'L' or 'D'.");
        }

        data.close();
    }
}
