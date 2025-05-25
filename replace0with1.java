import java.util.Scanner;
public class replace0with1 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int result = 0, place = 1;
        int originalNum = num; // Save original for zero check

        if (num == 0) {
            result = 1;
        }  
        else 
        {
            while (num > 0) {
                int digit = num % 10;
                if (digit == 0)
                {
                    digit = 1;
                }
                result = result + (digit * place);
                place *= 10;
                num /= 10;
            }
        }
        System.out.println("Modified number: " + result); 
        scanner.close();
    }
}