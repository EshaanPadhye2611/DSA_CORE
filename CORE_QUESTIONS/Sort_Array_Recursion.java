import java.util.Arrays;
public class Sort_Array_Recursion {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sortArray(arr,0,1);
        System.out.println(Arrays.toString(arr));

}
static int[] sortArray(int[] arr,int left,int right){
    if(left >= arr.length)
        return arr;
    if(right < arr.length){
     if(arr[left] > arr[right] ) return sortArray(arr,left,right+1);
    }
    if(right < arr.length){
     if(arr[left] < arr[right]) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        return sortArray(arr, left, right+1);
    }
}
    return sortArray(arr,left+1,left + 2);

    
}
}