/*(Perform set operations on hash sets) Given two stacks of textbooks of the 
following subjects {"Chemistry", "Mathematics", "Biology", "Eng1ish"}
and {"Biology", "English", "Geography", "Physics"} respectively, find
the subjects that are (1) only present in the first stack; (2) only present in the
second stack; (3) present in both stacks. (You may clone the sets to preserve the
original sets from being changed by set methods.)
*/
package assignment_week_3;

import java.util.HashSet;
import java.util.Set;

public class HashSetTextBook {
    public static void main(String[] args) {
        Set<String> firstStack = new HashSet<>();
        firstStack.add("Chemistry");
        firstStack.add("Mathematics");
        firstStack.add("Biology");
        firstStack.add("English");

        Set<String> secondStack = new HashSet<>();
        secondStack.add("Biology");
        secondStack.add("English");
        secondStack.add("Geography");
        secondStack.add("Physics");
        
        Set<String> firstStackClone = new HashSet<>(firstStack);
        Set<String> secondStackClone = new HashSet<>(secondStack);

        firstStackClone.removeAll(secondStack);
        System.out.println("Subjects only present in the first stack: " + firstStackClone);

     
        secondStackClone.removeAll(firstStack);
        System.out.println("Subjects only present in the second stack: " + secondStackClone);

        
        firstStack.retainAll(secondStack);
        System.out.println("Subjects present in both stacks: " + firstStack);
    }
}
