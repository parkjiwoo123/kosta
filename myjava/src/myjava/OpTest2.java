package myjava;

import java.util.Scanner;

public class OpTest2 {
	public static void main(String[] args) {
	System.out.println("�ݾ��� �Է¹ٶ��ϴ�.");
	Scanner scan = new Scanner(System.in);
	int amount = scan.nextInt();
	int countOf50 = amount /50000;
	int countOf10 = amount %50000/1000;
	int countOfwon = amount%50000%1000/100;
	
	
	System.out.println("��ü �ݾ���"+amount);
	System.out.println("������¥�� ����� " + countOf50 +"��");
	System.out.println("õ��¥���� "+countOf10);
	System.out.println("������ "+countOfwon);
	
	
	System.out.println();
	
	}
}
