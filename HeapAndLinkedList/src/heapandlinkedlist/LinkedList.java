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
public class LinkedList{
    Node header;
    
    public static LinkedList insert(LinkedList list, String name){
        Node newNode = new Node(name);
        newNode.next = null;
        
        if(list.header == null){
            list.header = newNode;
        }else{
            Node last = list.header;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
        
        return list;
    }
    
    public static void printList(LinkedList list){
        Node currNode = list.header;
        
        System.out.print("Linked List: ");
        while(currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    
}
