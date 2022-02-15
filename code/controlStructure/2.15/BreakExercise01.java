

//break演示

public class BreakExercise01{
	
	public static void main(String[] args){
		
			//1~100以内的数求和,求出当和第一次大于20的当前数
		int sum = 0;
		int i=1;
		for(;i<=100;i++){
			if(sum>20){
				break;
			}
			sum += i;
		}
		System.out.println("当和第一次大于20的当前数为" + (i-1));
	}
		
}
