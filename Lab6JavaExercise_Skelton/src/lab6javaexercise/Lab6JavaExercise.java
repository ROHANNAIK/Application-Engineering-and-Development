/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6javaexercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author User
 */
public class Lab6JavaExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String text = "Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean";
        System.out.println("****************Word frequency count*******************");
        countFrequency(text);
        int[] arrDuplicateRemoval = {3, 4, 5, 9, 10, 7, 5, 5, 10, 10};
        System.out.println("****************Removal Of Dulicate Value Removal*******************");
        System.out.println("Integer list without removal of duplicate" + Arrays.toString(arrDuplicateRemoval));
        System.out.println("Integer list with removal of duplicate using two for loops" + Arrays.toString(removeDuplicate(arrDuplicateRemoval)));
        System.out.println("Integer list with removal using Sets");
        removeDuplicateHashSet(arrDuplicateRemoval);

        int swapA = 10;
        int swapB = 20;
        System.out.println("****************Number Swapping*******************");
        swap(swapA, swapB);
        System.out.println("****************Number Without temp Swapping*******************");
        swapWithoutTemp(swapA, swapB);
        System.out.println("****************Reversal of String*******************");
        String reverseMe = "ReverseMe";
        System.out.println("Un reverse string-->" + reverseMe);
        reverseMe = reverse(reverseMe);
        System.out.println("Reverse string-->" + reverseMe);
        int[] sortData = {76, 89, 100, 54, 1, 9, 8, 45, 87};
        System.out.println("****************Sorting of Integer Array*******************");
        System.out.println("Unsorted Data-->" + Arrays.toString(sortData));
        sortData = bubbleSort(sortData);
        System.out.println("Sorted Data-->" + Arrays.toString(sortData));
        ArrayList<Animal> animalList = new ArrayList<>();

        String[] animalName = {"Dog", "Cat", "Girrafe", "Elephant"};
        List<String> names = Arrays.asList(animalName);
        Collections.shuffle(names);
        for (String name : names) {
            Animal animal = new Animal();
            animal.setName(name);
            Random r = new Random();
            int minAge = 10;
            int maxAge = 40;
            int age = r.nextInt(maxAge - minAge) + minAge;
            animal.setAge(age);
            animalList.add(animal);
        }
        System.out.println("****************Sorting of Objects using Age Factor*******************");
        System.out.println("Animals without Sorting of Age-->" + Arrays.toString(animalList.toArray()));
        Collections.sort(animalList, Animal.ASCENDING_COMPARATOR);
        System.out.println("Animals with sorting on Age-->" + Arrays.toString(animalList.toArray()));
        System.out.println("****************Filtering Objects*******************");
        System.out.println("Get animals between age 10 and 20" + getAnimalBetweenRange(animalList, 10, 20));
        System.out.println("****************Fibbonacci Series*******************");
        int count = 10;
        System.out.print(n1 + " " + n2);//printing 0 and 1    
        printFibonacci(count - 2);//n-2 because 2 numbers are already printed  

    }

    //Method to remove the duplicate values from an integer array
    public static int[] removeDuplicate(int[] arrayWithDuplicates) {
        //Assuming all elements in input array are unique
        //Comparing each element with all other elements
        //If any two elements are found equal
        //Replace duplicate element with last unique element
        //Decrementing noOfUniqueElements
        //Decrementing j
        //Copying only unique elements of arrayWithDuplicates into arrayWithoutDuplicates
        return arrayWithDuplicates;
    }

    public static void removeDuplicateHashSet(int[] input) {
        
    }

    //Method to count the frequency of words in the Text
    public static void countFrequency(String text) {
        //Use HashMap
    }

    //Method to Swap with temp
    public static void swap(int a, int b) {
        
        int temp;
        a = 10; b= 20;
        System.out.println("Before swapping a:" +a + " b" +b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping a:" +a + " b" +b );
        
    }

    //Method to Swap without temp
    public static void swapWithoutTemp(int a, int b) {
       //Use maths
    }

    //Method to reverse a String
    public static String reverse(String input) {
        //Use char array
        //Compare the 1st and last character and swap it keep on doing that
        return input;
    }

    //Method to Sort data
    public static int[] bubbleSort(int[] input) {
        //for all elements of list
        /* compare the adjacent elements */ 
        /* swap them */
        return input;
    }

    //Method to Search values between range
    public static ArrayList<Animal> getAnimalBetweenRange(ArrayList<Animal> animalList, int range1, int range2) {
        ArrayList<Animal> temp = new ArrayList();
        //Simple For each loop and use if condiction
        return temp;
    }
    //Method to generate Fibbonacci series
    static int n1 = 0, n2 = 1, n3 = 0;

    static void printFibonacci(int count) {
        
    }
}
