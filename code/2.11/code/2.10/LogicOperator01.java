
//逻辑运算符 &&的使用
public class LogicOperator01{
	
	public static void main(String[] args){
		//演示&&的使用
		int age = 30;
		if(age < 20 && age < 90 ){
			System.out.println("ok");//判断条件1位false直接false
		}
		
		//&的使用
		if(age > 20 && age < 40 ){
			System.out.println("hello");//判断条件1位false，继续判断第二个条件在false
		}
		
		//区别
		int a = 4;
		int b = 9;
		//对于&&短路与而言，如果第一个条件为false，后面的条件不再判断
		if(a < 1 && ++b > 60){
			System.out.println("你好");
		}
		System.out.println("a=" + a + " b=" + b);//4 9
		
		//对于&逻辑与而言，如果第一个条件为false，后面的条件继续判断。
		if(a < 1 & ++b > 60){
			System.out.println("你好");
		}
		System.out.println("a=" + a + " b=" + b);//4 10
	}
	
}