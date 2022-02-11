
//三元运算符细节
public class AssignOperatorDetail{
	
	public static void main(String[] args){
		
		//表达式1和表达式2要为可以赋给接受变量的类型(或可以自动转换)
		int a = 2;
		int b = 3;
		int c = a > b ? (int)3.3 : (int) 4.4;//可以的
		double d = a > b ? a : b+3;//可以的，
	}
	
}