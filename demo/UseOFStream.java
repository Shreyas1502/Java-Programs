package StreamAPI.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class UseOFStream {
    public static void main(String[] args) {
        List<Integer> listOfMarks=new ArrayList<>();
        listOfMarks.add(30);
        listOfMarks.add(35);
        listOfMarks.add(26);
        listOfMarks.add(66);
        listOfMarks.add(40);
        listOfMarks.add(32);

        //fetch all marks
        Stream<Integer> streamOfMarks=listOfMarks.stream();
        streamOfMarks.forEach(m->System.out.println(m));

        //NOTE: if we use same stream object again it will get runtime error as IllegalStateException

        //fetch passing marks using filter(predicate).forEach(consumer)

        System.out.println("Passing marks all");
        //creating Predicate object to pass in filter
        Predicate<Integer> predicate=(m)->{if (m>=35){
        return true;}return false;
        };
        //we can also write like this
        //Predicate<Integer> predicate=m->m>=35;

        Consumer<Integer> consumer=m->System.out.println(m);
        listOfMarks.stream().filter(predicate).forEach(consumer);
        //or else we can write it like this below
        System.out.println("Failed marks");
        listOfMarks.stream().filter(m->m<35).forEach(m->System.out.println(m));

        //Printing only first three objects from list using limit(maxsize) method
        //forEach(consumer) ---- consumer doesn't return anything, it has accept() method;
        System.out.println("Printing first 3 objects from list");
        listOfMarks.stream().limit(3).forEach(m->System.out.println(m));

        //Printing only by skipping first three objects from list using skip(index) method
        System.out.println("Skip first 3 objects from list");
        listOfMarks.stream().skip(3).forEach(m->System.out.println(m));

        //I want to count all pass ed marks
        System.out.println("Count passed marks");
        int countOfPassed= (int) listOfMarks.stream().filter(m->m>=35).count();
        System.out.println(countOfPassed);

        //In want to fetch marks >=30 and <35  and add 5 grace marks to it
        System.out.println("Adding grace marks");
        Function<Integer,Integer> function=(marks)-> {return marks+5;};
        listOfMarks.stream().filter(mark->mark>=30 && mark<35).map(function).forEach(j->System.out.println(j));


        //Want to sort all marks in ascending order
        /*
        sorted() method is non terminal method in stream
        sorted() without parameter is by default calls the int compareTo(Object object) of Comparable Interface

         */
        System.out.println("After sorting in ascending order");
        listOfMarks.stream().sorted().forEach(k->System.out.println(k));

        //using comparator in sorted method for decending order
        System.out.println("After sorting in decending order");

        Comparator<Integer> comparator= (obj1,obj2)->{
            if(obj1<obj2){
                return 1;
            }return -1;
        };

        listOfMarks.stream().sorted(comparator).forEach(k->System.out.println(k));

        //Find max marks in stream
        System.out.println("find max marks");

        Comparator<Integer> maxMark= (obj1,obj2)->{
            if(obj1>obj2){
                return 1;
            }return -1;
        };

        int max=listOfMarks.stream().max(maxMark).get();
        System.out.println(max);

        //find min marks
        System.out.println("find max marks");

        Comparator<Integer> minMark= (obj1,obj2)->{
            if(obj1<obj2){
                return 1;
            }return -1;
        };

        int min=listOfMarks.stream().max(minMark).get();
        System.out.println(min);


    }
}
