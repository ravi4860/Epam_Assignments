package com.epam.app;


/**
 * Merge Sort!
 *
 */
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
      Scanner scan = new Scanner(System.in);

      int inputSize = scan.nextInt();
      long input[] = new long[inputSize];
      // long input[] = {5,1,4,34,6,35,234};
      for(int i = 0;i < inputSize;i++){
        input[i]= scan.nextLong();
      }
      sort(input);
      display(input);
    }
    public static void display(long[] input){
      for(int i = 0; i < input.length; i++){
        System.out.print(input[i] + " ");
      }
      System.out.println();
    }
    public static void sort(long[] input){
    	mergeSort(input,0,input.length-1);
    }

    public static void mergeSort(long[] input,int start,int end){
    	if(start < end){
    		int mid = (start+end)/2;
    		mergeSort(input,start,mid);
    		mergeSort(input,mid+1,end);
    		merge(input,start,mid,end);
    	}
    }

    public static void merge(long[] input,int start,int mid,int end){
    	int l1 = mid-start + 1;
    	int l2 = end-mid;

    	long[] left=new long[l1+1];
    	long[] right = new long[l2+1];

    	int index = start;
    	int m= 0;
    	for(m = 0; m < l1; m++){
    		left[m] = input[index];
    		index++;
    	}

    	left[m] = Integer.MAX_VALUE;

    	for(m = 0; m < l2; m++){
    		right[m] = input[index];
    		index++;
    	}

    	right[m] = Integer.MAX_VALUE;

    	int i = 0;
    	int j = 0;
    	for(int k = start; k<=end;k++){
    		if(left[i] <= right[j]){
    			input[k] = left[i];
    			i++;
    		}
    		else{
    			input[k] = right[j];
    			j++;
    		}
    	}
    }
}
