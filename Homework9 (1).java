// H O M E W O R K   # 9
// C S C   1 5
// Student's Name Here: Ani Muradyan

package Main;

import java.rmi.AccessException;

public class Homework9{
	public static void main(String[] args){
		// My tests (Do NOT modify this part!)
		int[] a = {24,3,12,55,6,21,35,7,33,10};
		int[] b = {72,103,3,56,87,23,9,78,5,110};
		p(divide(10,0));
		p(divide(20,5));
		p(getUnsignedIntString(-100));
		p(getUnsignedIntString(1000));
		p(Integer.toString(getMaxValue(a)));
		p(Integer.toString(getMaxValue(b)));
		p(getArrayElement(a, 3));
		p(getArrayElement(b, 10));
		p(twoSum(a, 31));
		p(twoSum(b, 113));
	}
	
	public static String getUnsignedIntString(int value){
		String ret = Integer.toString(value);
		// TODO: Follow Homework hand out for method
		if (value < 0) {
			return "0";
		}
		else return ret;
	}
	
	public static String getArrayElement(int[] a, int index){
		String ret = "";
		if (index > (a.length - 1)) {
			ret = "Out of Bounds";
		}
		else 
			ret = Integer.toString(a[index]);

		// TODO: Follow Homework hand out for method
		return ret;
	}
	
	public static int getMaxValue(int[] a){
		int max = Integer.MIN_VALUE;
		// TODO: Follow Homework hand out for method
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static String divide(int v1, int v2){
		String ret = "";
		try{
			ret = Integer.toString(v1 / v2);
		} catch (Exception e){
			ret = "Undefined";
		}
		// TODO: Follow Homework hand out for method
		return ret;
	}
	
	public static String twoSum(int[] a, int sum){
		String ret = "";
		// TODO: Follow Homework hand out for method
		for (int i = 0; i < a.length; i++) {
			int check = sum - a[i];
			for (int j = 0; j < a.length; j++) {
				if (a[j] == check) {
					ret = Integer.toString(a[i]) + ", " + Integer.toString(a[j]);
				}
			}
		}
		return ret;
	}
	
	/* Given for easy printing */
	public static void p(String inp){
		System.out.println(inp);
	}
}