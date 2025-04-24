import java.util.*;
import java.util.Hashtable;
import java.util.LinkedList;
public class bos{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
   Hashtable<Double,LinkedList<Double>> ht =new Hashtable<>();
        System.out.println("lütfen bir öğrenci numarası giriniz(çıkmak için -1 giriniz)");
        double ogrenciNo=input.nextInt();
        while(ogrenciNo!=-1){
            System.out.println("sıraNo giriniz");
            double sıraNo=(ogrenciNo%1000);
            if(ht.containsKey(ogrenciNo)){
                ht.get(ogrenciNo).addFirst(sıraNo);
            }
            else {
             LinkedList<Double> link1=new LinkedList<>();
             link1.addFirst(sıraNo);
             ht.put(ogrenciNo,link1);
             
            }
            System.out.println("lütfen bir ogrenci numarası giriniz(çıkmak için -1 giriniz)");
            ogrenciNo=input.nextInt();
            
        }
        
        System.out.println("hashtable : "+ht);
        System.out.println("hashtable'ın boyutu: "+ht.size());
    } } 