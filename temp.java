import java.util.Scanner;
class zigzagsort
{
    public static void main(String[] args) 
    {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = data.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        int i, j, temp;
        for (i = 0; i < n; i++) 
        {
            arr[i] = data.nextInt();
        }
        data.close();

        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        for (i = 1; i < n; i += 2) 
        {
            if (i + 1 < n) 
            {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        System.out.println("Zig-Zag Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
