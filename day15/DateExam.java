package j2day6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {
	public static void main(String[] args) {
		Date now = new Date();
		
		// 현재 시스템 시간을 영미권 형식으로 표시한다.
		System.out.println(now);
//		System.out.println(now.getTime()); //1646049115
//		System.out.println(now.getTime()); //1576800000

//		System.out.println(now.getYear() + 1900);	// 1900년도를 기준으로 한다.
//		System.out.println(now.getMonth() + 1);
//		System.out.println(now.getDate());
		
		// SimpleDateFormat 출력
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yy/MM/dd HH:mm:ss.s");
		System.out.println(sdf.format(now));
	}
}
