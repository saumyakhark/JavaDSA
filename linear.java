class linear{
    public static void main(String args[]){
        //An array of 10 elements(1,2,3,4,5,6,7,8,9,10)
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        //Target element = 5
        System.out.println(linearS(arr, 1)); //Array Linear
        String str = "Saumya";
        System.out.println(search(str, 'a'));  //String Linear
    }

    //Linear Search method for strings
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char i = 0; i < str.length() - 1; i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    //Linear Search method for arrays
    static int linearS(int[] arr, int target){
        for(int i = 0; i < arr.length - 1; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1; //When target element is not found.
    }
}