package strings;

import java.util.Scanner;

public class SwapStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String one");
        String str1 = sc.nextLine();
        System.out.println("Enter string two");
        String str2 = sc.nextLine();
        System.out.println("Before Swapping");
        System.out.println("str1: " + str1);
        System.out.println("str2: "+ str2);
        str1 = str1 + str2;
        System.out.println(str1);
        str2 = str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("\n After Swapping");
        System.out.println("str1: "+ str1);
        System.out.println("str2 : "+ str2);
    }
}
