
import java.util.Scanner;
//查找

public class SeqSearch{
	
	public static void main(String[] args){
		/*
			有一个数列:白眉,金毛,紫衫,青翼猜数游戏:从键盘中任意输入一个名称,判断数列中是否包含此名称[顺序查找]要求:
				如果找到了,就提示找到了,并给出下标值.
		*/
		String[] name = {"白眉","金毛","紫衫","青翼"};
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入名字");
		String fName = scanner.next();
		int index = -1;
		for(int i=0;i<name.length;i++){
			//比较字符串equals
			if(fName.equals(name[i]){
				System.out.println("恭喜你找到了"+fName);
				System.out.println("下标为:" + i);
			}
		}
		
		if(index == -1){//没有找到
			System.out.println("没有找到");
		}
	}
}