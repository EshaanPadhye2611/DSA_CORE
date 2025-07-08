import java.util.Scanner;

public class Contestant_round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        int k = sc.nextInt();
        int count = 0;
        int index = 0;
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            int x = sc.nextInt();
            arr[i] = x;
        }

        while(index < arr.length && arr[index] >= arr[k - 1] ){
            if(arr[index] != 0){
            count++;
            
            }
            index++;
        }
        System.out.println(count);
    }
    
}
