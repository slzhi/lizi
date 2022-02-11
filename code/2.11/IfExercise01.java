
//if else练习题
public class IfExercise01{
	
	public static void main(String[] args){
		

		//声明两个double型变量并赋值。判断第一个数大于10.0，且第2个数小于20.0，打印两数之和。
			

		
		double d1 = 22.2;
		double d2 = 11.1;
		
		if(d1>10){//(d1>10.0 && d2< 20.0)
			if(d2<20){
				System.out.println(d1+d2);
			}
		}
		
		/*
			定义两个变量int，判断两者的和，是否能被3又能被5整除，打印提示信息
			1、定义两个变量int num1 num2;
			2、定义一个变量int sum =num1 + num2;
			3、sum%3,5后等于0说明可以整除
			4、使用if else提示信息
		*/
		
			int num1 = 10;
			int num2 = 20;
			int sum = num1 + num2;
			if(sum%3 == 0 && sum%5 == 0){
				System.out.println("和可以被三和五整除");
			}else{
				System.out.println("不可以被三和五整除");
			}
		
		/*
			判断一个年份是否是闰年，闰年的条件是符合下面二者之一：
				1.年份能被4整除，但不能被100整除；
				2.能被400整除
			1、定义int year 保存年份
			2、判断能被4整除不能被100整除year%4==0 && year%100 ==0;
			3、能被400整除year%400 == 0;
			4、上面的2和3是或的关系
			
		*/
		int year = 2000;
		
		if((year%4 == 0 && year%100 != 0) || year%400 == 0){
			System.out.println(year+"是闰年");
		}else{
			System.out.println(year+"不是闰年");
		}
	}
	
}