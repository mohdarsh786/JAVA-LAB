import java.util.*;

class program9 {
    public static void main(String[] args)
    {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = data.nextLine();
        data.close();
        StringBuffer stb = new StringBuffer(str);
        for (int i = 0; i < stb.length(); i++) 
        {
            char ch = stb.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
            {
                stb.deleteCharAt(i);
                i--;
            }
        }

        System.out.println("String without vowels: " + stb.toString());
        
    }
}
