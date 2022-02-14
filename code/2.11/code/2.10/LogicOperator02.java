
//逻辑运算符||和|的使用
public class LogicOperator02{
	
	public static void main(String[] args){
		
		//||的使用
		int age = 30;
		if(age > 20 || age < 20 ){
			System.out.println("ok");//条件1为true直接true
		}
		
		//|的使用
		if(age > 20 | age < 40 ){
			System.out.println("hello");//条件1为true还要判断第二个条件在true
		}
		
		//区别
		int a = 4;
		int b = 9;
		//1.短路或||：如果第一个条件为true，则第二个条件不会判断，最终结果为true，效率高
		if(a > 1 || ++b > 60){
			System.out.println("你好");
		}
		System.out.println("a=" + a + " b=" + b);//4 9
		
		//逻辑或|：不管第一个条件是否为true，第二个条件都要判断，效率低
		if(a > 1 | ++b > 60){
			System.out.println("你好");
		}
		System.out.println("a=" + a + " b=" + b);//4 10
		
	}
}