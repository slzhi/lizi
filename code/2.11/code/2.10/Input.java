
import java.util.Scanner;//表示把java.util中的Scanner类导入

//演示控制台输出
public class Input{
	
	public static void main(String[] args){
		
		//要求：可以从控制台接收用户信息，[姓名，年龄，薪水]
		//1.引入Scanner类所在的包
		//2.创建Scanner对象,new 创建一个对象，
		//myScanner就是Scanner类的对象
		Scanner myScanner = new Scanner(System.in);
		//3.接受用户输入了，使用相关的方法
		System.out.println("请输入名字");
		
		//当程序执行到next方法时，会等待用户输入。
		String name = myScanner.next();//接受用户输入姓名（字符串）
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();//接受用户输入年龄（int）
		System.out.println("请输入薪水");
		double sal = myScanner.nextDouble();//接受用户输入薪水（double）
		System.out.println("人的信息如下：");
		System.out.println("名字:" + name + "\t年龄:" + age + "\t薪水" + sal);
		
		
	}
	
}