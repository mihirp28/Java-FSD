package com.stackroute.oops;

import com.stackroute.oops.Utility;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

public class UtilityTests {
    private static final String MSG_01 = "celcius value calculated is not correct. Celcius should be rounded to the nearest integer";
    private static final String MSG_02 = "celcius value calculated is not correct";
    private static final String MSG_03 = "getLevel should return HIGH";
    private static final String MSG_04 = "getLevel should return MEDIUM";
    private static final String MSG_05 = "getLevel should return LOW";


    @Test
    public void givenFahrenheitAsIntegerThenReturnPositiveCelciusAsIntegerRounded(){
        assertThat("MSG_01", Utility.fahrenheitToCelcius(104), is(40));
    }

    @Test
    public void givenFahrenheitAsIntegerThenReturnNegativeCelciusIntegerRounded(){
        assertThat("MSG_01", Utility.fahrenheitToCelcius(25), is(-4));
    }

    @Test
    public void givenFahrenheitAsDoubleThenReturnPositiveCelciusAsDouble(){
        assertThat("MSG_01", Utility.fahrenheitToCelcius(95.5), is(closeTo(35.28, 0.01)));
    }

    @Test
    public void givenNegativeFahrenheitAsDoubleThenReturnNegativeCelciusAsDouble(){
        assertThat("MSG_01", Utility.fahrenheitToCelcius(-104.75), is(closeTo(-75.97, 0.01)));
    }

    @Test
    public void givenIntArrayThenReturnLevelAsHigh(){
        int[] inputArray = new int[] {40,50,11};
        assertThat(MSG_03, Utility.getLevel(inputArray), is("HIGH"));
    }

    @Test
    public void givenIntArrayThenReturnLevelAsMedium(){
        int[] inputArray = new int[] {5,20,-5,50,1};
        assertThat(MSG_04, Utility.getLevel(inputArray), is("MEDIUM"));
    }

    @Test
    public void givenIntArrayThenReturnLevelAsLow(){
        int[] inputArray=new int[] {4,10,5,50};
        assertThat(MSG_05, Utility.getLevel(inputArray), is("LOW"));
    }

    @Test
    public void givenIntArrayWhenSumIsSeventyThenReturnLevelAsMedium(){
        int[] inputArray=new int[] {4,6,10,50};
        assertThat(MSG_05, Utility.getLevel(inputArray), is("MEDIUM"));
    }
}
