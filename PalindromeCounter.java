import java.io.*;
import java.util.Scanner;
public class PalindromeCounter 
{
    public static void main(String[] st) 
    {
        int count = 0;
        try {
            File file = new File("input.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) 
            {
                String word = sc.next();
                if (isPalindrome(word)) 
                {
                    count++;
                }
            }

            System.out.println("Number of palindromes: " + count);

        } catch (FileNotFoundException e) 
        {
            System.out.println("File not found.");
        }
    }

    static boolean isPalindrome(String word) 
    {
        word = word.toUpperCase();
        int i = 0;
        int j = word.length() - 1;
        while (i < j) 
        {
            if (word.charAt(i) != word.charAt(j)) 
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
