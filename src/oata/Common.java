package oata;

import java.util.Random;

public class Common {

	public static int[] toIntArr(String[] strArr) {
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

	public static String printNumbers(int[] input) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length; i++) {
			sb.append(input[i]).append(" ");
		}
		return sb.toString();
	}

	public static int[] createInput(String count, String max) {
		int[] ret = null;
		try {
			Random ran = new Random();
			int iCount = Integer.parseInt(count);
			int iMax = Integer.parseInt(max);
			ret = new int[iCount];
			for (int i = 0; i < iCount; i++) {
				ret[i] = ran.nextInt(iMax);
			}
		} catch (Exception e) {
		}
		return ret;
	}
}
