package src;

import java.util.Arrays;

public class Task_5_2 {
	
		public static void main(String[] args) {
			int [] arr = {1,2,4};
			incrementFirst(arr);
			String  strArray = Arrays.toString(arr);
			System.err.println(strArray);
			System.err.println();
			
			int [] arrEmpty ={};
			incrementFirst(arrEmpty);
			strArray =  Arrays.toString(arr);
			System.out.println(strArray);
			
		}
			static void incrementFirst (int[] array ){ 
				assert array.length > 0;
				array [0] ++;
			}
		}

