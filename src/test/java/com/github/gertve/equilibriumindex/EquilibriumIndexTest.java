package com.github.gertve.equilibriumindex;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by dev on 2017-07-13.
 */
public class EquilibriumIndexTest {

    @Test
    public void testEquilibriumIndex1(){
        EquilibriumIndex equilibriumIndex = new EquilibriumIndex();

        int[] inputArray = {9,4,3,2,1,3};

        int eqIndex = equilibriumIndex.calculateEquilibriumIndex(inputArray);

        assertEquals(1, eqIndex  );
    }

    @Test
    public void testEquilibriumIndex2(){
        EquilibriumIndex equilibriumIndex = new EquilibriumIndex();

        int[] inputArray = {4, 0, 2, 7, 3, 1, 6, 7, 1, 2, 2, 3, 5, 9, 9};

        int eqIndex = equilibriumIndex.calculateEquilibriumIndex(inputArray);

        assertEquals(8, eqIndex  );
    }

    @Test
    public void testEquilibriumIndex3(){
        EquilibriumIndex equilibriumIndex = new EquilibriumIndex();

        int[] inputArray = {1, 0, 8, 9, 2, 7, 2, 1, 1, 2, 1, 3, 3, 6, 5, 3, 4, 2, 6, 2, 8, 0, 8, 3, 7, 1, 1, 3, 1, 5};

        int eqIndex = equilibriumIndex.calculateEquilibriumIndex(inputArray);

        assertEquals(15, eqIndex  );
    }

    @Test
    public void testEquilibriumIndex4(){
        EquilibriumIndex equilibriumIndex = new EquilibriumIndex();

        int[] inputArray = {5, 6, 1, 9, 9, 6, 9, 5, 5, 1, 5, 8, 6, 5, 4, 8, 7, 8, 1, 9, 3, 9, 2, 5, 9, 4, 3, 7, 3, 9, 1,
                9, 5, 7, 1, 4, 4, 6, 0, 1, 1, 4, 2, 6, 0, 8, 6, 9, 8, 7};

        int eqIndex = equilibriumIndex.calculateEquilibriumIndex(inputArray);

        assertEquals(22, eqIndex  );
    }

    @Test
    public void testEquilibriumIndex5(){
        EquilibriumIndex equilibriumIndex = new EquilibriumIndex();

        int[] inputArray = {0, 3, 9, 7, 7, 9, 8, 0, 0, 1, 9, 1, 5, 6, 7, 8, 9, 1, 8, 8, 5, 7, 0, 2, 8, 4, 1, 8, 3, 6, 2,
                1, 7, 6, 3, 2, 0, 3, 8, 6, 2, 0, 9, 9, 3, 1, 8, 3, 3, 8, 3, 8, 1, 5, 5, 5, 3, 7, 8, 6, 5, 1, 9, 4, 1, 8,
                7, 7, 9, 8, 3, 7, 0, 4, 3, 9, 5, 1, 5, 0, 8, 8, 2, 4, 3, 6, 1, 6, 9, 6, 5, 5, 3, 0, 1, 0, 4, 8, 2, 9};

        int eqIndex = equilibriumIndex.calculateEquilibriumIndex(inputArray);

        assertEquals(50, eqIndex  );
    }

    @Test
    public void testInvalidEquilibriumIndex(){
        EquilibriumIndex equilibriumIndex = new EquilibriumIndex();

        int[] inputArray = {7, 0, 7, 3, 4, 3, 8, 2, 7, 3, 0, 8, 2, 5, 2, 2, 0, 1, 8, 5, 3, 7, 5, 4, 6, 4, 7, 9, 8, 9, 0,
                2, 8, 7, 5, 7, 1, 0, 6, 0, 8, 0, 5, 3, 9, 2, 5, 0, 3, 4};

        int eqIndex = equilibriumIndex.calculateEquilibriumIndex(inputArray);

        assertEquals(-1, eqIndex  );
    }

}