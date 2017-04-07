package myjava;

public class SwitchTest {
	public static void main(String[] args) {
		int count =1000;
		switch(count) {
		
		case 1000:
			System.out.println("1000");
			break;
		case 999:
			System.out.println("999");
			break;
		case 800:
			System.out.println("800");
			break;
		
		default:
			System.out.println("default");
		}
	}
}
