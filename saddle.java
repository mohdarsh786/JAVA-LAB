import java.util.Scanner;
class saddle
{
    public static void main(String[] st)
    {
        int [][] arr= new int[3][3];
        int i,j,n,max=0;
        int maxi=0, maxj=0;
        Scanner data =new Scanner(System.in);
        System.out.println("Enter elements: ");
        for (i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                arr[i][j]=data.nextInt();
            }
        }
        System.out.println("Entered Array: ");
        for (i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
        for (i=0;i<3;i++)
        {
            int mini = arr[i][0], minj = 0;
            for (j=1;j<3;j++)
            {
                if (arr[i][j] < mini)
                {
                    mini = arr[i][j];
                    minj = j;
                }
            }
            int k;
            for (k=0; k<3; k++)
            {
                if (arr[k][minj] > mini)
                    break;
            }
            if (k ==  3)
            {
                System.out.println("Saddle Point: " + mini);
                return;
            }
        }
        System.out.println("No Saddle Point");
    }
}

//another one
import java.util.Scanner;

class Saddle {
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

        for (int i = 0; i < 3; i++) {
            int mini = arr[i][0], minj = 0;
            for (int j = 1; j < 3; j++) {
                if (arr[i][j] < mini) {
                    mini = arr[i][j];
                    minj = j;
                }
            }

            int k;
            for (k = 0; k < 3; k++) {
                if (arr[k][minj] > mini)
                    break;
            }

            if (k == 3) {
                System.out.println("Saddle Point: " + mini);
                return;
            }
        }

        System.out.println("No Saddle Point");
    }
}

