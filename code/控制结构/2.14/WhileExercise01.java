

//while练习题

public class WhileExercise01{
	
	public static void main(String[] args){
		
		/*
			打印1~100直接所有能被3整除的数
		*/
		
		int start = 1;//定义开始
		int end = 100;//定义结束
		int i = 3;//定义被几整除
		
		while(start<=end){
			if(start % i == 0){
				System.out.println("能被3整除的有" + start);
			}
			start++;
		}
		System.out.println(start);//101
	}
	
}