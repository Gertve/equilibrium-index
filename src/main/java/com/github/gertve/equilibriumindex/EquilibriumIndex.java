package com.github.gertve.equilibriumindex;

import java.util.Arrays;

/**
 * Created by Gert on 2017-07-13.
 */
public class EquilibriumIndex {

    /**
     * Calculates the Equilibrium Index for an Array. Returns -1 if no equilibrium index can be found
     * @param intArray
     * @return
     */
    public int calculateEquilibriumIndex(int[] intArray){

        int sumRight = 0;
        int sumLeft = 0;

        for(int i: intArray){
            sumRight += i;
        }

        for(int i = 0; i < intArray.length; i++){

            sumRight -= intArray[i];

            if(sumRight == sumLeft){
                return i;
            }

            sumLeft += intArray[i];
        }

        return -1;
    }

    /**
     * Generates an array with a lenght of n. This is used for testing
     * @param n
     * @return
     */
    public int[] generateArray(int n){
        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = (int) (Math.random() * 10);
        }

        return array;
    }


    public static void main(String[] args){
        EquilibriumIndex equilibriumIndex = new EquilibriumIndex();
        int[] array1 = equilibriumIndex.generateArray(10);
        int eqi1 = equilibriumIndex.calculateEquilibriumIndex(array1);
        System.out.println("Array 1: " + Arrays.toString(array1));
        if(eqi1 == -1){
            System.out.println("There is no equilibrium index for Array1");
        } else {
            System.out.println("Equilibrium Index for Array 1 is: " + eqi1);
        }

        int[] array2 = equilibriumIndex.generateArray(15);
        int eqi2 = equilibriumIndex.calculateEquilibriumIndex(array2);
        System.out.println("Array 2: " + Arrays.toString(array2));
        if(eqi2 == -1){
            System.out.println("There is no equilibrium index for Array2");
        } else {
            System.out.println("Equilibrium Index for Array 2 is: " + eqi2);
        }

        int[] array3 = equilibriumIndex.generateArray(30);
        int eqi3 = equilibriumIndex.calculateEquilibriumIndex(array3);
        System.out.println("Array 3: " + Arrays.toString(array3));
        if(eqi3 == -1){
            System.out.println("There is no equilibrium index for Array3");
        } else {
            System.out.println("Equilibrium Index for Array 3 is: " + eqi3);
        }

        int[] array4 = equilibriumIndex.generateArray(40);
        int eqi4 = equilibriumIndex.calculateEquilibriumIndex(array4);
        System.out.println("Array 4: " + Arrays.toString(array4));
        if(eqi4 == -1){
            System.out.println("There is no equilibrium index for Array4");
        } else {
            System.out.println("Equilibrium Index for Array 4 is: " + eqi4);
        }

        int[] array5 = equilibriumIndex.generateArray(50);
        int eqi5 = equilibriumIndex.calculateEquilibriumIndex(array5);
        System.out.println("Array 5: " + Arrays.toString(array5));
        if(eqi5 == -1){
            System.out.println("There is no equilibrium index for Array5");
        } else {
            System.out.println("Equilibrium Index for Array 5 is: " + eqi5);
        }


        int[] array6 = equilibriumIndex.generateArray(100);
        int eqi6 = equilibriumIndex.calculateEquilibriumIndex(array6);
        System.out.println("Array 6: " + Arrays.toString(array6));
        if(eqi6 == -1){
            System.out.println("There is no equilibrium index for Array6");
        } else {
            System.out.println("Equilibrium Index for Array 6 is: " + eqi6);
        }

    }

}
