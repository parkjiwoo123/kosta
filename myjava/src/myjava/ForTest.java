package myjava;

public class ForTest {

	public static void main(String[] args) {
		//1���� 100���� 3�� ����� ���ϸ� �󸶳� �ǳ�
		
		int sum =0;
		for(int i=1;i<=100; i++) {
			if(i%3==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}
