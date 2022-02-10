
//演示关系运算符的使用
public class RelationalOperator{
	
	public static void main(String[] args){
		
		int a = 9;//开发中不可以使用a a1 b1
		int b = 8;
		System.out.println(a > b);//T
		System.out.println(a >= b);//F
		System.out.println(a <= b);//F
		System.out.println(a < b);//F
		System.out.println(a == b);//F
		System.out.println(a != b);//T
		boolean flag = a > b;//T
		
	}
	
}