package StreamAPI.demo;

import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class StreamCityNames {
    public static void main(String[] args) {
        List<String> cities=asList("pune","AhmadNagar","bhopal","Kolkata","Mumbai","Sangli","chandigrah");

        //convert stream  to set or list using collect(Collecctor
     Set<String> cityWithA;
        cityWithA = cities.stream().filter(s->s.startsWith("A")||s.startsWith("a")).collect(Collectors.toSet());
        List<String> cityWithB;
        cityWithB = cities.stream().filter(s->s.startsWith("B")||s.startsWith("b")).collect(Collectors.toList());
        cities.stream().filter(s->s.matches("^[ABCabc].*")).forEach(s->System.out.println(s));
    }
}
