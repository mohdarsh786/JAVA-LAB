import java.util.*;   
class SumIJK {
    public static void main(String[] st) 
    {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = data.nextInt();
        System.out.print("Enter K: ");
        int k = data.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) 
        {
            arr[i] = data.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < n; i++) 
        {
            int complement = k - arr[i];
            if (set.contains(complement)) 
            {
                System.out.println("Pair found: " + complement + ", " + arr[i]);
            }
            set.add(arr[i]);
        }
        data.close();
    }
}
