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
public class Heap {
    Node root;
    Integer index = 1;
    
    public static Heap insert(Heap tree, String name){
        Node newNode = new Node(name);
        
        if(tree.root == null){
            tree.root = newNode;
            tree.index++;
        }else{
            int travel = 1;
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
        while(counter < heap.index){
            System.out.println(currNode.data + " ");
            counter++;
            if (counter % 2 == 0){
                currNode = currNode.left;
            }else{
                currNode = (currNode.parent).right;
            }
        }
        
    }
    
}
