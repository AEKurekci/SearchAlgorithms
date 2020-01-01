/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package heapandlinkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ali19
 */
public class BinaryTree<E extends Comparable<E>> {
 
    List<E> elements = new ArrayList<>();
 
    public void add(E e) {
        elements.add(e);
    }
    
    public void set(int index, E e){
        elements.set(index, e);
    }
 
    public boolean isEmpty() {
        return elements.isEmpty();
    }
 
    public E elementAt(int index) {
        return elements.get(index);
    }
 
    public int parentIndex(int index) {
        return (index - 1) / 2;
    }
 
    public int leftChildIndex(int index) {
        return 2 * index + 1;
    }
 
    public int rightChildIndex(int index) {
        return 2 * index + 2;
    }

    public int size() {
        return elements.size();
    }

    public void remove(int lastElementIndex) {
        elements.remove(lastElementIndex);
    }
 
}
