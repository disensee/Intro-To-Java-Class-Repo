package com.dylanisensee.samplecode;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListSample {

    public static void main(String[] args) {

        // ArrayLists are like arrays on steroids.
        // The are much easier to work with than regular arrays.

        // The ArrayList class is in the java.util package, and you must import it
        // to use it your code.

        // Here is the official documentation for the ArrayList class
        // https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

        // Like regular arrays, you should declare the data type that will be stored.
        // But the syntax is a little different in that we use <> to specify the data
        // type rather than [].
        // Unlike regular arrays, you don't have to specify the length.

        // STEP 1 - create an array list of Strings
        ArrayList<String> myStrings = new ArrayList();

        // STEP 2 - add and remove elements from the list
        // You can also easily add and remove elements from an ArrayList
        // by using the add() and remove() methods
        myStrings.add("hello");
        myStrings.add("there!");
        
        myStrings.remove(0);

        // STEP 3 - many of the methods are overloaded
        // Note that the add() and remove() methods are overloaded
        
        

        // STEP 4 - check the size of the list
        // In order to see how many elements are in an ArrayList
        // use the size() method.
        System.out.println(myStrings.size());

        // STEP 5
        // loop through an ArrayList with a regular for loop
        for(int x = 0; x < myStrings.size(); x++) {
        	System.out.println(myStrings.get(x));
        }
        

        // STEP 6
        // loop through an ArrayList with an 'enhanced for loop'
        for(String s : myStrings) {
        	System.out.println(s);
        }
        

        // STEP 7
        // create an arraylist of Date objects
        // and loop through it, and make each dog bark
        ArrayList<Date> dates = new ArrayList();
        Date d1 = new Date(100, 0, 1);
        dates.add(d1);
        dates.add(new Date());
        dates.remove(d1);

        for(Date d : dates) {
        	System.out.println(d.toString());
        }
        
    }

}