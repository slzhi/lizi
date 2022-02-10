
//算术运算符练习
public class ArithmeticOperatorExercise03{
	
	public static void main(String[] args){
		
	
		/*	
			1.需求：假如还有59天放假，问：合XX个星期零XX天。
			2.思路分析
			1、使用int变量days保存天数
			2、一个星期是7天 星期数：days/7零XX天days%7
			3、输出
		*/
		int days = 59;//天
		int weeks = days/7;//星期
		int leftDays = days%7;//几天
		System.out.println("还有" + weeks + "个星期" + "零" + leftDays + "天");
		
		/*	1.需求：
			定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：
			5/9*(华氏温度-100),请求出华氏温度对应的摄氏温度。[234.5]
			2.思路分析：
			1、先定义一个double huaShi 变量保存 华氏温度
			2、根据给出的公式，进行计算即可5/9*(华氏温度-100);
			3、将得到的结果保存到double sheShi
			3.输出
		*/
		double huaShi = 234.6;
		double sheShi = 5.0 / 9 * (huaShi - 100);
		System.out.println("华氏温度" + huaShi + "对应的摄氏温度" + sheShi);
		
	}
	
}