package course7_8hw.Hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        // create a collection with unique elements (pct 2)
        Assignment a1 = new Assignment(UUID.randomUUID(), 29, "Lesson29", "Chapter14", DifficultyLevel.EASY);
        Assignment a2 = new Assignment(UUID.randomUUID(), 2, "Lesson1", "Chapter14", DifficultyLevel.MEDIUM);
        Assignment a3 = new Assignment(UUID.randomUUID(), 4, "Lesson34", "Chapter 38", DifficultyLevel.HARD);
        Assignment a4 = new Assignment(UUID.randomUUID(), 29, "Lesson29", "Chapter 33", DifficultyLevel.MEDIUM);

        List<Assignment> assignmentList = new ArrayList<>();
        assignmentList.add(a1);
        assignmentList.add(a2);
        assignmentList.add(a3);
        assignmentList.add(a4);
        System.out.println("Lista nesortata: " + assignmentList); //printing the list without sorting it


        // Call Collections.sort
        Collections.sort(assignmentList);

        // print the sorted list
        System.out.println("Lista sortata: " + assignmentList);


        // Put the collection inside a Map to easily lookup by a concatenated String composed of the Course Number + Difficulty Level

        HashMap<String, String> assignmentCollection = new HashMap<>();
        assignmentCollection.put("1", "Medium");
        assignmentCollection.put("5", "Easy");
        assignmentCollection.put("4", "Hard");
        assignmentCollection.put("29", "Medium");
        System.out.println(assignmentCollection); // print the Map collection
        System.out.println(assignmentCollection.get("29")); //print a single element using key
        System.out.println(assignmentCollection.get("5")); //print a single element using key


        //Course 8- pct1.1
        // Using a List<Assignments> as input, use streams and map() to create a List<String> with only their unique IDs.
        //The expected output is: Set<String> uniqueIds = assignmentsList.stream()..... ;


        System.out.println(" \n Creating a list of Strings with only their uniqueIDs");


        Set<String> s = assignmentList.stream()
                .map(n -> n.getUniqueID())
                .peek(s1->System.out.println(s1))
                .collect(Collectors.toSet());



        //1.2. Using a List<Assignments> as input,
        // use streams to return a List<Assignments> filtered to have only Difficulty Levels equal to Easy or Medium

        System.out.println(" \n Assignment list filtred by difficulty level easy or medium");

        List<Assignment> difficulty = assignmentList.stream()
                .filter(x -> x.getMyLev() != DifficultyLevel.HARD)
                .peek(x->System.out.println(x))
                .collect(Collectors.toList());



        //Using a List<Assignments> as input, use streams to return a
        // HashMap having unique IDs as Keys and Assignments as values.
        // The expected output type will be HashMap<String, Assignment>.
        //Hint: Use Collectors.toMap(....) and Function.identity().

        System.out.println("\n Printing a Map having key=uniqueIDs and value= Assignment");

        Map<String, Assignment> map = assignmentList.stream()
                .collect(Collectors.toMap(Assignment::getUniqueID, Function.identity()));
        System.out.println(map);


    }


}














