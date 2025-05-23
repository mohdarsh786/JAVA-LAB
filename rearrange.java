import java.util.Scanner;
import java.util.Arrays;

class rearrange {
    public static void main(String[] st) 
    {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = data.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:"); 
        for (int i = 0; i < n; i++) 
        {
            arr[i] = data.nextInt();
        }
        data.close();
        System.out.println("Entered Array: " + Arrays.toString(arr));
        int j = 0;
        for (int i = 0; i < n; i++)  
        {
            if (arr[i] < 0) 
            {
                if (i != j) 
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        System.out.println("Final Array: " + Arrays.toString(arr));
    }
}
