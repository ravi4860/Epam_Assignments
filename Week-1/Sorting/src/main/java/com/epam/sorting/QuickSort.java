package com.epam.sorting;

/**
 * QuickSort!
 *
 */

import java.util.*;

public class QuickSort{
	
	private final Scanner scan = new Scanner(System.in);

	public void sort(int[] array){ // for sorting integer array using Quicksort technique;
		QuickSort(array,0,array.length-1);
	}
	public void QuickSort(int[] array, int start, int end){ // The QuickSort method.
		if(start < end){
			int pivot = partition(array,start,end);
			QuickSort(array,start,pivot-1);
			QuickSort(array,pivot+1,end);
		}
	}

	public int partition(int[] array,int start, int end){ // The partition method.
		int pivot = array[end];
		int pivotPosition = start -1 ;

		for(int indexJ = start; indexJ < end; indexJ++){
			if(array[indexJ] < pivot){
				pivotPosition++;
				int temp = array[indexJ];
				array[indexJ] = array[pivotPosition];
				array[pivotPosition] = temp;
			}
		}

		pivotPosition++;
		int temp = array[end];
		array[end] = array[pivotPosition];
		array[pivotPosition] = temp;
		return pivotPosition;
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
		
		QuickSort quick = new QuickSort();
		int[] array = quick.getInput();
		quick.sort(array);
		quick.display(array);

	}
}

