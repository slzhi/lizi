


//演示转义字符的使用
public class EscapeCharacters{
	
	public static void main(String[] args){
		
		//1.\t：一个制表位，实现对齐的功能
		System.out.println("要继续加油\t努力");
		
		//2.\n：换行符
		System.out.println("要继续加油努力\n");
		
		//3.\\：一个\
		
		System.out.println("C:\\Windows\\System32\\cmd.exe");
		
		//4.\"：一个"
		System.out.println("\"要继续加油努力\"");
		
		//5.\'：一个'
		System.out.println("\'要继续加油努力\'");
		
		//6.\r：一个回车System.out.println("要继续努力\r加油呀");/r会把最前面的字覆盖修改为后面的信息
		System.out.println("要继续努力\r加油呀");

	
	}
}