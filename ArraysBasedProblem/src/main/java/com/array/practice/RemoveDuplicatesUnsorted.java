package com.array.practice;

public class RemoveDuplicatesUnsorted {

    public int[] removeDuplicates(int[] inputArray){
        int length = inputArray.length;
        boolean[] resultBoolean = new boolean[length];

        for (int i = 0; i <length ; i++) {
            for (int j = i+1; j < length; j++) {
                if (inputArray[i]==inputArray[j]){
                    resultBoolean[j]= true;
                }
            }
        }

        int resultCount= 0;
        for (boolean duplicates:resultBoolean) {
            if(!duplicates)
                resultCount++;

        }

        int[] noDuplicatesArray= new int[resultCount];
        for (int i=0,j=0; i < inputArray.length; i++) {
            if(!resultBoolean[i]){
                noDuplicatesArray[j]=inputArray[i];
                j++;
            }
        }

        return noDuplicatesArray;
    }
  /*// for testing purpose while coding
    public static void main(String[] args) {
        int[] numbersWithDuplicates = new int[]{0, 7, 1, 6, 5, 5, 9,9};
        RemoveDuplicatesUnsorted removeDuplicatesUnsorted = new RemoveDuplicatesUnsorted();
       int[] finalResult= removeDuplicatesUnsorted.removeDuplicates(numbersWithDuplicates);
        for (int i = 0; i <finalResult.length ; i++) {
            System.out.println(finalResult[i]);
        }
    }*/
}
