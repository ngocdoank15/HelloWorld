package oata;

public class MergeSortTest extends junit.framework.TestCase {
	String input = "3,2,7,4,1,5,4,2,3";
	//long staTime = System.nanoTime();
	//JSONObject json = new JSONObject();
	String[] inputArr = input.split(",");
	MergeSort mms = new MergeSort();
	int[] intArr = mms.toIntArr(inputArr);

	// print(intArr);

	mms.array = intArr;
	mms.length = inputArr.length;
	mms.tempMergArr = new int[mms.length];
	//mms.doMergeSort(0, intArr.length-1);
	mms.mergeParts(0, 4, 8);
	// print(intArr);
	Assert.assertArrayEquals( inputArr, mms.array );

	System.out.println("Xong");
}