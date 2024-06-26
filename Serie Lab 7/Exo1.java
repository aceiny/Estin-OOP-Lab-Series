/*Exercise 1:
1. Declare and Initialise an Array:
● Declare an array of integers with size 10 and initialise it with random values between 1 and 100.
2. Traverse the Array:
● Write a method to traverse the array and print each element.
3. Copy the Array:
● Write a method to copy the original array to a new array using System.arraycopy() and print
both arrays to verify they are identical.

4. Sort the Array:
● Write a method to sort the array using Arrays.sort() and print the sorted array.
5. Search in the Array:
● Write a method to search for a specific value (e.g., 50) in the array using
Arrays.binarySearch().
● If the value is found, print its index; otherwise, print a message indicating the value is not found. */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Exo1{
    public static void copyArray(int[] original) {
        int[] copy = new int[original.length];
        System.arraycopy(original, 0, copy, 0, original.length);
        System.out.println(Arrays.toString(copy));
    }
    public static void sortArray(int[] original) {
        Arrays.sort(original);
        System.out.println(Arrays.toString(original));
    }
    public static void searchArray(int[] original, int value) {
        int found = Arrays.binarySearch(original, value);
        if( found < 0) {
            System.out.println("Value not found");
        }
        else {
            System.out.println("Value found at index: " + found);
        }
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int[] tab = new int[10];  // init the array 
        for (int i = 0; i < tab.length; i++) { 
            tab[i] = 1 + rand.nextInt(100); // fill the array with random numbers
        }
        for (int i : tab) { // traverse the array
            System.out.println(i); 
        }

        copyArray(tab); // copy the array
        sortArray(tab); // sorting the array
        searchArray(tab,50); // search for a value in the array,b
    }
}