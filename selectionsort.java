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
public class selectionsort {

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
        selection_mintomax(dizi,n);
        System.out.println("küçükten büyüğe sıralanmış dizi");
        for(int ii=0;ii<n;ii++){
            System.out.print(dizi[ii]+" ");
        }
        System.out.println( );
        selection_maxtomin(dizi,n);
        System.out.println("büyükten küçüğe sıralanmış dizi");
        for(int ii=0;ii<n;ii++){
            System.out.print(dizi[ii]+" ");
        }
    }
       public static int[]selection_mintomax(int []arr,int n){
        for(int i=0;i<n-1;i++){//Dıştaki döngü, her bir elemanın yerinin belirlenmesi için dizinin başından sondan bir önceki elemana kadar döner Son eleman zaten sıralı olacağından kontrol edilmez.
            int min=arr[i];//Her döngü adımında, döngünün mevcut indeksi (i) için bir minimum eleman ve bu elemanın indeksi (index) belirlenir.
            int index=i;// İlk olarak, mevcut eleman minimum olarak kabul edilir ve indeks de index değişkenine atanır.
            for(int j=i+1;j<n;j++)//İçteki döngü, dıştaki döngünün hemen sağındaki elemandan başlar ve dizinin sonuna kadar devam eder 
                if(arr[j]<min){//İçteki döngüde, mevcut elemandan sonraki elemanlar kontrol edilir. Eğer bir sonraki eleman, mevcut minimumdan daha küçükse, o zaman minimum değeri ve minimumun indeksini güncellenir.
                    min=arr[j];
                    index=j;
                }
            arr[index]=arr[i];//İçteki döngü tamamlandıktan sonra, minimum değerin indeksi bulunmuş olur. Bu indeks, dıştaki döngünün mevcut indeksi (i) ile değiştirilir.
            arr[i]=min;//Dıştaki döngünün sonunda, mevcut elemanın ve minimum elemanın yerleri değiştirilir. Böylece, mevcut eleman en küçük eleman olur ve sıralama adımı tamamlanır.
        }
        return arr;
    } 
    public static int[]selection_maxtomin(int[]arr,int n){
        for(int i=0;i<n-1;i++){//Dıştaki döngü, her bir elemanın yerinin belirlenmesi için dizinin başından sondan bir önceki elemana kadar döner.Son eleman zaten sıralı olacağından kontrol edilmez.
            int max=arr[i];//her döngü adımında, döngünün mevcut indeksi (i) için bir maksimum eleman ve bu elemanın indeksi (index) belirlenir. İlk olarak, mevcut eleman maksimum olarak kabul edilir ve indeks de index değişkenine atanır.
            int index=i;
            for(int j=i+1;j<n;j++)//İçteki döngü, dıştaki döngünün hemen sağındaki elemandan başlar ve dizinin sonuna kadar devam eder 
               if(arr[j]>max){//İçteki döngüde, mevcut elemandan sonraki elemanlar kontrol edilir. Eğer bir sonraki eleman, mevcut maksimumdan daha büyükse, o zaman maksimum değeri ve maksimumun indeksini güncellenir.
                    max=arr[j];
                    index=j;
                } 
             arr[index]=arr[i];//İçteki döngü tamamlandıktan sonra, maksimum değerin indeksi bulunmuş olur. Bu indeks, dıştaki döngünün mevcut indeksi (i) ile değiştirilir.
            arr[i]=max;//Dıştaki döngünün sonunda, mevcut elemanın ve maksimum elemanın yerleri değiştirilir. Böylece, mevcut eleman en büyük eleman olur ve sıralama adımı tamamlanır.
        } 
        return arr;
    }
    }
    
