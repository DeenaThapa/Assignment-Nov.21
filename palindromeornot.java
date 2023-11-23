//WAP to check if the user entered string is palindrome or not
public class palindromeornot {
    public static void main(String[] args) {
        String string = "level";
        int i = 0;
        int j = string.length() - 1;
        while (i < j)
        {
            if (string.charAt(i)!= string.charAt(j))
            {
                System.out.println("it is not palindrome");

            }
            i++;
            j--;
        }
        System.out.println("it is palindrome");


    }
}
