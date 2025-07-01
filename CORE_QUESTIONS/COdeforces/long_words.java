import java.util.Scanner;
public class long_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       sc.nextLine(); // Consume the newline character after the integer input

        while(n-- >0){
             String s = sc.next();
             if(s.length()<=10){
                System.out.println(s);
             }else{
                StringBuilder sb = new StringBuilder();
                sb.append(s.charAt(0));
                sb.append(s.length() - 2);
                sb.append(s.charAt(s.length() - 1));
                System.out.println(sb.toString());
             }

        }
        sc.close();
        
    }
    
}
