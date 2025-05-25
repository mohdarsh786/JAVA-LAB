import java.util.*;
public class P23
{
    public static void main(String[] st)
    {
        Scanner data = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        System.out.print("Enter the l1 size: ");
        int l1 = data.nextInt();
        System.out.print("Enter the l2 size: ");
        int l2 = data.nextInt();

        System.out.println("Enter elements for list 1:");
        for (int i = 0; i < l1; i++) {
            int al = data.nextInt();
            list1.add(al);
        }

        System.out.println("Enter elements for list 2:");
        for (int i = 0; i < l2; i++) {
            int al = data.nextInt();
            list2.add(al);
        }

        alternate(list1, list2, list3);
        System.out.println("Alternate List " + list3);
    }

    public static void alternate(ArrayList<Integer> list1, ArrayList<Integer> list2, ArrayList<Integer> list3)
    {
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) 
        {
            list3.add(list1.get(i++));
            list3.add(list2.get(j++));
        }
        while (i < list1.size()) 
        {
            list3.add(list1.get(i++));
        }
        while (j < list2.size()) 
        {
            list3.add(list2.get(j++));
        }
    }
}