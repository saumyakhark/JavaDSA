//arr= {10,20,30,40,50,60,70}
//start = 0
//end = arr.length - 1
//mid = start + (end-start)/2;
//target = 60
//mid == target
//if(mid < target){
  //  start = mid + 1
//}
//if(mid > target){
  //  end = mid - 1l
//} else return -1
//Binary Search algorithm in array
class binary{
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50,60,70};
        //Target =60
        System.out.println(binaryS(arr, 40));
    }
    public static int binaryS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){ //Target would be in right side of ascending array.
                start = mid + 1;
            }
            else if(arr[mid] > target){ //Target would be in left side of ascending array. 
                end = mid - 1;
            }else{
                return -1;
            }
        }
        return -1; // When no target element found.
    }
}

//Time Complexity- Best Case= O(1), Worst Case = O(logn)