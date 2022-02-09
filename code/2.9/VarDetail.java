
//使用变量的细节
public class VarDetail{
	
	public static void main(String[] args){
		//变量必须先声明，后使用，即有顺序
		
		//正确使用
		int a = 1;
		
		System.out.println(a);
		
		/*错误使用
		*System.out.println(b);
		*int b = 2;
		*/
		
		// int a = 3;错误使用 变量在同一个作用域内不能重名
	
	}
	
}