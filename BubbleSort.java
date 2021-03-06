/**
 * An implementation of the bubble sort algorithm
 * @author Christopher
 *
 */
public class BubbleSort {

	public static void main(String[] args) {

	}
	
	/**
	 * Test each element in an array and swap their location with each other 
	 * if one in greater than the other
	 * @param array an array to be sorted
	 */
	public void sort(int[] array) {
		//If there is nothing in the array
		if(array == null) {
			return;
		}		
		//Get the length of the array
		int arrayLength = array.length;
		//Loop through the lengtth of the array
		for (int i = 0; i < arrayLength - 1; i++)
			for (int j = 0; j < arrayLength - i - 1; j++)
				//Test if the current element is less than the next element in the array
				if (array[j] > array[j + 1]) {
					//Swap the two elements
					int tempPoint = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tempPoint;
				}
	}

}
