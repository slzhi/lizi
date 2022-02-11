
//演示三元运算符使用
public class TernatyOperator{
	
	public static void main(String[] args){
		
		int a = 20;
		int b = 33;
		//解读
		//1.a>b为false
		//2.返回b--，先返回b的值，然后在b-1
		//3.返回的结果是33
		int result = a > b ? a ++ : b--;
		System.out.println("result=" + result);//33
		System.out.println("a=" + a);//20
		System.out.println("b=" + b);//32
		
	}
	
}