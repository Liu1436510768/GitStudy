package Main;

import java.util.ArrayList;

public class MainTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr = new ArrayList<Integer>();
		arr.add(50);
		arr.add(60);
		arr.add(40);
		arr.add(30);
		arr.add(80);
		arr.add(90);
		arr.add(85);
		arr.add(65);
		// 排序       刘彬
		ArrayList asList;
		// 升序
		Sort s = new Sort();
		asList = s.Asort(arr);
		System.out.println("升序"+asList);
		// 降序
		asList = s.Dsort(arr);
		System.out.println("降序"+asList);
		
		findMax fm = new findMax();
		// 平均分
		Float avg = fm.FindAverage(arr);
		System.out.println("平均分"+avg);
		// 最大值
		int Max = fm.FindMax(asList);
		System.out.println("最大值"+Max);
		// 及格率
		fm.FindPassRate(asList);
		
		
		Min m = new Min();
		// 最小值
		m.min(arr);
		// 中位数
		m.zhongwei(arr); 
		// 优秀率
		m.youxiu(arr);
		
		// 统计区间
		Quyu qy = new Quyu();
		qy.quyu(arr);
	}

}
