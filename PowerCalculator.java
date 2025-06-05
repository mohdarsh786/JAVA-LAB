import java.util.*;
class MyCalculator z{
    public int power(int n, int p) throws Exception 
    {
        if (n < 0 || p < 0) 
        {
            throw new Exception("n and p should be non-negative");
        }
        return (int)Math.pow(n, p);
    }
}
public class PowerCalculator 
{
    public static void main(String[] st) 
    {
            Scanner data = new Scanner(System.in);
            MyCalculator calc = new MyCalculator();
            int n = data.nextInt();
            int p = data.nextInt();
            try 
            {
                int result = calc.power(n, p);
                System.out.println(result);
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
    }
}
