package com.tryCloud.stepDefinitions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Marwan on 12/24/2021 around 7:20 AM
 */
public class Test {

    String name = "Marwan";

    static {
        System.out.println("Good morning");
    }

    {
        System.out.println("how is everything");
    }

    public String toString() {
        return "Hello Mr " + name;
    }

    public static void main(String[] args) {
//        System.out.println("How are you guys doing");
//
//        Test test = new Test();
//        System.out.println(test);

        int[] arr = {3, 5, 8, 4, 0, 9, 12, 1, 7};
        int[] arr1 = {3, 5, 8, 4, 0, 9, 12, 7, 1};

        System.out.println(Arrays.equals(arr,arr1));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        List<Integer> list = new ArrayList<>(Arrays.asList(0,8,9,6,5,4,7,3,2));

        System.out.println(Arrays.toString(arr));


        Collections.sort(list);
        System.out.println(list);

        int[] arr3 = Arrays.copyOfRange(arr, 0,arr.length);
        System.out.println(Arrays.toString(arr3));

        if (System.out.printf("Hello Man\n").equals("")){

        }
        while (System.out.append("hello hello").equals(" ")){

        }
    }
}
