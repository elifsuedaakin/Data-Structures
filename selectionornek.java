
import java.util.*;

public class selectionornek {

    public static void main(String[] args) {
     
    }
   
    static int[] selelctionsort_kucukten_buyuge(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            int min=arr[i];
            int index=i;
            for(int j=i+1;j<n;j++)
                if(arr[j]<min){
                    min=arr[j];
                    index=j;
        } arr[index]=arr[i];
        arr[i]=min;
    } return arr;}
    
     static int[] selectionbuyuktenkucuge(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int max=arr[i];
            int index=i;
            for(int j=i+1;j<n;j++)
                if(arr[j]>max){
                    max=arr[j];
                    index=j;
                }
            arr[index]=arr[i];
            arr[i]=max;
        } return arr;
    }
}
