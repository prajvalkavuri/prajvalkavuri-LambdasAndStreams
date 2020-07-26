import java.util.*;
public class palindromeChecker { 
  static boolean isPalindrome(String str) 
    { 
        int i = 0, j = str.length() - 1; 
        while (i < j)
        { 
            if (str.charAt(i) != str.charAt(j)) 
                return false;
            i++; 
            j--; 
        } 
        return true; 
    } 
    public static void main(String[] args) 
    { 
        int i;
        List<String> palindromes=new ArrayList<String>();  
        palindromes.add("alphaahpla");
        palindromes.add("mam");
        palindromes.add("carat");
        palindromes.add("dad");
        palindromes.add("mom");
        for(i=0;i<5;i++)
        { 
        String str=palindromes.get(i);
        if (isPalindrome(str)) 
            System.out.println(str); 
        } 
} }