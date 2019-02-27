package ds_practise;
import java.util.Scanner;
public class MergeSortString {
    
    String[] arrayInitiate(){
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Enter Array size: ");
        n = sc.nextInt();
        String arr[] = new String[n];
        
        System.out.println("Enter Array Elements: ");
        for(int i=0; i<n; i++)
            arr[i] = sc.next();
        return arr;
    }
   
    String[] sort(String[] arr){
        String s1 = null,s2 = null,temp;
        int x,i,j,n=arr.length;
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
        return arr;
    }
    
    public static void main(String[] args){
        MergeSortString obj = new MergeSortString();
        System.out.println("Initiate First Array");
        String a[] = obj.sort(obj.arrayInitiate());
        System.out.println("Initiate Second Array");
        String b[] = obj.sort(obj.arrayInitiate());
        int size_a = a.length;
        int size_b = b.length;
        String c[] = new String[size_a+size_b];
        
        String s1 = null,s2 = null,s3 = null;
        int i=0,j=0,k=0;
        
        //merge sort logic
        while((i<size_a) && (j<size_b)){
            s1= a[i];
            s2 = b[j];
            int x = s2.compareTo(s1);//s1>s2 compare lyk this
            if(x>0){
                s3=s1;//a[i];
                i++;//c[k++]=a[i++];
            }
            else{
                s3=s2;//b[j];
                j++;//c[k++]=a[i++];
            }
            c[k++] = s3; 
            
        }
        while(i<size_a){
            s3=a[i++];
            c[k++] = s3;
        }
        while(j<size_b){
            s3=b[j++];
            c[k++] = s3;
        }
        
        System.out.println("\nElements of Sorted array: ");
        for(k=0; k<(size_a+size_b); k++ ){
            System.out.print(c[k]+", ");
        }
    }    
}

/*
this will check the string as per dictionary sequence by default,
that means no  restriction for string length
but this is case sensitive so, it will arrange Capital letters first then according their UNICODE value
if number came, they before any letter
*/
