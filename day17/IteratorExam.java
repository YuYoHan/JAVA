package j2day8;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExam {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		
		Iterator iter = list.iterator();
		while(iter.hasNext() == true) {			// hasNext()는 boolean으로 반환
			String num = (String)iter.next();	// next() 아무타입이나 반환
			if(num == "3") {
				iter.remove();
			}
			System.out.println("num = " + num);
		}
		System.out.println("-------------------");
		iter = list.iterator(); 
		while(iter.hasNext() == true) { 
			String num = (String) iter.next();
			System.out.println("num2 = " + num); 
		}
		
		
		
	}

}
