
package separatechaininghashset;

import java.util.LinkedList;

// Class that represents a HashSet

public class SeparateChaining {
    private LinkedList<Integer>[] data; // we can use null for removing by implementing Integer class
    
    public SeparateChaining(){
        data = new LinkedList[997];
    }
    
    private int hash(int element){ // Hash Function - private because user does not need access to this
        return Math.abs(element % data.length); // modular hashing only positive indexes
    }
    
    public void add(int element){
        if (data[hash(element)] == null){
            data[hash(element)] = new LinkedList<>();
        }
        data[hash(element)].add(element); 
    }
    
    public void remove(int element){
        data[hash(element)].remove((Integer)element); // casting the int into an Integer object
    }
    
    public boolean contains(int element){
        if (data[hash(element)] != null){
            return data[hash(element)].contains(element); // returns true if there is a linked list and it contains the value
        }else{
            return false;
        }
         
    }
    
    
}
