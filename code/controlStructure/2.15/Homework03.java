

//输出1~100直接的不能被5整除的数,每五个一行

public class Homework03{
	
	public static void main(String[] args){
		
		int j = 0;//统计输入的个数
		for(int i=1;i<=100;i++){
			if(i%5 != 0){
				System.out.print(i+"\t");

				j++;
				
				if(j%5 == 0){
					System.out.println(" ");
				}
			}
		}
		
	}
	
}