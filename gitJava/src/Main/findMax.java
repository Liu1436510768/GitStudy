package Main;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;


public class findMax {//���ֵ��ƽ���֣������ʡ�����

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
	public void FindPassRate (ArrayList<Integer> arr) {
		int count = 0;
		for (int obj : arr) {
			if (obj>=60) {
				count ++;
			}
		
		}
		//System.out.println(count);
		//System.out.println(arr.size());
		 
		int PassRate =(count*100/arr.size());
		System.out.println(PassRate);
		System.out.println("及格率"+PassRate+"%");
		}
}

	