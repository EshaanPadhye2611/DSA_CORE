import java.util.Scanner;

public class Reverse_Pyramid {
    static void reversePyramid(int n) {
        for(int i = 1;i<=n;i++){
            for(int j = 0;j < i- 1;j++){
                System.out.print(" ");
            }
            for (int k  = 1;k<= 2 * (n-i) + 1;k++){
                System.out.print("*");
            }
            System.out.println();

      }

    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number of rows for the reverse pyramid: ");
        int n = sc.nextInt();
        reversePyramid(n);
    }

}