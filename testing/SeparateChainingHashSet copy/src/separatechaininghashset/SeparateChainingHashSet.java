
package separatechaininghashset;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;


public class SeparateChainingHashSet {
        
    public static void main(String[] args) {
        
        
        // TESTS
        int[] sizes = {100, 1000, 10000, 100000, 1000000, 10000000};
        int numIterations = 10;
        int numSearches = 10000;
        
        for (int size : sizes) {
            // Insertion tests
            //System.out.println("Iteration,Hash_insert_time,Hash_search_time,Tree_insert_time,Tree_search_time");
            for (int i = 0; i < numIterations; i++) {
                long seed = System.currentTimeMillis();
                
                // HashSet insert test
                Random r = new Random(seed);
                HashSet<Integer> hashSet = new HashSet<>();
                long startTime = System.nanoTime();
                for (int index = 0; index < size; index++) {
                    hashSet.add(r.nextInt());
                }
                double elapsedTime = System.nanoTime() - startTime;
                //System.out.print(i + "," + (elapsedTime / 1000000000.0) + ",");
                
                // HashSet search test
                startTime = System.nanoTime();
                for (int index = 0; index < numSearches; index++) {
                    hashSet.contains(r.nextInt());
                }
                elapsedTime = System.nanoTime() - startTime;
                //System.out.print((elapsedTime / 1000000000.0) + ",");
                
                // TreeSet insert test
                r = new Random(seed);
                TreeSet<Integer> treeSet = new TreeSet<>();
                startTime = System.nanoTime();
                for (int index = 0; index < size; index++) {
                    treeSet.add(r.nextInt());
                }
                elapsedTime = System.nanoTime() - startTime;
                //System.out.print((elapsedTime / 1000000000.0) + ",");
                
                // TreeSet search test
                startTime = System.nanoTime();
                for (int index = 0; index < numSearches; index++) {
                    treeSet.contains(r.nextInt());
                }
                elapsedTime = System.nanoTime() - startTime;
                //System.out.println((elapsedTime / 1000000000.0));
            }
        }
    }
    
}



