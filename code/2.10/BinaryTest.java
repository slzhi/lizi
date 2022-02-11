
//演示四种进制
public class BinaryTest{
	
	public static void main(String[] args){
		
		//n1 二进制
		int n1 = 0b101010;
		
		//n2 十进制
		int n2 = 101010;
		
		//n3 八进制
		int n3 = 010101;
		
		//n4 十六进制
		int n4 = 0x101010;
		
		System.out.println("n1=" + n1);//42
		System.out.println("n2=" + n2);//101010
		System.out.println("n3=" + n3);//4161
		System.out.println("n4=" + n4);//1052688
	}
	
}