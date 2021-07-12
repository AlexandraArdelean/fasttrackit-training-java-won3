package course7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) {
        // create a collection with unique elements (pct 2)
        Assignment a1 = new Assignment(UUID.randomUUID(), 1, "Lesson1", "Chapter14");
        Assignment a2 = new Assignment(UUID.randomUUID(), 5, "Lesson58", "Chapter68");
        Assignment a3 = new Assignment(UUID.randomUUID(), 4, "Lesson34", "Chapter 38");
        Assignment a4 = new Assignment(UUID.randomUUID(), 29, "Lesson29", "Chapter 33");

        List<Assignment> assignmentList = new ArrayList<>();
        assignmentList.add(a1);
        assignmentList.add(a2);
        assignmentList.add(a3);
        assignmentList.add(a4);
        System.out.println(assignmentList); //printing the list without sorting it

        // creating an object ComparedByCourseNum (pct 3)
        AssignmentComparedByCourseNum assign = new AssignmentComparedByCourseNum();

        // Call Collections.sort
        Collections.sort(assignmentList, assign);

        // print the sorted list
        System.out.println(assignmentList);


        // converting the enum into String and using compareTo method
        DifficultyLevel difLev = DifficultyLevel.EASY;
        difLev.toString().compareTo("");
        DifficultyLevel difLev2 = DifficultyLevel.MEDIUM;
        difLev2.toString().compareTo("");
        DifficultyLevel difLev3 = DifficultyLevel.HARD;
        difLev3.toString().compareTo("");

        // creating an object AssignmentComparedByNumAndTitle (pct 4)
        AssignmentComparedByNumAndTitle assign2 = new AssignmentComparedByNumAndTitle();

        // Call Collections.sort
        Collections.sort(assignmentList, assign2);
        // print the sorted list
        System.out.println(assignmentList);

        // Put the collection inside a Map to easily lookup by a concatenated String composed of the Course Number + Difficulty Level

        HashMap<String,String> assignmentCollection = new HashMap<>();
        assignmentCollection.put("1","Medium");
        assignmentCollection.put("5","Easy");
        assignmentCollection.put("4", "Hard");
        assignmentCollection.put("29", "Medium");
        System.out.println(assignmentCollection); // print the collection
        System.out.println(assignmentCollection.get("29")); //print a single element using key
        System.out.println(assignmentCollection.get("5")); //print a single element using key
    }

}














