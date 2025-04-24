
import java.util.Scanner;
/**
 *
 * @author elifs
 */
public class insertionsort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
      int dizi[]={3,2,1,5,6,4,9,7,8};
	int n= dizi.length;
        System.out.println("sıralanmamış dizi");
	for (int ii=0;ii<n;ii++)
	{
            System.out.print(dizi[ii]+" ");	
	}
	
	insertionsort(dizi,n);
	
	System.out.println();
        System.out.println("küçükten büyüğe sıralanmış dizi");
	for (int ii=0;ii<n;ii++)
	{
            System.out.print(dizi[ii]+" ");
	}
        System.out.println();
    }
    

    
    static int[] insertionsort(int a[],int size){
        for(int i=1;i<size;i++){ //döngü dizinin ikinc elemanından başlar ve sonuna kadar devam eder
            if(a[i]<a[i-1]){//eğer şu anki eleman bir önceki elemandan küçükse ,bu durumda ekleme algoritması dvereye girer
                int j;//Bu satırda, bir tamsayı değişkeni olan j tanımlanıyor. Bu değişken, iç içe geçmiş döngülerde kullanılacak.
                 int temp =a[i];//temp adında bir değişken tanımlanıyor ve bu değişkene a[i] değeri atanıyor. Bu adım, mevcut elemanın geçici olarak saklanması için yapılır
                         for(j=i;j>0&& a[j-1]>temp;j--)//Bu döngü, j değerini i'den başlayarak azaltarak gerçekleşir. İlk olarak, j=i ile başlar. Ardından, j>0 ile dizinin başına gelinmediği sürece ve bir önceki eleman mevcut elemandan büyük olduğu sürece döngü devam eder. Her döngü adımında j-- ifadesi ile j değeri bir azaltılır.
                             a[j]=a[j-1];//Bu satırda, j'nin gösterdiği elemanı, bir önceki elemanla değiştirir. Bu, elemanları sağa kaydırmak için yapılır ve uygun pozisyon bulunana kadar devam edilir.
                             a[j]=temp;//Son olarak, temp değişkeninde saklanan mevcut elemanı, uygun pozisyona yerleştirir.
                         }
            
        
} return a; }}
           
       
