
import java.util.Scanner;
//break演示

public class BreakExercise02{
	
	public static void main(String[] args){
		
		//实现登录验证,有3次机会,如果用户名为"丁真",密码"666"提示登录成功,
		//否则提示还有几次机会,使用for+break完成
		
		/*
			创建Scanner对象接受用户输入
			定义String name ；String password;保存用户名和密码
			最多循环3次[登录三次],如果满足条件就提前退出
			定义一般变量int chance记录还有几次登录机会
		*/
		Scanner scanner = new Scanner(System.in);
		String name = "丁真";
		String  password = "666";

		for(int i=3;i>=1;i--){
			System.out.println("请输入姓名");
			 name = scanner.next();
			 System.out.println("请输入密码");
				password = scanner.next();
				
			if("丁真".equals(name) &&"666".equals(password)){
					System.out.println("输入正确");
					break;
			}
			System.out.println("还有"+(i-1)+"次机会");
		}
		
	}
	
}