package myjava;

public class SwitchExam {

	/*
	 * ������ random�ϰ� �����Ͽ�, �� ������ ���� ������ ����Ϸ� �մϴ�.
	 * 90���̻��� A
	 * 60�� �̸��� F
	 */
	public static void main(String[] args) {
		int point;
		point = (int)(Math.random()*100)+1;
		
		System.out.println("������ ������ "+point);
		String hakjum =null;
		if(point>=90) {
			hakjum="A";
		}
		else if(point>=80){
			hakjum="B";
		}
		else if(point>=70){
			hakjum="C";
		}
		else if(point>=60){
			hakjum="D";
		}
		else {
			hakjum="F";
		}
		
		switch(hakjum) {
		case "A":
			System.out.println("A");
			break;
		case "B":
			System.out.println("B");
			break;
		case "C":
			System.out.println("C");
			break;
		case "D":
			System.out.println("D");
			break;
		default :
			System.out.println("F");
		}
	}
}
