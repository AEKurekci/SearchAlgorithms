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
public class Heap<E extends Comparable<E>> {
    
    BinaryTree elements = new BinaryTree();
    public void add(E e){
        elements.add(e);
        int elementIndex = elements.size() - 1;
        while(!isRoot(elementIndex) && !isCorrectChild(elementIndex)){
            int parentIndex = elements.parentIndex(elementIndex);
            swap(elementIndex, parentIndex);
            elementIndex = parentIndex;
        }
    }
    
    Node root;
    Integer index = 1;

    private boolean isRoot(int i) {
        return i == 0;
    }

    private boolean isCorrectChild(int index) {
        return isCorrect(elements.parentIndex(index), index);
    }

    private boolean isCorrect(int parentIndex, int childIndex) {
        if(!isValidIndex(parentIndex) || !isValidIndex(childIndex)){
            return true;
        }
        /**
         * if parent is less than child returns true
         * because compareTo method return -1, so -1 is less than 0
         */
        return elements.elementAt(parentIndex).compareTo(elements.elementAt(childIndex)) < 0;
    }

    private boolean isValidIndex(int index) {
        return index < elements.size();
    }

    private void swap(int index1, int index2) {
        E elem1 = (E) elements.elementAt(index1);
        E elem2 = (E) elements.elementAt(index2);
        elements.set(index1, elem2);
        elements.set(index2, elem1);
    }
    
    public E pop(){
        if (isEmpty()){
            throw new IllegalStateException("You cannot pop from an empty heap");
        }
        E result = (E) elements.elementAt(0);
        int lastElementIndex = elements.size() - 1;
        swap(0, lastElementIndex);
        elements.remove(lastElementIndex);
        
        int elementIndex = 0;
        while(!isLeaf(elementIndex) && !isCorrectParent(elementIndex)){
            int smallerChildIndex = smallerChildIndex(elementIndex);
            swap(elementIndex, smallerChildIndex);
            elementIndex = smallerChildIndex;
        }
        
        return result;
    }

    private boolean isEmpty() {
        return elements.size() == 0;
    }

    private boolean isLeaf(int index) {
        return !isValidIndex(elements.leftChildIndex(index));
    }

    private boolean isCorrectParent(int index) {
        return isCorrect(index, elements.leftChildIndex(index)) && isCorrect(index, elements.rightChildIndex(index));
    }

    private int smallerChildIndex(int index) {
        int leftChildIndex = elements.leftChildIndex(index);
        int rightChildIndex = elements.rightChildIndex(index);
        if(!isValidIndex(rightChildIndex)){
            return leftChildIndex;
        }
        if(elements.elementAt(leftChildIndex).compareTo(elements.elementAt(rightChildIndex)) < 0){
            return leftChildIndex;
        }
        return rightChildIndex;
    }
    
}
