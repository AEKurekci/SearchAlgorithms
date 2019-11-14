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
public class DoublyLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NodeDoublyLinkedList<Integer> myList = new NodeDoublyLinkedList();
        
        System.out.println("is empty: " + myList.isEmpty());
        Node<Integer> first = myList.insertFirst(5);
        Node<Integer> last = myList.insertLast(9);
        
        System.out.println("Previous of first(header) should be null: " + first.getPrevious());
        System.out.println("Next of last(trailer) should be null: " + last.getNext());
        
        Node<Integer> newFirst = myList.insertBefore(13, first);
        Node<Integer> newLast = myList.insertAfter(last, 28);
        
        first = myList.insertAfter(first, 8);
        System.out.println("is empty: " + myList.isEmpty());
        System.out.println("is last: " + myList.isLast(last));
        System.out.println("is first: " + myList.isFirst(newFirst));
        
        Node<Integer> silinecek = myList.insertAfter(first, 2);
        
        first = myList.insertAfter(first, 1);
        first = myList.insertAfter(first, 15);
        
        System.out.println("Silinmeden önce size: " + myList.size);
        System.out.println("Silinen: " + myList.remove(silinecek));
        System.out.println("Silinmeden sonra size: " + myList.size);
        System.out.println("first: " + myList.first());
        System.out.println("header: " + myList.header.getElem());
        System.out.println("last: " + last.getElem());
        System.out.println("trailer: " + myList.last());
        System.out.println("after(): " + myList.after(first).getElem());
        System.out.println("before(15): " + myList.before(first).getElem());
    }
    
}
