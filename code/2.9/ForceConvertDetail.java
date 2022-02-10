
//演示强制类型转换细节
public class ForceConvertDetail{
	
	public static void main(String[] args){
		//演示强制类型转换
		//强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
		//int x = (int)10*2.2+6*2.2;//编译错误 double→int
		int y = (int)(10*2.2+6*2.2);//(int)35.0 →35
		System.out.println(y);//35
		
		//char类型可以保存int的常量值，但不能保存int的变量值，需要强转
		char c1 = 100;//对
		int m = 100;//对
		//char c2 = m;//错误
		char c3 = (char)m;//对
		System.out.println(c3);//100对应的字符是d
	}
	
}