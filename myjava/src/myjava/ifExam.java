package myjava;

import java.util.Calendar;

public class ifExam {

	public static void main(String[] args) {
		/*
		 *  ������ �������� �ָ������� ���� �����̸�, ������ �����սô�.
		 *  �ָ��̸�, ��� �߿ܶ� �������ϴ�.
		 *  (�Ͽ����� 1, ������� 7)
		 */
		
		int today;
		Calendar cal  = Calendar.getInstance();
		today = cal.get(Calendar.DAY_OF_WEEK);	// ���� ��¥�� �˷��� , 1-�Ͽ���, 7- �����
		
		
		if(today<=Calendar.SUNDAY || today>=Calendar.SATURDAY) {
			System.out.println("�ָ��̸�, ���߿ܶ� �������ô�.");
		}
		else {
			System.out.println("������ �����սô�.");
		}
	}
}
