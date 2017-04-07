package myjava;

import java.util.Calendar;

public class ifExam {

	public static void main(String[] args) {
		/*
		 *  오늘이 주중인지 주말인지에 따라 주중이면, 열심히 공부합시다.
		 *  주말이면, 어디 야외라도 나가봅니다.
		 *  (일요일은 1, 토요일은 7)
		 */
		
		int today;
		Calendar cal  = Calendar.getInstance();
		today = cal.get(Calendar.DAY_OF_WEEK);	// 현재 날짜를 알려줌 , 1-일요일, 7- 토요일
		
		
		if(today<=Calendar.SUNDAY || today>=Calendar.SATURDAY) {
			System.out.println("주말이면, 어디야외라도 나가봅시다.");
		}
		else {
			System.out.println("열심히 공부합시다.");
		}
	}
}
