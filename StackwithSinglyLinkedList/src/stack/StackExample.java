/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack;

/**
 *
 * @author ali19
 */
public class StackExample {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NodeStack<Integer> myStack = new NodeStack<Integer>();
        myStack.push(5);
        myStack.push(3);
        myStack.push(8);
        myStack.push(15);
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.size);
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.top());
        System.out.println("While:");
        while(!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.size);
        
    }    
}
