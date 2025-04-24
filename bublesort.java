/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author elifs
 */
public class bublesort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
    int[] arrayToSort = {64, 34, 25, 12, 22, 11, 90};
    int arraySize = arrayToSort.length;

    System.out.println("Sıralanmamış Dizi: " + Arrays.toString(arrayToSort));
    
    BubbleSort(arrayToSort, arraySize);
    
    System.out.println("Sıralanmış Dizi: " + Arrays.toString(arrayToSort));
                
    }
    static int[]BubbleSort (int A[],int n){
     for(int i=n-1;i>0;i--){
         for(int j=0;j<i;j++){
             if(A[j]>A[j+1])
             {int temp=A[j];
             A[j]=A[i+j];
             A[j+1]=temp;
             }
 
}
}
        return A;
  } 
} 
