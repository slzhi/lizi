
import java.util.Scanner;

//演示if的使用
public class If01{
	
	public static void main(String[] args){
		/*
			可以输入人的年龄，如果该通知的年龄大于18岁，则输出"你的年龄大于18，要对自己的行为负责，不然送入监狱"
			思路分析：
			1、接受输入的年龄,应该定义一个Scanner对象
			2、把年龄保存到一个变量 int age
			3、使用if判断，输出对应信息
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年龄");
		int age = scanner.nextInt();
		if(age>18){
			System.out.println("你的年龄大于18,要对自己的行为负责,不然送入监狱");
		}
		
	}
	
}