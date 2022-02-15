

//for练习题

public class ForExercise01{
	
	public static void main(String[] args){
		
		/*
			打印1~100直接所有是9的倍数的整数，统计个数及总和。
			1.完成输出1~100的值
			2.在输出的过程中,进行过滤,只输出9的倍数 i%9==0;
			3.统计总和,定义一个变量int sum=0;当条件满足时相加sum +=i;
			4.统计个数定义一个变量int count=0;当条件满足时递增count++;
				
			1、为了适应更好的需求,把范围的开始的值和结束的值,做出变量
			2、还可以更近一步9的倍数也可以做成变量 int a=9;
		*/
		int sum = 0;//定义9的倍数的总和
		int count = 0;//定义9的倍数有几个
		int start = 1;//定义一个开始值
		int end = 100;//定义到多少结束
		int a = 9;//定义几的倍数
		for(int i=start;i<=end;i++){
			if(i%a==0){
				System.out.println(i + "是9的倍数的整数");
				sum += i;//把9的倍数相加
				count++;
			}
		}
		
		System.out.println("count="+count);
		System.out.println("sum="+sum);
		/*
			完成下面的表达式输出：
				0+5=5
				1+4=5
		*/
		
		for(int i=0,j=5;i<6;i++,j--){
			System.out.println(i+"+"+j+"="+(i+j));
		}
	}
	
}