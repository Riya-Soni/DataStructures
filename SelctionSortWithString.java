import java.util.Scanner;

public class SelctionSortWithString {
    public static void main(String[] args){
        String temp = null,s1 = null,s2 = null;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Array size: ");
        int n = sc.nextInt();
        int i=0,j=0,x=0;
        String arr[] = new String[n];
        
        System.out.println("Enter Array Elements: ");
        for( i=0; i<n; i++)
            arr[i] = sc.next();
        
        /*STATIC INITIALIZATION
        String arr[] = {"x","z","c","h","a"};
        int n = arr.length;
        int i=0,j=0,x=0;
        */
        
        System.out.println("Elements of UnSorted array: ");
        for( i=0; i<n; i++ ){
            System.out.print(arr[i]+", ");
        }
               
        //selection logic
        for (i=0; i<n; i++){
            for(j=i+1; j<n; j++){
                s1 = arr[i];
                s2 = arr[j];        
                x = s1.compareTo(s2);
                if (x > 0){
                    temp = s1;
                    s1 = s2;
                    s2 = temp;
                }
                arr[i] = s1;
                arr[j] = s2;
            }
        }
        
        System.out.println("\nElements of UnSorted array: ");
        for(i=0; i<n; i++ ){
            System.out.print(arr[i]+", ");
        }
    }
}
