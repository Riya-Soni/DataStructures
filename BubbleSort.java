import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, temp;
        
        System.out.println("Enter Array size: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter Array Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("UnSorted array are: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+", ");
        }
        
        //Bubble Sort Logic
        for( int i=0; i<n; i++){
            for(int j=0; j<(n-1-i); j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("\nSorted array are: ");
        for(int i=0; i<n; i++)
            System.out.print(arr[i]+", ");
        }
}    

