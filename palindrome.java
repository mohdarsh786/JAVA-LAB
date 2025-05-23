import java.util.Scanner;
class palindrome
{
    public static void main(String [] st)
    {
        int num,digit=0;
        Scanner data=new Scanner(System.in);
        System.out.print("Enter number :");
        num=data.nextInt();
        int onum=num;
        while(num>0)
        {
            int temp = num % 10;
            digit = digit*10 + temp;
            num /= 10;
        }
        if (digit==onum)
        {
            System.out.print("Yes it is a palindrome mza aagya yeeeehhheehehhehhehhe siuuuuuuuuuuuuuuuuuuuuu!!!!!....");
        }
        else
        {
            System.out.print("No it is not a palindrome.......");
        }
    }
}