import java.util.Scanner;
class armstrong
{
    public static void main(String [] st)
    {
        Scanner data=new Scanner(System.in);
        int num=data.nextInt();
        int originalnum=num;
        data.close();
        int digit,sum=0;
        while(num>0)
        {
            digit=num%10;
            sum+=digit*digit*digit;
            num=num/10;
        }
        // System.out.println(sum);
        // System.out.print(num);
        if (originalnum==sum)
        {
            System.out.println("Yes it is a Armstrong number.....");
        }
        else
        {
            System.out.println("No!! it's not a Armstrong number.....");
        }
    }
}
