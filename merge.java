import java.util.Scanner;
import java.util.Arrays;

public class merge {

    // Find all pairs whose sum is equal to target
    void arrayFunc(int[] arr, int target) {
        System.out.println("Pairs of elements whose sum is " + target + " are:");
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No pairs found.");
        }
    }

    // Merge two sorted arrays and split them as described
    void arrayFunc(int A[], int p, int B[], int q) {
        int[] merged = new int[p + q];
        System.arraycopy(A, 0, merged, 0, p);
        System.arraycopy(B, 0, merged, p, q);
        Arrays.sort(merged);
        for (int i = 0; i < p; i++) {
            A[i] = merged[i];
        }
        for (int i = 0; i < q; i++) {
            B[i] = merged[p + i];
        }
        System.out.println("After merging and sorting:");
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        merge demo = new merge();

        // Pair sum functionality
        System.out.print("Enter size of array for pair sum check: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();
        demo.arrayFunc(arr1, target);

        // Merge sorted arrays functionality
        System.out.print("Enter size of first sorted array A: ");
        int p = sc.nextInt();
        int[] A = new int[p];
        System.out.println("Enter elements of array A (sorted):");
        for (int i = 0; i < p; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter size of second sorted array B: ");
        int q = sc.nextInt();
        int[] B = new int[q];
        System.out.println("Enter elements of array B (sorted):");
        for (int i = 0; i < q; i++) {
            B[i] = sc.nextInt();
        }

        demo.arrayFunc(A, p, B, q);

        sc.close();
    }
}