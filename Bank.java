import java.util.Scanner;
class Bank {
    public static void main(String[] st) 
    {
        double p, r, n, a;
        int ch;
        
        Scanner data = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Term Deposit ");
        System.out.println("2. Recurring Deposit ");
        System.out.print("Enter your choice: ");
        ch = data.nextInt();

        System.out.print("Enter Principal amount: ");
        p = data.nextDouble();

        System.out.print("Enter Rate of Interest (in %): ");
        r = data.nextDouble();

        System.out.print("Enter Time (in years): ");
        n = data.nextDouble();

        switch (ch) {
            case 1:
                a = p *(1 + r / 100)*n;
                System.out.println("Maturity amount for Term Deposit: " + a);
                break;

            case 2:
                a = (p * n) + (p * (n * (n + 1) / 2) * (r / 100) * (1 / 12));
                System.out.println("Maturity amount for Recurring Deposit: " + a);
                break;

            default:
                System.out.println("Invalid choice...");
        }

    }
}
