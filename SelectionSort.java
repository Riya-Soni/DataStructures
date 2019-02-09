
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,temp;
        
        System.out.println("Enter Array size: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter Array Elements: ");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        
        //selection logic
        for (int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
                
        System.out.println("\nArray Elements are: ");
        for(int i=0; i<n; i++)
            System.out.print(arr[i]+", ");
    }
}
