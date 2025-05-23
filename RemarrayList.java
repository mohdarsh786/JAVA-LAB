import java.util.*;
public class RemarrayList
{
    public static void main(String[] st)
    {
        Scanner data =new Scanner(System.in);
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
        removeEvenlength(list);
        System.out.println(list);
    }
    public static void removeEvenlength(ArrayList<String> list)
    {
        for(int i=0;i<list.size();i++)
        {
            if (list.get(i).length()%2==0)
            {
                list.remove(i); 
                i--;
            }
        }
    }
}
