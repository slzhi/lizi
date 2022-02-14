

//do...while练习题

public class DoWhileExercise01{
	
	public static void main(String[] args){
		
		//统计1~200之间能被5整除但不能被3整除的个数
		/*
			使用do...while输出1~200
			过滤能被5整除但不能被3整除的数%
			统计满足条件的个数int count=0;
		*/
		int start = 1;//开始
		int end = 200;//结束
		int count = 0;//个数
		do{
			if(start%5==0 && start%3 != 0){
				count++;
			}
			start++;
		}while(start<=end);
		System.out.println("1~200之间能被5整除单不能被三整除的个数"+count);
	}
	
}