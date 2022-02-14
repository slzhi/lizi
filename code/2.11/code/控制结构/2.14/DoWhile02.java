

//do...while练习题

public class DoWhile02{
	
	public static void main(String[] args){
		
		//打印1~100;计算1~100之间的和
		int start = 1;//开始
		int end =100;//结束
		int sum = 0;//总和
		do{
			System.out.println(start);
			sum += start;
			start++;
		
		}while(start<=end);
		System.out.println("总和="+sum);
	}
	
}