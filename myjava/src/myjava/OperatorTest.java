package myjava;

public class OperatorTest {
	public static void main(String [] args) {
		int count =500;
		count = 5/ 4;	// int ������ ������ ����� int�̴�.
		System.out.println(5&8);
		System.out.println(5|8);
		System.out.println(8>>2);
		System.out.println(8<<2);
		
		String name = null;
		if(name!= null && name.length()>0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}
}
