package com.kenzie.unittesting.kenziemath.math;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * We're keeping the tests for {@code add()} from the pre-work, and adding new ones for {@code average()}.
 */
public class KenzieMathTest {

    // add()

    @Test
    public void add_singleInteger_returnsTheInteger() {
        // GIVEN
        int[] oneInteger = {42};
        KenzieMath kenzieMath = new KenzieMath();

        // WHEN
        int result = kenzieMath.add(oneInteger);

        // THEN
        assertEquals(42, result, "Expected adding a single int to return the int");
    }

    @Test
    public void add_twoIntegers_returnsTheirSum() {
        // GIVEN
        int[] tuple = {6, 9};
        KenzieMath kenzieMath = new KenzieMath();

        // WHEN
        int result = kenzieMath.add(tuple);

        // THEN
        assertEquals(15, result, String.format(
            "Expected adding two ints (%s) to return their sum (15)",
            Arrays.toString(tuple))
        );
    }

    @Test
    public void add_emptyArray_returnsZero() {
        // GIVEN
        int[] emptyArray = {};
        KenzieMath kenzieMath = new KenzieMath();

        // WHEN
        int result = kenzieMath.add(emptyArray);

        // THEN
        assertEquals(0, result, "Expected empty array to sum to zero");
    }

    @Test
    public void add_nullArray_returnsZero() {
        // GIVEN
        int[] nullArray = null;
        KenzieMath kenzieMath = new KenzieMath();

        // WHEN
        int result = kenzieMath.add(nullArray);

        // THEN
        assertEquals(0, result, "Expected null array to sum to zero");
    }

    @Test
    public void add_sumOutOfBounds_throwsArithmeticException() {
        // GIVEN
        int[] values = {Integer.MAX_VALUE - 5, 3, 3};
        KenzieMath kenzieMath = new KenzieMath();

        // WHEN - attempt to compute the sum

        // THEN - exception thrown

        // the following syntax is a little fancy, just know that it's
        // asserting that when the second line calls the add()
        // method that we should see an `ArithmeticException` thrown
        assertThrows(ArithmeticException.class,
                     () -> kenzieMath.add(values),
                     "Summing above MAX_VALUE should result in ArithmeticException thrown");
    }

    @Test
    public void add_sumOutofBoundsUnderflow_throwsArithmeticException() {
        // GIVEN
        int[] values = {Integer.MIN_VALUE + 5, -3, -3};
        KenzieMath kenzieMath = new KenzieMath();

        // WHEN - attempt to compute the sum
        // PARTICIPANTS: ADD YOUR WHEN CONDITION HERE AND DELETE THE NEXT LINE
//        fail("Expected an attempt to compute the sum for add_sumOutofBoundsUnderflow_throwsArithmeticException");

        // THEN - exception thrown
        assertThrows(ArithmeticException.class,
                     () -> kenzieMath.add(values),
                     "Summing below MIN_VALUE should result in ArithmeticException thrown");
    }

    // average()
    @Test
    public void averageOf_nullArray_throwsIllegalArgumentException() {
        //given null array
        int[] nullArray = null;
        KenzieMath kenzieMath = new KenzieMath();
        //when attempt to solve (done in kenzieMath.java since we are only catching exception

        //then exception is thrown
        assertThrows(IllegalArgumentException.class,
                () -> kenzieMath.average(nullArray),
                "empty/null array of integers should result in IllegalArgumentException");
    }

    @Test
    public void average_ofSingleInteger_isThatInteger() {
        // **GIVEN**
        int[] oneInteger = {42};
        KenzieMath kenzieMath = new KenzieMath();
        // **WHEN**
        double result = kenzieMath.average(oneInteger);
        // **THEN**
        assertEquals(42, result, "Expected average a single int to return the double");
    }

    @Test
    public void average_ofSeveralIntegers_isCorrect() {
//        GIVEN
//        Array of several integers (with easy to compute average).
        int[] intArray = {1,2,3,4};
        KenzieMath kenzieMath = new KenzieMath();
//        WHEN
        double result = kenzieMath.average(intArray);
//        Compute the average.
//        THEN
        assertEquals(2.5, result,"expected average of integers to return a double ");
//        The average is correct.
    }

    @Test
    public void average_ofNullArray_throwsIllegalArgumentException() {
//        GIVEN
//        Null array.
        int nullArray[] = null;
        KenzieMath kenzieMath = new KenzieMath();
//        WHEN
//        Attempt to compute the average
        assertThrows(IllegalArgumentException.class,
                () -> kenzieMath.average(nullArray),
                "Expected IllegalArgumentException when attempting to average null array"
        );
//         THEN
//        Exception thrown.
    }

    @Test
    public void average_ofPositiveAndNegativeIntegers_isCorrect() {

//        GIVEN
//        Array of mix of positive and negative integers (with easy to compute average).
        int mixedArray[] = {1,2,-3,-4,5};
//        WHEN
//        Compute the average.
        KenzieMath kenzieMath = new KenzieMath();
        double result = kenzieMath.average(mixedArray);
//        THEN
//        The average is correct.
        assertEquals(0.2,result,"expected average to be a double int");
    }

    @Test
    public void average_ofIntegersIncludingZeroes_isCorrect() {
//        GIVEN
//        Array of ints including zeroes.
        int zeroArray[] = {1,2,0,0,0,5,8};
//        WHEN
//        Compute the average.
        KenzieMath kenzieMath = new KenzieMath();
        double result = kenzieMath.average(zeroArray);
//        THEN
//        The average is correct.
        assertEquals(2.2857142857142856,result,"expected average to be a double int");
    }

    @Test
    public void average_ofEmptyArray_throwsIllegalArgumentException() {
//        GIVEN
//        Empty array.
        int emptyArray[] = {};
//        WHEN
//        Attempt to compute the average.
        KenzieMath kenzieMath = new KenzieMath();
//        THEN
//        Exception thrown.
        assertThrows(IllegalArgumentException.class,
                () -> kenzieMath.average(emptyArray),
                "Expected IllegalArgumentException when attempting to average empty array"
        );
    }

    @Test
    public void average_ofLargeNumbersThatOverflow_throwsArithmeticException() {
//        GIVEN
//        Array of large numbers that sum to greater than Integer.MAX_VALUE.
        int largeArray[] = {Integer.MAX_VALUE + 1,Integer.MAX_VALUE + 4, Integer.MAX_VALUE + 10 };
//        WHEN
//        Attempt to compute the sum.
//        THEN
//        Exception thrown.
        KenzieMath kenzieMath = new KenzieMath();
//        THEN
//        Exception thrown.
        assertThrows(ArithmeticException.class,
                () -> kenzieMath.average(largeArray),
                "Expected ArithmeticException when attempting to average largeArray"
        );
    }

}
