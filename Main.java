
public class Main
{
    public static void main(String[] args)
    {
        String word1="A man, a plan: a canal: Panama!";
        String result;
        if(new Solution().isPalindrome(word1))
        {
            result="is a palindrome.";
        }
        else
        {
            result="is not a palindrome.";
        }
        System.out.println("The word/phase, '"+ word1+ "' "+result);
        
        String word2="Race a car!";
        if(new Solution().isPalindrome(word2))
        {
            result="is a palindrome.";
        }
        else
        {
            result="is not a palindrome.";
        }
        System.out.println("The word/phase, '"+ word2 +"' "+result);
    }
}
