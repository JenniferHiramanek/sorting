import java.io.*;

public class BubbleSort{
     
    int []sort(int arr[], int size){
        int temp,i,j;
        for(i=0;i<size-1;i++)
        {
            for(j=1;j<(size-i);j++)
            {
                if(arr[j]<arr[j-1])
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
     }
     
     void display(int arr[], int size){
         System.out.println("Sorted Array: ");
         for(int i=0;i<size;i++)
         {
             System.out.print(arr[i]+" ");
         }
     }
     
     public static void main(String []args) throws IOException
     {
        int size,i;
        BufferedReader y = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter size of array: ");
        size=Integer.parseInt(y.readLine());
        int arr[]=new int [size];
        System.out.print("Enter elements: ");
        for(i=0;i<size;i++)
        {
            arr[i]=Integer.parseInt(y.readLine());
        }
        BSort ob=new BSort();
        arr=ob.sort(arr,size);
        ob.display(arr,size);
        
     }
}