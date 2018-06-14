package com.epam.bubblesort;

import java.util.Scanner;
/**
 * Bubble sort!
 *
 */
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
      bubbleSort(input);
      display(input);
    }
    public static void display(long[] input){
      for(int i = 0; i < input.length; i++){
        System.out.print(input[i] + " ");
      }
      System.out.println();
    }

    public static void bubbleSort(long[] input){
      for(int i = 0;i < input.length-1; i++){
        boolean swapped = false;
        for(int j = 0; j < input.length-i-1; j++){
          if(input[j] > input[j+1]){
              long temp = input[j];
              input[j] = input[j+1];
              input[j+1] = temp;
              swapped = true;
          }
        }
        if(!swapped)
          break;
      }
    }


}
