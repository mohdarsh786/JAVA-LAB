import java.io.*;

class Armstrongfh {
    public static void main(String[] st) {
        try (BufferedReader br = new BufferedReader(new FileReader("E:/Codeway/MyLab/Lab Java/arms.txt"))) 
        {
            String b;
            while ((b = br.readLine()) != null) 
            {
                String[] num = b.split("\\s+");
                boolean flag;
                for (int i = 0; i < num.length; i++) {
                    flag = armstrong(Integer.parseInt(num[i]));
                    if (flag) 
                    {
                        System.out.println("Armstrong Number is :" + Integer.parseInt(num[i]));
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static boolean armstrong(int num) 
    {
        int originalnum = num;
        int digit, sum = 0;
        while (num > 0) {
            digit = num % 10;
            sum += digit * digit * digit;
            num = num / 10;
        }
        if (originalnum == sum) 
        {
            return true;
        } else {
            return false;
        }
    }
}
