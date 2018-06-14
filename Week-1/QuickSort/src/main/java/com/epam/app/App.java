package com.epam.app;

/**
 * QuickSort!
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
    	QuickSort(input,0,input.length-1);
    }

    public static void QuickSort(long[] input,int start,int end){
    	if(start < end){
    		int pivot = partition(input,start,end);
    		QuickSort(input,start,pivot-1);
    		QuickSort(input,pivot+1,end);
    	}
    }

    public static int partition(long[] a,int start, int end){
    	long pivot = a[start];
    	int i = end+1;
    	for(int j = end; j > start; j--){
    		if(a[j] >= pivot){
    			i--;
    			long temp = a[i];
    			a[i] = a[j];
    			a[j] = temp;
    		}
    	}
    	i--;
    	long temp = a[i];
    	a[i] = a[start];
    	a[start] = temp;
    	return i;
    }
}
