/********************************************************************************************************************
 ********************************************************************************************************************
 *****                                         Chapter 20: Problem 4                                            *****
 *****__________________________________________________________________________________________________________*****
 *****                                    4.  Do problem 20.10 on page 809.                                     *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****                                 Perform set operations on priority queues.                               *****
 *****                                        Create two priority queues,                                       *****
 *****                          {"George", "Jim", "John", "Blake", "Kevin", "Michael"}                          *****
 *****                          {"George", "Katie", "Kevin", "Michelle", "Ryan"},                               *****
 *****                              and find their union, difference, and intersection.                         *****                                                                         *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****         Union - combine all unique elements from both PriorityQueues                                     *****
 *****    Difference - elements that are in only one PriorityQueue (not in both)                                *****
 *****  Intersection - elements that are in both PriorityQueues                                                 *****
 ********************************************************************************************************************
 ********************************************************************************************************************/

// IMPORTS of needed tools and plug-ins
import java.util.PriorityQueue;


public class Chapter20_4 {


    public static void main(String[] args) {

        // LOCAL VARIABLE(s) declaration(s)
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        PriorityQueue<String> pq2 = new PriorityQueue<>();

        // Add names to the first PriorityQueue (pq1)
        pq1.add("George");
        pq1.add("Jim");
        pq1.add("John");
        pq1.add("Blake");
        pq1.add("Kevin");
        pq1.add("Michael");

        // Add names to the second PriorityQueue (pq2)
        pq2.add("George");
        pq2.add("Katie");
        pq2.add("Kevin");
        pq2.add("Michelle");
        pq2.add("Ryan");

        // Create three PriorityQueues (one for Union, one for Difference and one for Intersection)
        PriorityQueue<String> union = new PriorityQueue<>();
        PriorityQueue<String> difference = new PriorityQueue<>();
        PriorityQueue<String> intersection = new PriorityQueue<>();

        // Add all of the first PriorityQueue (pq1) to the Union PriorityQueue (union)
        union.addAll(pq1);

        // Enhanced for loop to go through all the elements of the second PriorityQueue (pq2)
        for(String str : pq2){
            // If the current String element is not already in the Union PriorityQueue (union),
                // then add that String element to the Union PriorityQueue (union)
            if(!union.contains(str)){
                union.add(str);
            }
        }

        // Print to the console the Union PriorityQueue (union)
        System.out.println(union);

        // Add all the elements of the Union PriorityQueue (union) to the Difference PriorityQueue (difference)
        difference.addAll(union);

        // Enhanced for loop to go through all of the Union PriorityQueue (union)
        for(String str : union){
            // if statement block to check if the current String element in the Union PriorityQueue (union)
                // is also in the second PriorityQueue (pq2). If so, remove that String element from the
                // Difference PriorityQueue (difference)
            if(pq2.contains(str)){
                difference.remove(str);
            }
        }

        // Print to the console the Difference PriorityQueue (difference)
        System.out.println(difference);

        // Enhanced for loop to go through all of the first PriorityQueue (pq1)
        for(String str : pq1){
            // if statement block that checks if the second PriorityQueue (pq2) contains the current String element
                // from the first PriorityQueue (pq1). If so, add that String element to the Intersection
                // PriorityQueue (intersection)
            if(pq2.contains(str)){
                intersection.add(str);
            }
        }

        // Print to the console the Intersection PriorityQueue (intersection)
        System.out.println(intersection);
    }
}
