package Main;

import java.util.ArrayList;
import java.util.Collections;


public class findMax {//最大值，平均分，及格率。姬亮

	public Integer FindMax(ArrayList<Integer> arr) {
		
		int max = Collections.max(arr); 
		return max;
	}




	public float FindAverage (ArrayList<Integer> arr) {
		int sum = 0;
		float average = 0;
		for (Integer integer : arr) {
			sum = sum +integer;
		}
		average = (sum/arr.size());
		return average;
	

	}
	public float FindPassRate (ArrayList<Integer> arr) {
		int count = 0;
		float PassRate=0;
		for (int obj : arr) {
			if (obj>=60) {
				count ++;
			}
		
		}
		PassRate =	(count/arr.size());
		return PassRate;
		}
}

	