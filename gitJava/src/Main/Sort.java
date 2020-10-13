package Main;

import java.util.ArrayList;
import java.util.Collections;

// 排序的类     刘彬
public class Sort {
	public ArrayList Asort(ArrayList list) {
		Collections.sort(list);
		return list;
	}
	public ArrayList Dsort(ArrayList list) {
		Collections.sort(list,Collections.reverseOrder());
		return list;
	}
}
