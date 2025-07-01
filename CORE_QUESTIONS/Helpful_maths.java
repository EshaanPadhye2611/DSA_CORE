import java.util.Arrays;
import java.util.Scanner;
public class Helpful_maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        for(int left = 0;left < s.length();left++){
            for(int right = left + 1;right<s.length();right++){
            if(sb.charAt(left) != '+' && sb.charAt(right) != '+'){
                if(sb.charAt(left) - '0' > sb.charAt(right) - '0'){
                    char temp = sb.charAt(left);
                    sb.setCharAt(left, sb.charAt(right));
                    sb.setCharAt(right, temp);
                }
            
           
        }
    }
    }
        System.out.println(sb.toString());

    }

    
}
