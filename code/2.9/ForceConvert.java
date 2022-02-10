
//演示基本的强制类型转换使用
public class ForceConvert{
	
	public static void main(String[] args){
		
		int n1 = (int)1.9;
		System.out.println("n1=" + n1);//造成精度丢失
		
		int n2 = 1000;
		byte b1 = (byte)n2;
		System.out.println("b1=" + b1);//造成数据溢出
	}
	
}