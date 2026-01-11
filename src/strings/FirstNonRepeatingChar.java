package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.nextLine();

        Map<Character,Integer> map = new LinkedHashMap<> ();
        for (char c: input.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }for (char c:map.keySet()){
            if (map.get(c) ==1){
                System.out.println("First non-repeating : " + c);
                break;
            }
        }
    }
}
