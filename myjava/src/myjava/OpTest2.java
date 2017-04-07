package myjava;

import java.util.Scanner;

public class OpTest2 {
	public static void main(String[] args) {
	System.out.println("금액을 입력바랍니다.");
	Scanner scan = new Scanner(System.in);
	int amount = scan.nextInt();
	int countOf50 = amount /50000;
	int countOf10 = amount %50000/1000;
	int countOfwon = amount%50000%1000/100;
	
	
	System.out.println("전체 금액은"+amount);
	System.out.println("오만원짜리 지폐는 " + countOf50 +"개");
	System.out.println("천원짜리는 "+countOf10);
	System.out.println("동전은 "+countOfwon);
	
	
	System.out.println();
	
	}
}
