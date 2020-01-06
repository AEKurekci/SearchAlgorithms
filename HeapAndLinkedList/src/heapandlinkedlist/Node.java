/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package heapandlinkedlist;

/**
 *
 * @author ali19
 * @param <E> is any type of element(node) of LinkedList
 */
public class Node<E> {
    protected E data;
    protected Node<E> next;
    
    public Node(E name){
        this.data = name;
        this.next = null;
    }
    
    public void setElement(E name){
        this.data = name;
    }
    
    public void setNext(Node<E> n){
        next = n;
    }
    
    public E getElem(){
        return data;
    }

    public Node<E> getNext() {
        return next;
    }
}
