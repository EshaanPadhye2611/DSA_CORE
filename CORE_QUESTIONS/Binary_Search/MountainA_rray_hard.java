/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
     public int peakElement( MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;
        while(start < end){
            int mid  = start + (end - start) / 2;
            if(mountainArr.get(mid) < mountainArr.get(mid + 1)){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return end;

        
        
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
       int peak = peakElement(mountainArr);
       int first = binarySearch(target,mountainArr,0,peak,true);
       if(first != -1){
        return first;
       }else{
       return first = binarySearch(target,mountainArr,peak + 1,mountainArr.length() -1,false);
       }

       
    }
    public static int binarySearch(int target, MountainArray mountainArr,int start, int end,boolean Asc){
       
       
        while(start<=end){
            int mid  = start + (end - start) / 2;
            if(mountainArr.get(mid) == target)
                    return mid;
              if(Asc){
                
             if(mountainArr.get(mid) > target){
                    end  = mid - 1;
                }else{
                    start = mid + 1;
                }
              }
            else{
                 if(mountainArr.get(mid) > target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}