package com.mycalculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class StringCalculatorTest {

	/*@Test (expected = RuntimeException.class)
	public final void whenMoreThen2NumbersAreUsedThenExceptionIsThrown() {
		StringCalculator.add("1,2,3");
		System.out.println("1. Test");
	}*/
	
	@Test
	public final void when2NumbersAreUsedThenNoExceptionIsThrown(){
		StringCalculator.add("1,2");
		Assert.assertTrue(true);
		System.out.println("2. Test");
	}
	
	@Test
	public final void whenEmptyStringIsUsedMethodWillReturn0(){
		Assert.assertEquals(0, StringCalculator.add(""));
		System.out.println("3. Test");
	}
	
	@Test
	public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber(){
		Assert.assertEquals(3, StringCalculator.add("3"));
		System.out.println("4. Test");
	}
	
	@Test
	public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum(){
		Assert.assertEquals(3+6, StringCalculator.add("3,6"));
		System.out.println("5. Test");
	}
	
	@Test
	public final void whenAnyNumberIsUsedThenReturnValueAreTheirSum(){
		Assert.assertEquals(3+6+15+18+46+33, StringCalculator.add("3,6,15,18,46,33"));
	}
	
	@Test
	public final void whenNewLineIsUsedBetweenNumbersThenReturnValueIsTheirSum() {
		Assert.assertEquals(3+6+15, StringCalculator.add("3,6n15"));
	}
	
	@Test
	public final void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers(){
		Assert.assertEquals(3+6+15, StringCalculator.add("//;n3;6;15"));
	}


}
