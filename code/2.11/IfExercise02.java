
import java.util.Scanner;

//if else 多分支的使用
public class IfExercise02{
	
	public static void main(String[] args){
		
		/*
			输入张三同志的芝麻信用分:
			1.信用分为100是,输出信用极好
			2.信用分为(80,99)时,输出信用优秀
			3.信用分为(60,80)时，输出信用一般
			4.其他情况，输出信用不及格
			5.请从键盘输入张三的芝麻信用分，并加以判断
			

		*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入信用分");
		int credit = scanner.nextInt();
		
		if(credit == 100){
			System.out.println("信用极好");
		}else if(credit>80 && credit<=99){
			System.out.println("信用优秀");
		}else if(credit>=60 && credit<=80){
			System.out.println("信用一般");
		}else if(credit>100){
			System.out.println("信用分输入有误：需要在1~100");
		}else{
			System.out.println("信用不及格");
		}
	}
	
}