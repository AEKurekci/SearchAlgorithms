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
            long startTime = System.nanoTime();
            heap.add("Ali");
            long endTime = System.nanoTime();
            long timeForAll = (endTime - startTime);
            System.out.println("\nSpent time for Heap insertion Ali: " + timeForAll);
            
            startTime = System.nanoTime();
            heap.add("Zeynep");
            endTime = System.nanoTime();
            timeForAll = (endTime - startTime);
            System.out.println("Spent time for Heap insertion Zeynep: "+ timeForAll);
            
            long startTimeForLinkedList = System.nanoTime();
            LinkedList.insert(list, "Ali");
            long endTimeForLinkedList = System.nanoTime();
            timeForAll = (endTimeForLinkedList - startTimeForLinkedList);
            System.out.println("Spent time for LinkedList insertion Ali: " + timeForAll);
            
            startTimeForLinkedList = System.nanoTime();
            LinkedList.insert(list, "Zeynep");
            endTimeForLinkedList = System.nanoTime();
            timeForAll = (endTimeForLinkedList - startTimeForLinkedList);
            System.out.println("Spent time for LinkedList insertion Zeynep: " + timeForAll);
            
            
        } catch (IOException ex) {
            Logger.getLogger(HeapAndLinkedList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
