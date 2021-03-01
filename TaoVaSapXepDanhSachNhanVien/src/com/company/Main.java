package com.company;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
          //1.Tạo một danh sách(List) các object
          List<Person> persons = Person.generateListOfPersons();
          /*
          Collections.sort(persons, (Person person1, Person person2) -> {
              return person2.getName().compareTo(person1.getName());
          });
          */
          //Sắp xếp theo tuổi
    //       Collections.sort(persons, (Person person1, Person person2) -> person2.getAge().compareTo(person1.getAge()));
    //       System.out.println("List after sorted");
    //       for(Person person: persons) {
    //           person.showDetails();
    // }
    
    // Loc voi predicate
    Predicate<Person> agePredicate = person -> person.getAge() > 30 && person.getAge() < 40;
        List<Person> filteredPerson = Personfilter.filterByPredicate(persons,agePredicate);
        System.out.println("List after sorted");
        for(Person person: filteredPerson) {
            person.showDetails();
        }
}
}