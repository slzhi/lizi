
import java.util.Scanner;

//演示if else用法
public class If02{
	
	public static void main(String[] args){
		
		/*
		可以输入人的年龄，如果该通知的年龄大于18岁，则输出"你的年龄大于18，要对自己的行为负责，不然送入监狱"。否则，输出"你的年龄不大这次放过你了."
			1、接收输入的年龄，定义一个Scanner对象
			2、把年龄保存到一个变量age里面
			3、使用if else判断，输出对应信息
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年龄");
		int age = scanner.nextInt();
		if(age>18){
			System.out.println("你的年龄大于18，要对自己的行为负责，不然送入监狱");
		}else{
			System.out.println("你的年龄不大这次放过你了");
		}
		
	}
	
}