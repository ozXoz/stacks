/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationstacks;

import java.util.Stack;

/**
 *
 * @author oz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        System.out.println(stack);
//        var top = stack.pop();
//        System.out.println(top);
//        System.out.println(stack);
//        stack.empty();
//        System.out.println(stack.empty());
//        top=stack.peek();
//        System.out.println(top);
//        System.out.println(stack);
//#################### 2 ########################
//        String str ="abcd";
//        StringReverser reverser = new StringReverser();
//        var result=reverser.reverse("");
//        System.out.println(result);

//        String str="{1+2]";
//        Expression exp =new Expression();
//        var result2 =exp.isBalanced(str);
//        System.out.println(result2);

            Stack stack = new Stack();
            stack.push(10);
            stack.push(20);
            stack.push(30);
        stack.push(40);

//            stack.pop(); // geriden silmeyi sagliyor .... LIFO .
        stack.pop();



        System.out.println(stack.peek());



    }

}
