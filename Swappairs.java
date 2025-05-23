import java.util.*;
public class Swappairs
{
    public static void main(String[] st)
    {
        Scanner data=new Scanner(System.in);
        ArrayList<String> list =new ArrayList<>();
        System.out.println("Enter the count :");
        int count=data.nextInt();
        data.nextLine();
        while(count>0)
        {
            System.out.print("Enter the string :");
            String str=data.nextLine();
            list.add(str);
            count--;
        }
        swappy(list);
        System.out.println(list);
    }
    public static void swappy(ArrayList<String> list)
    {
        for(int i=0;i<list.size()-1;i+=2)
        {
            if((i+1)<list.size())
            {
                Collections.swap(list, i, i + 1);
            }
        }
    }
}