package Bit_manipulation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class remove_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>(n);
            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                list.add(x);
               
            }
            Collections.sort(list);
            boolean isGreater = false;
            for(int i =0;i < n - 1;i++){
                int diff = list.get(i+ 1) - list.get(i);
                if(diff > 1){
                    isGreater = true;
                    break;
                }

            }
            System.out.println(isGreater ? "NO":"YES");
           
        }
    }
    
}
