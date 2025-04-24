/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Stack;
/**
 *
 * @author elifs
 */
public class veriyapıları3 {
    public static void main(String[] args) {
    // Default initialization of Stack
    Stack stack1 = new Stack();

    // Initialization of Stack using Generics
    Stack<String> stack2 = new Stack<String>();

    stack1.push(5);
    stack1.push("Merhaba");
    stack1.push("Dünya");

    stack2.push("Hello");
    stack2.push("Merhaba");
    stack2.push("Dünya");

    System.out.println(stack1);
    System.out.println(stack2);
    }
}


