
import java.util.Scanner;
//do...while练习题

public class DoWhileExercise02{
	
	public static void main(String[] args){
		
		/*
		如果离散不还钱，则老韩将一直使出五连鞭，直到李三说还钱位置
		[System.out.println("马宗师问:还钱吗?y/n))]do...while..
			1.不停的问还钱吗
			2.使用char answer 接受回答,定义一个Scanner对象
			3.在do...while的while判断如果是y就不再循环
		*/
		Scanner scanner = new Scanner(System.in);
		char answer;
		do{
			System.out.println("老马使出闪电五连鞭");
			System.out.println("老马问:还钱吗?y/n");
			answer = scanner.next().charAt(0);
		 
		
		}while(answer != 'y');
		
	}
	
}