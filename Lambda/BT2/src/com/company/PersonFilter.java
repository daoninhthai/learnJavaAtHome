package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PersonFilter {
    public static List<Person> filterByPredicate(List<Person> persons, Predicate<Person> predicate){
        List<Person> filteredPerSons = new ArrayList<>();
        for(Person person:persons){
            if(predicate.test(person)){
                filteredPerSons.add(person);
            }
        }
        return filteredPerSons;
    }
}
