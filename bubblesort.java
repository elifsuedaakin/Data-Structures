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
public class bubblesort {

    /**
     * @param args the command line arguments
     */
   
     static void bubbleSort_ex1(int arr[],int n,Stack tek,Stack cift)
{
        for (int i=n-1;i>0;i--){
            for (int j=0;j<i;j++){
                    if (arr[j] > arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
            }
        if(arr[i]%2==1){
        tek.push(arr[i]); 
        }
        else{
        cift.push(arr[i]);  
        }
        }
    }

    public static void main(String[] args) {
        int dizi[]={3,2,1,5,6,4,9,7,8};
        int n= dizi.length;
        for (int ii=0;ii<n;ii++)
        {
            System.out.print(dizi[ii]+" ");
        }
        System.out.println("");

        Stack yigin_tek = new Stack();
        Stack yigin_cift = new Stack();

        bubbleSort_ex1(dizi,n,yigin_tek,yigin_cift);

        System.out.println("Tek Sayılar");
        while(!yigin_tek.isEmpty()) 
        {
            System.out.print(yigin_tek.pop()+" "); 
        }
        
        System.out.println("");
        System.out.println("Çift Sayılar");
        while(!yigin_cift.isEmpty()) 
        {
            System.out.print(yigin_cift.pop()+" "); 
        }

    }
    }
    

