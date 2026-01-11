package strings;

public class check {
    public static void main(String[] args){

        String s = "ChandniChaturChamak";
        String s1 = "cha";

        int count = 0;
        int len = s1.length();

        for(int i = 0; i <= s.length() - len; i++){
            String sub = s.substring(i, i + len);
            if(sub.equalsIgnoreCase(s1)){
                count++;
            }
        }

        System.out.println("Occurrences of '" + s1 + "': " + count);
    }
}
