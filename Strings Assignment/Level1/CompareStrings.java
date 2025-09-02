import java.util.Scanner;

public class CompareStrings {
    
    static boolean checkStrings(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first string:");
        String str1 = sc.next();
        
        System.out.println("Enter second string:");
        String str2 = sc.next();
        
        boolean res1 = checkStrings(str1, str2);
        boolean res2 = str1.equals(str2);
        
        System.out.println("Using charAt method: " + res1);
        System.out.println("Using equals method: " + res2);
        
        if(res1 == res2){
            System.out.println("Both are same result");
        } else {
            System.out.println("Both are different result");
        }
    }
}

