/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package heapandlinkedlist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali19
 */
public class HeapAndLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList list = new LinkedList();
        Heap heap = new Heap();
        int count = 0;
        File file = new File("data.txt");
        try {
            FileReader fReader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fReader);
            String line = bReader.readLine();
            while(line != null){
                list = LinkedList.insert(list, line);
                heap.add(line);
                line = bReader.readLine();
                count++;
            }           
            bReader.close();
            LinkedList.printList(list);
            System.out.print("\nHeap: ");
            while(count>0){
                System.out.print(heap.pop() + " ");
                count--;
            }
            
        } catch (IOException ex) {
            Logger.getLogger(HeapAndLinkedList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
