package com.array.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDuplicateRemoverGeneric {

    public static <T> T[] removeDuplicates(T[] input, Class<T> clazz) {
        T[] output = (T[]) Array.newInstance(clazz, 0);
        for (T t : input) {
            if (!inArray(t, output)) {
                output = Arrays.copyOf(output, output.length + 1);
                output[output.length - 1] = t;
            }
        }
        return output;
    }

    private static <T> boolean inArray(T search, T[] array) {
        for (T element : array) {
            if (element.equals(search)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] array = {0, 1, 2, 2, 3, 3, 3, 3, 4};
        testArrayDuplicatesRemover(array);
    }

    private static void testArrayDuplicatesRemover(Integer[] array) {
        final Integer[] expectedResult = {0,1, 2, 3, 4};
        Integer[] arrayWithoutDuplicates = ArrayDuplicateRemoverGeneric.removeDuplicates(array, Integer.class);
        System.out.println("Array without duplicates is supposed to be: " + Arrays.toString(expectedResult));
        System.out.println("Array without duplicates currently is: " + Arrays.toString(arrayWithoutDuplicates));
        System.out.println("Is test passed ok?: " + (Arrays.equals(arrayWithoutDuplicates, expectedResult) ? "YES" : "NO"));
    }
}
