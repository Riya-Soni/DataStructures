import java.util.Scanner;
public class MergeSortInteger {
    int[] arrayInitiate(){
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Enter Array size: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter Array Elements: ");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        return arr;
    }
    //to sort the given array first
    int[] sort(int arr[]){
        int temp, size = arr.length;
        
        //using bubble sort to sort array elments
        for( int i=0; i<size; i++){
            for(int j=0; j<(size-1-i); j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        MergeSortInteger obj = new MergeSortInteger();
        System.out.println("Initiate First Array");
        int a[] = obj.sort(obj.arrayInitiate());
        int b[] = obj.sort(obj.arrayInitiate());
        int size_a = a.length;
        int size_b = b.length;
        int c[] = new int[size_a+size_b];
        int i=0,j=0,k=0;
        //Merge Logic
        while((i<size_a) && (j<size_b)){
            if(a[i]<b[j]){
                c[k]=a[i];
                k++;i++;//c[k++]=a[i++];
            }
            else{
                c[k]=b[j];
                k++;j++;//c[k++]=a[i++];
            }
        }
        while(i<size_a){
            c[k++]=a[i++];
        }
        while(j<size_b){
            c[k++]=b[j++];
        }
        
        System.out.println("\nMerged Array Elements are: ");
        for(i=0; i<(size_a+size_b); i++)
            System.out.print(c[i]+", ");
    }
}
