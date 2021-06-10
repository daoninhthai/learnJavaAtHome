package com.company;

import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        List<Person> personList = Person.generateListOfPersons();
        Predicate<Person> agePredicate = person -> person.getAge()>30 && person.getAge()<40;
        List<Person> filterPerson = PersonFilter.filterByPredicate(personList,agePredicate);
        System.out.println("Danh sach sau khi sap xep :");
        for(Person person: filterPerson){
            person.showDetails();
        }
    }

}
