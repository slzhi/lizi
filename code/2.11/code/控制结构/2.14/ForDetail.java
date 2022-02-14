

//演示for的使用细节

public class ForDetail{
	
	public static void main(String[] args){
		
		/*
			for(;循环判断条件;)
				中的初始化和变量迭代可以写到其它地方.但是两边省略号不能省
		*/
		int i = 0;
		for(;i<10;){
			i++;
			System.out.println("hello");
		}
		
		for(;;){//没有判断条件表示无限循环
			System.out.println("hello");
		}
	}
	
}