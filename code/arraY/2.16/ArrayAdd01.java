
import java.util.Scanner;

//练习

public class ArrayAdd01{
	
	public static void main(String[] args){
	
	/*
		实现动态的给数组添加元素效果，实现对数组扩容
			1原始数组使用静态分配int[] arr={1,2,3}
			2增加的元素4,直接放在数组的最后arr={1,2,3,4}
			3用户可以通过如下方法来决定是否继续添加,添加成功,是否继续?Y/N
	*/
	/*
		1定义初始数组 int[] arr={1,2,3}
		2定义一个新的数组int [] arrNew = new int{arr.length+1};
		3遍历arr数组,依次将arr的元素拷贝到arrNew数组
		4将4赋给arrNew[arrNew.length-1]=4;把4赋给arrNew最后一个元素
		5让arr指向arrNew;arr=arrNew;那么原来arr数组就被销毁
		6创建一个Scanner可以接受用户输入
		7因为用户不知道什么时候退出,可以使用do-while+break来控制
	*/
		int[] arr = {1,2,3};
		Scanner scanner = new Scanner(System.in);
		do{
			
			int[] arrNew = new int[arr.length+1];
			//遍历arr数组,依次将arr的元素拷贝到arrNew数组
			for(int i=0;i<arr.length;i++){
				arrNew[i] = arr[i];
			}
			
			System.out.println("请输入你要添加的元素");
			int addNum = scanner.nextInt();
			
			//把addNum赋给arrNew最后一个元素
			arrNew[arrNew.length-1] = addNum;
			//让arr指向arrNew;
			arr=arrNew;
			
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+"\t");
			}
			
			//问用户是否继续添加
			System.out.println("是否继续添加y/n");
			char key = scanner.next().charAt(0);
			if(key == 'n'){
				break;
			}
		}while(true);
	}
}