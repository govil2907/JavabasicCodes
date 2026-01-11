package numbers;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse : ");
        int originalNumber = sc.nextInt();

        int reverseNumber = 0;
        int tempNumber = originalNumber;

        while(tempNumber != 0){
            int digit = tempNumber % 10;
            reverseNumber = reverseNumber * 10 +digit;
            tempNumber /= 10; //remove the last digit from the original
        }

        System.out.println("Original Number : " + originalNumber);
        System.out.println("Reversed Number : " + reverseNumber);

        sc.close();
    }
}
