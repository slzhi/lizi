
import java.util.Scanner;

//嵌套练习

public class NestedlfPractice{
	
	public static void main(String[] args){
		
		/*
			出票系统：根据淡旺季的月份和年龄，打印票价[课后练习]
				4_10旺季：
					成人(18~60):60
					儿童(<18):半价
					老人(>60):1/3
				淡季：
					成人:40
					其他:20
			1.用int fare;定义票价
			2.创建Scanner对象 用int month;接收月份判断是否是淡旺季
			3.用int age;接受年龄判断票价
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		double fare = 60.0;//定义旺季票价
		double fare1 = 40.0;//定义淡季票价
		
		System.out.println("请输入月份:1~12");
		int month = scanner.nextInt();//接受月份判断淡旺季
		if(month>3 && month<11){
			System.out.println("请输入年龄");
			int age = scanner.nextInt();//接受年龄判断票价
			
			if(age>17 && age<61){
				System.out.println("成人票价:" + fare);
			}else if(age>0 && age<18){
				System.out.println("儿童票价:" + fare/2);
			}else if(age>60){
				System.out.println("老人票价:" + fare/3);
			}
		}else if((month>0 && month<4)|| (month>10 && month<13)){
			System.out.println("请输入年龄");
			int age = scanner.nextInt();//接受年龄判断票价
			
			if(age>17 && age<61){
				System.out.println("成人票价:" + fare1);
			}else if((age>0 && age<18) || age>60){
				System.out.println("其他票价:" + fare1 / 2);
			}
		}else{
			System.out.println("请输入正确月份,否则无法买票");
		}
		
	}
	
}