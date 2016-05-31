import java.util.Arrays;

public class MergeSortTest extends junit.framework.TestCase {
	
	public void testNothing() {
    }
    
	//public void testWillAlwaysFail() {
		//oata.HelloWorld h = new oata.HelloWorld();
		//assertEquals(h.getMessage(),"Hello World");
       // fail("An error message");
    //}
	 public void testFail() {
		fail("An error message");
     }
    
	  public void testWillAlwaysFail() {
	    	String input = "3,2,7,4,1,5,4,2,3";
	    	//long staTime = System.nanoTime();
	    	//JSONObject json = new JSONObject();
	    	String[] inputArr = input.split(",");
	    	MergeSort mms = new MergeSort();
	    	int[] intArr = mms.toIntArr(inputArr);

	    	
	    	mms.array = intArr;
	    	mms.length = inputArr.length;
	    	mms.tempMergArr = new int[mms.length];
	    	//mms.doMergeSort(0, intArr.length-1);
	    	mms.mergeParts(0, 4, 8);
	    	// print(intArr);
	    	assertTrue(Arrays.equals(intArr, mms.array ));
	    	System.out.println("Xong");
	    }

}
