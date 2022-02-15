

//while练习题

public class WhileExercise02{
	
	public static void main(String[] args){
		
		//打印40~200之间所有的偶数
		int start = 40;//定义开始
		int end = 200;//定义结束
		int i = 2;//定义被几整除
		
		while(start<=end){
			if(start % i == 0){
				System.out.println("40~200之间的偶数有:" + start);
			}
			start++;
		}
	
		
	}
	
}