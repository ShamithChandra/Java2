import java.util.*;
public class bubble{   //bubble sort program
    public static void main(String args[]){
        int arr[];
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array :");
        n=sc.nextInt();
        arr=new int[n];
       
        for(int i=0;i<n;i++){
            System.out.print("enter the element "+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                int temp;
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
           
        }
        sc.close();
    
    }
}