package myjava;

public class ForTest {

	public static void main(String[] args) {
		//1부터 100까지 3의 배수를 더하면 얼마나 되나
		
		int sum =0;
		for(int i=1;i<=100; i++) {
			if(i%3==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}
