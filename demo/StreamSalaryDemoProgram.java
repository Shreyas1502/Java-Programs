package StreamAPI.demo;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import static java.util.Arrays.asList;

public class StreamSalaryDemoProgram {
    public static void main(String[] args) {
        List<Double> salaryList=asList(55000.00,22000.00,15000.00,8800.00,18000.00,14000.00,1000.00,25000.00);

        System.out.println("all list");
        salaryList.stream().forEach(s->System.out.println(s));

        System.out.println("Bonus");
        Function<Double,Double> fun=s->s+5550;
        salaryList.stream().filter(s->s<20000.00).map(fun).forEach(j->System.out.println(j));


        System.out.println("deduct");
        Function<Double,Double> deduct=s->s*0.9;
        salaryList.stream().filter(s->s>50000.00).map(deduct).forEach(s->System.out.println(s));


        System.out.println("Sort from high to low");
//        Comparator<Double> comp=Comparator.reverseOrder();
        Comparator<Double> comp=(obj1,obj2)-> {
            if (obj1<obj2){
                return 1;
            }return -1;
        };
        salaryList.stream().sorted(comp).forEach(k->System.out.println(k));

        System.out.println("max");
        Comparator<Double> maxComp=(obj1,obj2)-> {
            if (obj1>obj2){
                return 1;
            }return -1;
        };
        double max=salaryList.stream().max(maxComp).get();
        System.out.println(max);


        System.out.println("min");
        Comparator<Double> minComp=(obj1,obj2)-> {
            if (obj1>obj2){
                return 1;
            }return -1;
        };
        double min=salaryList.stream().min(minComp).get();
        System.out.println(min);

        System.out.println("Total salary");
        //salaryList.stream().reduce(0.0, Double::sum)
        System.out.println(salaryList.stream().reduce(0.0,(sum,sal)-> sum + sal));
    }
}