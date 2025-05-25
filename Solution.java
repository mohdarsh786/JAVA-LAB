import java.util.Scanner;

class MyCalculator 
{
    public int power(int n, int p) throws Exception 
    {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non- negative");
        }
        return (int) Math.pow(n, p);
    }
}

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        MyCalculator calc = new MyCalculator();

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            try {
                System.out.println(calc.power(n, p));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}
