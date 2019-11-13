/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack;

import java.util.EmptyStackException;
//import java.util.Stack;
/**
 *
 * @author AEK
 */
public class NodeStack<E>{
    protected Node<E> top; //referance to the head node
    protected int size;
    public NodeStack(){
        top = null;
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(top == null) return true;
        return false;
    }
    
    public void push(E elem){
        Node<E> v = new Node<E>(elem, top);
        top = v;
        size++;
    }
    public E top() throws EmptyStackException{
        if(isEmpty()) throw new EmptyStackException();
        return top.getElem();
    }
    public E pop() throws EmptyStackException{
        if(isEmpty()) throw new EmptyStackException();
        E temp = top.getElem();
        top = top.getNext();
        size--;
        return temp;
    }
}
