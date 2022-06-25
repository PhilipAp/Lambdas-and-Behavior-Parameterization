package com.philip.PSC;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {

    public static void main(String[] args) {

        //PREDICATE EXAMPLE
//        Predicate<Integer> positive = i -> i > 0;
//        List<Integer> integerList = new ArrayList<>();
//        integerList.add(1);
//        integerList.add(10);
//        integerList.add(200);
//        integerList.add(101);
//        integerList.add(-10);
//        integerList.add(0);
//        List<Integer> filteredList = filterList(integerList, positive);
//        filteredList.forEach(System.out::println);
//    }
//    public static List<Integer> filterList(List<Integer> listOfIntegers, Predicate<Integer> predicate){
//        List<Integer> filteredList = new ArrayList<>();
//        for(Integer integer:listOfIntegers){
//            if(predicate.test(integer)){
//                filteredList.add(integer);
//            }
//        }
//        return filteredList;
//
//    }


        //PREDICATE EXAMPLE
        //Supplier instance with lambda expression

        //Supplier<String> helloStrSupplier = () -> new String("Hello");
        //String helloStr = helloStrSupplier.get();
        //System.out.println("String in helloStr is-> "+helloStr+" <-");

        //Supplier instance using method reference to default constructor

        //Supplier<String> emptyStrSupplier = String::new;
        //String emptyStr = emptyStrSupplier.get();
        //System.out.println("String in emptyStr is-> "+emptyStr+ " <-");

        //Supplier instance using method reference to a static method

        //Supplier<Date> dateSupplier= Test::getSystemDate;
        //Date systemDate = dateSupplier.get();
        //System.out.println("systemDate-> " + systemDate);
        // }
        // public static Date getSystemDate() {
        //   return new Date();
        //}


        Consumer<Integer> consumer= i-> System.out.print(" " +i);
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(10);
        integerList.add(200);
        integerList.add(101);
        integerList.add(-10);
        integerList.add(0);
        printList(integerList, consumer);
    }
    public static void printList(List<Integer> listOfIntegers, Consumer<Integer> consumer){
        for(Integer integer:listOfIntegers){
            consumer.accept(integer);
        }
    }

}





