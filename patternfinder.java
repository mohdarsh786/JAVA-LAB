import java.util.*;
class patternfinder
 {
    public static void main(String[] st)
     {
        int i,count = 0;
        String bina;
        Scanner data = new Scanner(System.in);
        System.out.print("Enter Number:");
        bina = data.nextLine();
        data.close();

        for ( i = 0; i < bina.length() ; i++) 
        {
            if (bina.charAt(i) == '0' && bina.charAt(i + 1) == '1')
            {
                count++;
            }
        }
        i--;
        if (bina.charAt(i)=='1')
        {
            count--;
        }
        System.out.println("Count is " + count);
    }
}