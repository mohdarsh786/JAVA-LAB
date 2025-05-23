import java.util.Scanner;
class Friendlypairornot
{
    public static void main(String[] args)
    {
        int n1,n2,i;
        int sum1=0,sum2=0;
        Scanner data=new Scanner(System.in);
        System.out.print("Enter the first no.");
        n1=data.nextInt();
        System.out.print("Enter the Second  no.");
        n2=data.nextInt();
        for(i=1;i<n1;i++)
        {
            if (n1%i==0)
            {
                sum1=sum1+i;
            }
        }
        for(i=1;i<n2;i++)
        {
            if (n2%i==0)
            {
                sum2=sum2+i;
            }
        }
        if ((double)(sum1/n1)==(double)(sum2/n2))
        {
            System.out.print("Number are Friendly pair..");
        }
        else
        {
            System.out.print("Number is not a friendly pair....");
        }
    }
}