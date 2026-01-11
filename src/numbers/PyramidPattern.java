package numbers;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();
        sc.close();

        int space = rows -1;
        int star = 1;

        for (int i=1; i<= rows; i++){
            for (int j =1; j<= space; j++){
                System.out.print(" ");
            }for (int k=1; k<=star; k++){
                System.out.print("* ");
            }

            System.out.println();
            space --;
            star ++;
        }
    }
}
