package j2day6;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		// 주요 상수는 실제 내부에서는 그냥 정수이다.
//		System.out.println(Calendar.YEAR);
//		System.out.println(Calendar.MONDAY);
		
		// Calendar 객체 가져오기
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH) + 1);
		System.out.println(now.get(Calendar.DATE));
		
		
		// 시분초
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));
		
		// 요일 및 오전 오후를 출력
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		System.out.println(now.get(Calendar.AM_PM));
		
		
		switch (now.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY:	// 1
			System.out.println("일");
			break;
		case Calendar.MONDAY:	// 2
			System.out.println("월");
			break;
		case Calendar.TUESDAY:	// 3
			System.out.println("화");
			break;
		case Calendar.WEDNESDAY:	// 4
			System.out.println("수");
			break;
		case Calendar.THURSDAY:	// 5
			System.out.println("목");
			break;
		case Calendar.FRIDAY:	// 6
			System.out.println("금");
			break;
		case Calendar.SATURDAY:	// 7
			System.out.println("토");
			break;
		default:
			break;
		}
		
		switch (now.get(Calendar.AM_PM)) {
		case Calendar.AM:	// 1
			System.out.println("오전");
			break;
		case Calendar.PM:	// 1
			System.out.println("오후");
			break;
		default:
			break;
		}
		
//		// 현재 년월일 시분초를 찍는 방법
//		int year = now.get(Calendar.YEAR);
//		int month = now.get(Calendar.MONTH) + 1;
//		int day = now.get(Calendar.DATE);
//		int hour = now.get(Calendar.HOUR);
//		int min = now.get(Calendar.MINUTE);
//		int sec = now.get(Calendar.SECOND);
//		
//		System.out.println(year + "/" + month + "/" + day + " " + hour + ":" + min + ":" + sec);
		
		System.out.println(now("-"));
		
//		System.out.println(now.getTime());

	}
	
	public static String now(String symbol) {
		Calendar now = Calendar.getInstance();
		
		// 현재 년월일 시분초를 찍는 방법
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DATE);
		int hour = now.get(Calendar.HOUR);
		int min = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);

		return year + symbol + month + symbol + day + " " + hour + ":" + min + ":" + sec;
	}
}













