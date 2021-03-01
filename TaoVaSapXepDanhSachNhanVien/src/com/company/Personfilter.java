package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Personfilter {
    public static List<Person> filterByPredicate(List<Person> persons, Predicate<Person>  predicate){
        Predicate<Person> agePredicate =person -> person.getAge() >=32;
        List<Person> filteredPersons = new ArrayList<>();
        for(Person person:persons){
            if(predicate.test(person)){
                filteredPersons.add(person);
            }
        }
        return filteredPersons;
    }
}
