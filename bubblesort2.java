
import java.util.*;

/**
 *
 * @author elifs
 */
public class bubblesort2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
    
     int [] dizi={3,4,6,7,2};
        int n=dizi.length;
        System.out.println("sıralanmamış dizi");
        for(int ii=0;ii<n;ii++){
            System.out.print(dizi[ii]+" ");
        } 
        System.out.println( );
        bubble_mintomax(dizi,n);
        System.out.println("küçükten büyüğe sıralanmış dizi");
        for(int ii=0;ii<n;ii++){
            System.out.print(dizi[ii]+" ");
        }
        System.out.println( );
        bubble_maxtomin(dizi,n);
        System.out.println("büyükten küçüğe sıralanmış dizi");
        for(int ii=0;ii<n;ii++){
            System.out.print(dizi[ii]+" ");
        }
    
    }
       public static int[]bubble_mintomax(int arr[],int n){
        for(int i=n-1;i>0;i--){
            for(int j=i;j<n;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static int[]bubble_maxtomin(int[]arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;

}          
    }     

