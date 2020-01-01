/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package heapandlinkedlist;

/**
 *
 * @author ali19
 */
public class Node {
    protected String data;
    protected Node next;
    
    public Node(String name){
        this.data = name;
        this.next = null;
    }
    
    public void setElement(String name){
        this.data = name;
    }
    
    public void setNext(Node n){
        next = n;
    }
    
    public String getElem(){
        return data;
    }

    public Node getNext() {
        return next;
    }
}
