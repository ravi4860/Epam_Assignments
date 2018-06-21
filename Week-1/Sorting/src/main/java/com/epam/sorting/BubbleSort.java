package com.epam.sorting;

/**
 * BubbleSort!
 *
 */
import java.util.*;

public class BubbleSort{

	private final Scanner scan = new Scanner(System.in);

	public void sort(int[] array){ //for sorting array elements using bubbleSort technique.
		for(int indexI = 0;indexI < array.length-1; indexI++){
			boolean swapped = consecutiveSwapping(array,indexI);
			if(!swapped)
				break;
		}
	}
	

	public boolean consecutiveSwapping(int[] array,int indexI){ //for rearranging two consecutive elements with smaller being left
		boolean swapped = false;
		for(int indexJ = 0; indexJ < array.length-indexI-1; indexJ++){
				if(array[indexJ] > array[indexJ+1]){
					swap(indexJ,indexJ+1,array);
					swapped = true;
				}
		}
		return swapped;
	}

	public void swap(int index1, int index2,int[] array){ // for exchanging two indices of an array.
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	public void display(int[] array){ // for displaying the contents of int[] array.
		
		for(int index = 0;index < array.length; index++){ 
			System.out.print(array[index] + " ");
		}
		System.out.println();
	}

	public int[] getInput(){ //for taking input from the user.
		
		int lengthOfInput = scan.nextInt();
		int[] array = new int[lengthOfInput];

		for(int index = 0;index < lengthOfInput; index++){
			array[index] = scan.nextInt();
		}
		return array;
	}

	public static void main(String[] args){ // main method
		
		BubbleSort bubble = new BubbleSort();
		int[] array = bubble.getInput();
		bubble.sort(array);
		bubble.display(array);

	}
	
}


