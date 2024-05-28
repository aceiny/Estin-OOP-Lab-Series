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