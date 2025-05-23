import java.util.Scanner;
import java.util.Arrays;
class pattern
{
    public static void main(String [] st)
    {
        Scanner data= new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = data.nextInt();
        data.close();
        for(int i=1;i<=n;++i)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<i)
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
