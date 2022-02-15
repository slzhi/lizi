
//创建一个char类型的26个元素数组,分别放置'A'~'Z'.使用for循环访问索引元素并打印出来

public class ArrayExercise01{
	
	public static void main(String[] args){
		/*
			定义一个数组char[] c = new char[26];
			因为A+1=B类推所以可以使用for来赋值
			
		*/
		
		char[] c = new char[26];

		for(int i=0;i<c.length;i++){
			c[i] = (char)('A' + i);
			System.out.print(c[i] + " ");
		}
		
		
	}
}