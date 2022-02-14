
//String和基本数据类型转换的使用
public class StringToBasic{
	
	public static void main(String[] args){
		
		//基本数据类型→String
		int n1 = 100;
		float f1 = 1.1F;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + ""; 
		System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
		
		//String→基本数据类型
		String s6 = "123";
		//使用基本数据类型对应的包装类，的相应方法，得到基本数据类型
		int num1 = Integer.parseInt(s6);
		double num2 = Double.parseDouble(s6);
		float num3 = Float.parseFloat(s6);
		long num4 = Long.parseLong(s6);
		byte num5 = Byte.parseByte(s6);
		boolean b = Boolean.parseBoolean("true");
		System.out.println(num1);//123
		System.out.println(num2);//123.0
		System.out.println(num3);//123.0
		System.out.println(num4);//123
		System.out.println(num5);//123
		System.out.println(b);//true
		
		
		//怎么把字符串转成字符char→含义是指把字符串的第一个字符得到
		System.out.println(s5.charAt(1));
	}
	
}
