
//演示字符串转基本数据类型的细节
public class StringToBasicDetail{
	
	public static void main(String[] args){
		String a = "123";
		System.out.println(Integer.parseInt(a));
		String b = "hello";
		//System.out.println(Integer.parseInt(b));//错误字符串不能转换成基本数据类型
	}
	
}