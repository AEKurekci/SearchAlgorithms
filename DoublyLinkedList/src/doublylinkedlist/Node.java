/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doublylinkedlist;

/**
 *
 * @author ali19
 */
public class Node<E> {
    private E element;
    private Node<E> next;
    private Node<E> previous;
    
    public Node(){
        this.element = null;
        this.next = null;
        this.previous = null;
    }
    
    public Node(E e, Node<E> n){
        this.element = e;
        this.next = n;
    }
    
    public Node(E e, Node<E> n, Node<E> p){
        this.element = e;
        this.next = n;
        this.previous = p;
    }
    
    public void setElement(E e){
        this.element = e;
    }
    
    public void setNext(Node<E> n){
        next = n;
    }
    
    public void setPrev(Node<E> prev){
        previous = prev;
    }
    
    public E getElem(){
        return element;
    }

    public Node<E> getNext() {
        return next;
    }

    public Node<E> getPrevious() {
        return previous;
    }
    
}
