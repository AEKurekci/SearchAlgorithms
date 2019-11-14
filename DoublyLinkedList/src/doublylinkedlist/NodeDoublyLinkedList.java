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
public class NodeDoublyLinkedList<E> extends Node<E> {
    protected Node<E> trailer;
    protected int size;
    protected Node<E> header;
    public NodeDoublyLinkedList(){
        this.header = null;
        this.trailer = null;
        size = 0;
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        if(trailer == null && header == null) return true;
        return false;
    }
    public boolean isFirst(Node<E> f){
        if(header == f) return true;
        return false;
    }
    public boolean isLast(Node<E> l){
        if(trailer == l) return true;
        return false;
    }
    public Node<E> before(Node<E> beforeOf){
        return beforeOf.getPrevious();
    }
    
    public Node<E> after(Node<E> afterOf){
        return afterOf.getNext();
    }
    
    public E first(){
        return header.getElem();
    }
    public E last(){
        return trailer.getElem();
    }
    
    public Node<E> insertAfter(Node<E> prev, E item){
        if(prev == trailer){
            Node<E> node = new Node<E>();
            node.setElement(item);
            node.setNext(null);
            node.setPrev(node);
            prev.setPrev(node);
            trailer = node;
            size++;
            return node;
        }else{
            Node<E> node = new Node<E>();
            node.setElement(item);
            node.setPrev(prev);
            node.setNext(prev.getNext());
            (prev.getNext()).setPrev(node);
            prev.setNext(node);
            size++;
            return node;
        }
    }
    
    public Node<E> insertBefore(E item, Node<E> next){
        if(next == header){
            Node<E> node = new Node<E>();
            node.setElement(item);
            node.setNext(next);
            node.setPrev(null);
            next.setPrev(node);
            header = node;
            size++;
            return node;
        }else{
            Node<E> node = new Node<E>();
            node.setElement(item);
            node.setNext(next);
            (next.getPrevious()).setNext(node);
            next.setPrev(node);
            size++;
            return node;
        }
    }
    
    public Node<E> insertFirst(E first){
        if(header != null){
            Node<E> firstNode = new Node<E>();
            firstNode.setElement(first);
            firstNode.setPrev(null);
            firstNode.setNext(header);
            header.setPrev(firstNode);
            size++;
            this.header = firstNode;
            return header;
        }else{
            Node<E> node = new Node<E>();
            header = node;
            trailer = node;
            header.setElement(first);
            header.setNext(trailer);
            header.setPrev(null);
            size++;
            return header;
        }
    }
    
    public Node<E> insertLast(E last){
        if(trailer != null){
            Node<E> lastNode = new Node<E>();
            lastNode.setElement(last);
            lastNode.setPrev(trailer);
            lastNode.setNext(null);
            trailer.setNext(lastNode);
            size++;
            this.trailer = lastNode;
            return trailer;
        }else{
            Node<E> node = new Node<E>();
            trailer = node;
            header = node;
            trailer.setElement(last);
            trailer.setNext(null);
            trailer.setPrev(header);
            size++;
            return trailer;
        }
    }
    
    public E remove(Node<E> p){
        E temporary = p.getElem();
        (p.getNext()).setPrev(p.getPrevious());
        (p.getPrevious()).setNext(p.getNext());
        p.setNext(null);
        p.setPrev(null);
        size--;
        return temporary;
    }
    
    
}
