public class Recusion_count_zeros {

    public static void main(String[] args) {
        int answer =  calcZeroes(6060740);
        System.out.println(answer);
    }
    static int calcZeroes(int num){
        return countZeros( num, 0);
    }
    static int countZeros(int num , int count){
        int digit = num % 10 ;
        if( num == 0){
            return count;
        }
       
       else if(digit == 0 ){
       return countZeros(num /10, count + 1);
       }
       return countZeros(num / 10,count );
    }
}