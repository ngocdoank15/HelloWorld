package oata;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class MergeSort {

	 int split = 1;
	 int merge = 1;

	public int[] array;
	public int[] tempMergArr;
	public int length;

	 File f;
	 BufferedWriter bw;
	 
	 public static void main(String[] args) {
        System.out.println("Hello World");
    }

	 public int[] toIntArr(String[] strArr) {
		int len = strArr.length;
		int[] intArr = new int[len];
		for (int i = 0; i < len; i++) {
			try {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			} catch (Exception e) {
				intArr[i] = 0;
			}
		}
		return intArr;
	}
	
	void print(int[] a) {
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	
		System.out.println();
	}

	void print(int[] a, int l, int h, String msg) {
		// System.out.print(msg + ": ");
		writeLog(msg + ": ");
		for (int i = l; i <= h; i++) {
			// System.out.print(a[i] + " ");
			writeLog(a[i] + " ");
		}
		// System.out.println();
		writeLog("\r\n");
	}

	void writeLog(String content) {
		try {
			bw.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0, length - 1);
	}

	public void doMergeSort(int lowerIndex, int higherIndex) {
		
		print(this.array);

		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			// print(this.array, lowerIndex, middle, "left");
			doMergeSort(lowerIndex, middle);
			// Below step sorts the right side of the array
			// print(this.array, middle + 1, higherIndex, "right");
			doMergeSort(middle + 1, higherIndex);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);
			//print(this.array, lowerIndex, higherIndex, "merge " + (merge++));
		}
	}

	public void mergeParts(int lowerIndex, int middle, int higherIndex) {

		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		
		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		
		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}
		
		print(this.array);
	}
	// - See more at:
	// http://www.java2novice.com/java-sorting-algorithms/merge-sort/#sthash.rKTYYXiY.dpuf
}
