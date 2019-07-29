package com.array.practice;

import java.util.Arrays;

public class RemoveDuplicationWithSort {

    public int[] removeDuplicates(int[] numbersWithDuplicates) {
        Arrays.sort(numbersWithDuplicates);
        int n = numbersWithDuplicates.length;
        if (n==0 || n==1)
            return numbersWithDuplicates;

        int[] temResultArray = new int[n];
        int j = 0;


        for (int i = 0; i < n-1; i++)

            if (numbersWithDuplicates[i] != numbersWithDuplicates[i+1])
                temResultArray[j++] = numbersWithDuplicates[i];


        temResultArray[j++] = numbersWithDuplicates[n-1];



        int[] finalArray = new int[j];

        for (int i=0; i<j; i++){

            finalArray[i] = temResultArray[i];
        }


        return finalArray;
    }


}
