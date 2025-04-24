
import java.util.*;

public class queue2 {
static class Queue{
   static Stack<Integer> s1=new Stack<Integer>();
   static Stack<Integer> s2=new Stack<Integer>();
   static void enQueue(int x){
       while(!s1.isEmpty()){
           s2.push(s1.pop());
       }
       s2.push(x);
       while(!s2.isEmpty()){
               s1.push(s2.pop());
   }
}
   static int deQueue(){
    if(!s1.isEmpty()){
        System.out.println("Q is empty");
        System.exit(0);
    }
    int x=s1.pop();
    return x;
}
   public static void main(String[] args){
       Queue q=new Queue();
       q.enQueue(1);
       q.enQueue(2);
       q.enQueue(3);
       System.out.println(deQueue());
       System.out.println(deQueue());
       System.out.println(deQueue());
   }
}}