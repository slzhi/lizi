
//算术运算符练习
public class ArithmeticOperatorExercise01{
	
	public static void main(String[] args){
		//结果为多少
		int i = 1;
		i = i++;//规则使用临时变量：1、temp=i;2/i=i+1;3/i=temp;
		System.out.println(i);//1
		
		int a = 1;
		a = ++a;规则使用临时变量：//1、a=a+1;2、temp=a;/3、a=temp;
		System.out.println(a);//2
	}
	
}