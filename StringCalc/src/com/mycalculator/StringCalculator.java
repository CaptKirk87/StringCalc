package com.mycalculator;

public class StringCalculator {
	
	// private static final int MAX_NUMBERS = 2;

	/*public static int add(final String numberAsString) {
		int returnValue = 0;
		String[] numbersArray = numberAsString.split(",|n");
		if(numbersArray.length > MAX_NUMBERS){
			System.out.println(numberAsString.length());
			throw new RuntimeException("Up to 2 numbers seperated by comma");
		}
		else {
			for (String numbers : numbersArray) {
				if (!numbers.trim().isEmpty()){
					returnValue += Integer.parseInt(numbers);
					System.out.println(returnValue);
				}				
			}
		//} 
		return returnValue;
	}*/
	
	public static int add(final String numbers) {
	    String delimiter = ",|n";
	    String numbersWithoutDelimiter = numbers;
	    if (numbers.startsWith("//")) {
	        int delimiterIndex = numbers.indexOf("//") + 2;
	        System.out.println(numbers.indexOf("//"));
	        delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
	        numbersWithoutDelimiter = numbers.substring(numbers.indexOf("n") + 1);
	    }
	    return add(numbersWithoutDelimiter, delimiter);
	}
	 
	private static int add(final String numbers, final String delimiter) {
	    int returnValue = 0;
	    String[] numbersArray = numbers.split(delimiter);
	    for (String number : numbersArray) {
	        if (!number.trim().isEmpty()) {
	            returnValue += Integer.parseInt(number.trim());
	        }
	    }
	    return returnValue;
	}

}
