
//自动类型转换细节演示
public class AutoConvertDetail{
	
	public static void main(String[] args){
		//细节1：有多种类型的数据混合运算时，
		//系统首先自动将所有数据转换成容量最大的那种数据类型，然后在进行计算
		int n1 = 10;
		//float d1 = n1 + 1.1;//错误 n1 + 1.1 结果类型是double
		double d1 = n1 + 1.1;// 对的 
		float d2 = n1 + 1.1F;// 对 n1 + 1.1F 结果类型是float
		
		//细节2：当我们把精度(容量)大 的数据类型赋值给精度(容量)小的数据类型时，
		//就会报错,反之就会进行自动类型转换。
		
		//int n2 = 1.1;//错误 double → int
		
		
		//细节3：(byte,short)和char之间不会互相自动转换
		//当爸具体数赋给byte时，(1)先判断该数是否在byte范围内，如果是就可以
		byte b1 = 10;//对,-128~127
		// int n2 = 1;//n2 是 int
		// byte b2 = n2;//错误，原因：如果是变量赋值，判断类型
		//char c1 = b1;//错误, 原因 byte 不能自动转成char
		
		//细节4：byte,short,char它们三者不论是单独计算还是混合计算，在计算时都要转换为Int类型
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		//short s2 = b2 + s1;//错误，在b2+s1时它们已经转换成了Int类型
		//byte b4 = b2 + b3;//错误 计算时已经转化成int类型
		
		//细节5：boolean 不参与转换
		boolean pass = true;
		//int num100 = pass;//boolean不参与类型的自动转换
		
		//细节6：自动提升原则：表达式结果的类型自动提升为 操作数中最大的类型
		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		double num300 = 1.1;
		System.out.println(b4+s3+num200+num300);//为double类型
		
	}
	
}