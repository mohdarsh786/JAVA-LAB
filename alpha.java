import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            System.out.print(i); // Print the first digit
            
            // Print the remaining numbers
            for (int j = 2; j <= 5; j++) {
                System.out.print(j + 2);
            }
            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}
