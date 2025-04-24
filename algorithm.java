import java.util.Scanner;
//faktöriyel hesaplama algoritması
public class algorithm {

   
    public static void main(String[] args) { // faktoriyel hesaplama
        Scanner scn=new Scanner(System.in);
          int faktoriyel=1;
          System.out.println("bir sayı giriniz");
          int sayi=scn.nextInt();
          
        for(int i=1;i<=sayi;i++){
          
            faktoriyel=faktoriyel*i;
        }
            System.out.println(sayi+"!="+faktoriyel);
            
        
    }
    
}
