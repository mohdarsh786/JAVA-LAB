import java.util.Scanner;
public class saddle 
{
    public static void main(String[] st) {
        int[][] arr = new int[3][3];
        Scanner data = new Scanner(System.in);

        System.out.println("Enter elements: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = data.nextInt();
            }
        }

        System.out.println("Entered Array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }

        boolean found = false;
        for (int i = 0; i < 3; i++) {
            int mini = arr[i][0], minj = 0;
            for (int j = 1; j < 3; j++) {
                if (arr[i][j] < mini) {
                    mini = arr[i][j];
                    minj = j;
                }
            }

            boolean isSaddle = true;
            for (int k = 0; k < 3; k++) {
                if (arr[k][minj] > mini) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println("Saddle Point: " + mini);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Saddle Point");
        }

        data.close();
    }
}