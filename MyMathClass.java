import java.util.ArrayList;

/**
This program:
Implements an ArrayList of any API numeric object type that extends the API Number
class(such as Integer, Double, Long) and calculates the average and standard deviation 
of its elements.

@author Timothy McWatters
@version 1.0

COP3022    Lab 5
File Name: MyMathClass.java
*/

public class MyMathClass<T extends Number> {

	/**
	 * default constructor for the MyMathClass class
	 */
	public MyMathClass() {
	} // end of MyMathClass constructor
	
	/**
	 * takes an ArrayList and returns the average of its elements
	 * @return the averageOfArrayList = the average value of the ArrayList
	 */
	public double average(ArrayList<T> theArrayList) {
		double totalOfArrayList = 0.0;
		double averageOfArrayList = 0.0;
		
		for (int i = 0; i < theArrayList.size(); i++) {
			totalOfArrayList += theArrayList.get(i).doubleValue();
		}
		averageOfArrayList = totalOfArrayList / theArrayList.size();
		return averageOfArrayList;
	} // end of average method
	
	/**
	 * takes an ArrayList and returns a double representation of the standard 
	 * deviation of the ArrayList elements 
	 * @return the standardDevOfArrayList = the standard deviation value of the ArrayList
	 */
	public double standardDeviation(ArrayList<T> theArrayList) {
		double totalValue = 0.0;
		double average = average(theArrayList);
		
		for (int i = 0; i < theArrayList.size(); i++) {
			totalValue += (Math.pow((theArrayList.get(i).doubleValue() - average), 2));
		}
		double totalValueAverage = totalValue / theArrayList.size();
		return (Math.sqrt(totalValueAverage));
	} // end of standardDeviation method
	
} // end of MyMathClass
