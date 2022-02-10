
//自动类型转换练习
public class AutoConvertPractice{
	
	public static void main(String[] args){
		
		short s = 12;//对
		//s = s-9;.///错
		
		byte b = 10;//对
		//b = b + 11;//错
		b = (byte)(b+11);//对，使用强制转换
		
		char c = 'a';//对
		int i =16;//对
		float d = .314F;//对
		double result = c + i + d;//对
		
		byte b = 16;//对
		short s = 14;//对
		//short t = s + b;//错 byte short char运算就会自动转换为int
	
	}
	
}