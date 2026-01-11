package numbers;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter a number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter a number: ");
        int num3 = scanner.nextInt();
        scanner.close();

        if(num1>num2 && num1>num3)
            System.out.println("num1 is greater");
        else if (num2>num1 && num2>num3)
            System.out.println("num2 is greater");
        else
            System.out.println("num3 is greater");

    }
}
