package myjava;

public class SwitchExam {

	/*
	 * 점수를 random하게 생성하여, 그 점수에 따라 학점을 출력하려 합니다.
	 * 90점이상은 A
	 * 60점 미만은 F
	 */
	public static void main(String[] args) {
		int point;
		point = (int)(Math.random()*100)+1;
		
		System.out.println("생성된 점수는 "+point);
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
