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
public class Node<E> {
    //instance variables
    private E element;
    private Node<E> next;
public Node(){
    this(null,null);
}   
public Node(E elem, Node<E> n){
    this.element = elem;
    this.next = n;
}
//Accesseor methods
public E getElem(){
    return element;
}
public Node<E> getNext(){
    return next;
}
//Modifier methods
public void setElement(E newElem){
    element = newElem;
}
public void setNext(Node<E> newNext){
    next = newNext;
}
}
