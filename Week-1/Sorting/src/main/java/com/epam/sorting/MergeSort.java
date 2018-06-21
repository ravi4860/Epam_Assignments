package com.epam.sorting;

/**
 * MergeSort!
 *
 */

import java.util.*;

public class MergeSort{
	
	private final Scanner scan = new Scanner(System.in);

	public void sort(int[] array){	// To sort integer array elements using MergeSort technique;
		MergeSort(array,0,array.length-1);
	}

	public void MergeSort(int[] array, int start, int end){ // MergeSort method.
		if(start < end){
			int mid = (start + end)/2;
			MergeSort(array,start,mid);
			MergeSort(array,mid+1,end);
			merge(array,start,mid,end);
		}
	}

	public void merge(int[] array,int start, int mid, int end){ // Merge method.
		int leftArraySize = mid-start+1;
		int rightArraySize = end-mid;

		int[] leftArray = new int[leftArraySize+1];
		int[] rightArray = new int[rightArraySize+1];

		int index = start;
		index = fillArray(leftArray,index,array);
		index = fillArray(rightArray,index,array);

		//merging left and right arrays.
		mergeTwoArrays(leftArray,rightArray,array,start,end);
		
	}
	public int fillArray(int[] result,int index,int[] array){ // for adding elements to the left and right temporary arrays from the actual array
		int indexM;
		for( indexM = 0; indexM < result.length-1; indexM++){
			result[indexM] = array[index++];
		}
		result[indexM] = Integer.MAX_VALUE;

		return index;
	}

	public void mergeTwoArrays(int[] left,int[] right,int[] array,int start, int end){ // for merging two temporary arrays into the actual array

		for(int indexLeft = 0,indexRight = 0,indexM = start; indexM <= end; indexM++){
			if(left[indexLeft] < right[indexRight])
				array[indexM] = left[indexLeft++];
			else
				array[indexM] = right[indexRight++];
		}
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

		MergeSort merge = new MergeSort();
		int[] array = merge.getInput();
		merge.sort(array);
		merge.display(array);

	}
}
