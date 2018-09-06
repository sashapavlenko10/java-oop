package src;

import java.util.Arrays;
import java.util.Scanner;

public class Task_3_3 {
	 public static void main(String[] args) {
	        int[] array = new int[4];
	        Scanner scanner = new Scanner(System.in);
	        int i = 0;
	        while (i<4) {
	            System.out.println("Enter " + (i+1) + " integer: ");
	            array[i] = scanner.nextInt();
	            i++;
	        }

	        int[] arr1 = Arrays.copyOfRange(array, 0, 2);
	        int[] arr2 = Arrays.copyOfRange(array, 2, 4);
	      

	        System.out.println(Arrays.toString(arr1));
	        System.out.println(Arrays.toString(arr2));
	    }
	}