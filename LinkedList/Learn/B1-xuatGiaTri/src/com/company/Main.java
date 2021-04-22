package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList =new LinkedList<>();
        linkedList.add(1);
        linkedList.add(0);
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(1,32);

        System.out.println("----duyet theo for thong thuong----");
        for(int i = 0 ; i < linkedList.size();i++ ){
            System.out.print(linkedList.get(i)+"\t");
        }
        System.out.println();
        System.out.println("----duyet theo doi tuong----");
        for(int i :linkedList){
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("----duyet theo iterator----");
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
        System.out.println();
        System.out.println("----duyet theo ListIterator----");
        ListIterator<Integer> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next()+"\t");
        }
        System.out.println();
        System.out.println("duyet nguoc bang listIterator");
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+"\t");
        }

    }
}
