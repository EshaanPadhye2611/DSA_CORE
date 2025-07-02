 public static void bonAppetit(List<Integer> bill, int k, int b) {
    
     int actualBill = 0;
     
     int sum2 = 0;
     for(int x:bill){
        sum2 += x;
     }
    
     sum2 -= bill.get(k);
     actualBill = sum2 / 2;
     int ans = b - actualBill;
     if(ans != 0) System.out.println(ans);
     
     else{
        System.out.println("Bon Appetit");
     }
