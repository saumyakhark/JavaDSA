package Arrayse;
import java.util.Scanner;
public class traverse{
    public static void main(String[] args) {
        int n;

        /*Traversal in Array. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the number: ");
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Your array is:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        /*Insertion in Array. */

        //Trying insertion by making another array of the size +1 to the previous array.
        //Second method is to shift the elements of the array.
        int[] b = new int[n+1];
        System.out.println("Enter the index at which you want to insert: "); //2
        int index = scanner.nextInt();
        System.out.println("Enter the new value to be inserted: "); //80
        int val = scanner.nextInt();

        for(int i = 0; i <= n; i++){ //10 20 30 40 50 
            if(i<index){
                b[i] = arr[i]; //10 20 
            }
            else if(i == index){ // 10 20 80 
                b[i] = val;
            }
            else{
                b[i] = arr[i-1];  //10 20 80 30 40 50
            }
        }

        for(int i = 0; i < n+1; i++){
            System.out.print(b[i]+ " ");
        }
        scanner.close();
    }
}