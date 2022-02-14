
import java.util.Scanner;

//switch练习

public class SwitchExercise03{
	
	public static void main(String[] args){
		
		/*
			根据用于指定月份，打印该月份所属的季节。3,4,5春季6,7,8夏季9,10,11秋季12,1,2	冬季 	
			
			创建Scanner对象,接受用户输入
			使用byte month接受
			使用switch来匹配
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入月份");
		byte month = scanner.nextByte();
		
		
		switch (month){
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
				
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;
				
			default :
			System.out.println("你输入的月份不对(1~12)");
		}
		
	}
	
}