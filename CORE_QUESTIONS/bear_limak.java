import java.util.Scanner;

public class bear_limak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int years = 0;

        while( a <= b){
             a = a * 3;
             b = b * 2;
             years ++;
             if( a > b){
                break;
             }

        }
        System.out.println(years);
    }
    
}
