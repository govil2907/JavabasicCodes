package strings;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String rev = "";
        for(int i = str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        if(rev.equalsIgnoreCase(str)){
            System.out.println("String is palindrome");
        }else System.out.println("String is not a palindrome");
    }
}
