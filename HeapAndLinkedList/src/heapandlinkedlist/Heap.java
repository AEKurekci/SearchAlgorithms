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
    
    public static Heap insert(Heap tree, String name){
        Node newNode = new Node(name);
        
        if(tree.root == null){
            tree.root = newNode;
            tree.index++;
        }else{
            int travel = 2;
            Node last = tree.root;
            while(travel <= tree.index){
                if(travel % 2 == 0){
                    if(last.left != null){
                        travel++;
                        last = last.left;
                    }else{
                        last.left = newNode;
                        newNode.parent = last;
                        tree.index++;
                        travel++;
                        break;
                    }
                }else{
                    if(last.right != null){
                        travel++;
                        last = last.right;
                    }else{
                        last.right = newNode;
                        newNode.parent = last;
                        tree.index++;
                        travel++;
                        break;
                    }
                }
            }
        }
        
        return tree;
    }
    
    public static void printHeap(Heap heap){
        Node currNode = heap.root;
        int counter = 1;
        System.out.println("");
        System.out.println(heap.index + "Heap List: ");
        while(counter < heap.index){
            System.out.print(currNode.data + " ");
            counter++;
            if (counter % 2 == 0){
                currNode = currNode.left;
            }else{
                currNode = (currNode.parent).right;
            }
        }
        
    }

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
        
        return result;
    }

    private boolean isEmpty() {
        return elements.size() == 0;
    }
    
    
}
