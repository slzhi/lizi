
//演示算术运算符的使用
public class ArithmeticOperator{
	
	public static void main(String[] args){
		
		// /使用
		System.out.println(10/4);//2
		double d = 10/4;//2.0
		System.out.println(d);//2.0
		System.out.println(10.0/4);//2.5
		
		// %使用 
		//在%的本质：a % b = a - a / b * b
		//-10 % 3 => -10 - (-10) / 3 * 3 = -10 + 9 = -1
		System.out.println(10%3);//1
		System.out.println(-10%3);//-1
		System.out.println(10%-3);//1
		System.out.println(-10%-3);//-1
		
		// ++的使用
		int i = 10;
		int a = 9;
		i++;
		++a;
		System.out.println("i=" + i);//11
		System.out.println("a=" + a);//11
		
		/*
			作为表达式使用
			前++：++i先自增后赋值
			后++：i++先赋值后子增
		*/
		int j = 8;
		//int k = ++j;//等价 j = j+1; k = j;
		int k = j++;//等价 k = j; j = j+1;
		System.out.println("k=" + k + "j=" + j);//8 9
		
	}
	
}