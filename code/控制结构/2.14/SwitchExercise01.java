
import java.util.Scanner;

//演示switch使用

public class SwitchExercise01{
	
	public static void main(String[] args){
		
		/*
			编写一个程序，该程序可以接受一个字符，比如：a，b，c，d，e，f，g
			a表示星期一，b表示星期二。。。
			根据输入显示相应的信息使用switch
			
			1.接收一个字符，创建Scanner
			2.使用switch完成
		*/
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入一个字符：(a~g)");
		
		char c = scanner.next().charAt(0);
		switch(c){
			case 'a' :
				System.out.println("今天是星期一");
			break;
			
			case 'b' :
				System.out.println("今天是星期二");
			break;
			
			case 'c' :
				System.out.println("今天是星期三");
			break;
			
			case 'd' :
				System.out.println("今天是星期四");
			break;
			
			case 'e' :
				System.out.println("今天是星期五");
			break;
			
			case 'f' :
				System.out.println("今天是星期六");
			break;
			
			case 'g' :
				System.out.println("今天是星期日");
			break;
			
			default :
				System.out.println("你输入的信息错误");
		}
	}
	
}