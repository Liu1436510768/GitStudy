package Main;

import java.util.ArrayList;

public class Quyu { //陈霄汉

	//1.统计区域
		/*
	     *  函数名：    quyu
		 *  返回值:  void  直接调用打印
		 *  参数：        arr 
		 **/  
		public static void quyu(ArrayList<Integer> arr) {
			
			int j = 0, k = 0, l = 0, m = 0 , n = 0 ;
			
			for (int i = 0; i < arr.size(); i++) { //遍历集合中的每个元素
				//System.out.println(arr.get(i));
				//int j = 0, k = 0, l = 0, m = 0 , n = 0 ; //分别统计[0,20]，[21,40],[41,60],[61,80],[81,100]的人数
				//Integer num = arr.get(i);
				//System.out.println(num);
				if(arr.get(i) >= 0 && arr.get(i) <= 20) {
					j++;
				}else if(arr.get(i) > 20 && arr.get(i) <= 40) {
					k++;
				}else if(arr.get(i) > 40 && arr.get(i) <= 60) {
					l++;
				}else if(arr.get(i) > 60 && arr.get(i) <= 80) {
					m++;
				}else if(arr.get(i) > 80 && arr.get(i) <= 100) {
					n++;
				}
			}
			System.out.println("重修的人数为" + j);
			System.out.println("不及格的人数为" + k);
			System.out.println("通过的人数为" + l);
			System.out.println("良好的人数为" + m);
			System.out.println("优秀的人数为" + n);
		}
}
