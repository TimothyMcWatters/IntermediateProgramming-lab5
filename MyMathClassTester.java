import java.util.ArrayList;

/**
This program:
Implements an ArrayList of any API numeric object type that extends the API Number
class(such as Integer, Double, Long) and calculates the average and standard deviation 
of its elements.

@author Timothy McWatters
@version 1.0

COP3022    Lab 5
File Name: MyMathClassTester.java
*/

public class MyMathClassTester {

	public static void main(String[] args) {
		//create 3 ArrayLists (one for each type Integer, Double, and Long)
		ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
		ArrayList<Double> doubleArrayList = new ArrayList<Double>();
		ArrayList<Long> longArrayList = new ArrayList<Long>();
		
		//add 3 appropriate numbers to each ArrayList
		integerArrayList.add(1);
		integerArrayList.add(2);
		integerArrayList.add(3);
		doubleArrayList.add(1.0);
		doubleArrayList.add(2.0);
		doubleArrayList.add(3.0);
		longArrayList.add((long) 1);
		longArrayList.add((long) 2);
		longArrayList.add((long) 3);
		
		//create a MyMathClass object for each type
		MyMathClass<Integer> integerMathClass = new MyMathClass<Integer>();
		MyMathClass<Double> doubleMathClass = new MyMathClass<Double>();
		MyMathClass<Long> longMathClass = new MyMathClass<Long>();
		
		//call the standard deviation method for each MyMathClass object and display the results
		System.out.printf("Standard Deviation (integer) = %.2f\n", integerMathClass.standardDeviation(integerArrayList));
		System.out.printf("Standard Deviation (double) = %.2f\n", doubleMathClass.standardDeviation(doubleArrayList));
		System.out.printf("Standard Deviation (long) = %.2f\n", longMathClass.standardDeviation(longArrayList));
		
		/*				
		ArrayList<String> stringArrayList = new ArrayList<String>();
		stringArrayList.add("1");
		stringArrayList.add("2");
		stringArrayList.add("3");
		MyMathClass<String> stringMathClass = new MyMathClass<String>();
		System.out.printf("Standard Deviation (string) = %.2f\n", stringMathClass.standardDeviation(stringArrayList));
	
		When you try to use a string you get - Bound mismatch: The type String is not a valid substitute for the bounded 
		parameter <T extends Number> of the type MyMathClass<T>
		
		Not sure what is meant by handled robustly, but an easy solution to getting this error is to parse as an integer, and 
		process the strings as integers.... working example below:
		*/
		ArrayList<Integer> stringArrayList = new ArrayList<Integer>();
		stringArrayList.add(Integer.parseInt("1"));
		stringArrayList.add(Integer.parseInt("2"));
		stringArrayList.add(Integer.parseInt("3"));
		MyMathClass<Integer> stringMathClass = new MyMathClass<Integer>();
		System.out.printf("Standard Deviation (string) = %.2f\n", stringMathClass.standardDeviation(stringArrayList));
		
	} // end of main method

} // end of MyMathClassTester class
