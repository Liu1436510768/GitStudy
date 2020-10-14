package Main;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;


public class Min {//ÂíÓÀÇ¿

	
	
	public static Integer min(ArrayList<Integer> arr) {
		int min =Collections.min(arr);
		System.out.println(min);
		return min;
	}
	public static Integer zhongwei(ArrayList<Integer> arr) {
		//Integer zho = arr((arr.get(arr.size())-1)/2);
		Integer zho = arr.get(arr.size()/2);
		System.out.println(zho);
		return zho;
	}
	public static String youxiu(ArrayList<Integer> arr) {
		float count = 0;
		String youxiu;
		for (int obj : arr) {
			if (obj>=80) {
				count ++;
			}
		
		}
		youxiu = NumberFormat.getPercentInstance().format(count/arr.size());
		System.out.println(youxiu);
		return youxiu;
		
	}
	
}