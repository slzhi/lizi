

//求1+(1+2)+(1+2+3)+(1+2+3+4)+..+(1+2+3+...+100)的结果

public class Homework06{
	
	public static void main(String[] args){
		int sum = 0;
		int sum1 = 0;
		for(int i=1;i<=100;i++){
			sum += i;
			sum1 += sum;
		}
		System.out.println(sum1);
	}
	
}