import org.junit.Test;
import static org.junit.Assert.*;

//import org.json.simple.JSONObject;

import oata.MergeSort;


public class MergeSortTest extends junit.framework.TestCase {
	String input = "3,2,7,4,1,5,4,2,3";
	//long staTime = System.nanoTime();
	//JSONObject json = new JSONObject();
	String[] inputArr = input.split(",");
	int[] intArr = Common.toIntArr(inputArr);

	// print(intArr);

	MergeSort mms = new MergeSort();
	mms.array = intArr;
	mms.length = inputArr.length;
	mms.tempMergArr = new int[mms.length];
	//mms.doMergeSort(0, intArr.length-1);
	mms.mergeParts(0, 4, 8);
	// print(intArr);
	Assert.assertArrayEquals( inputArr, mms.array );

	System.out.println("Xong");
}
