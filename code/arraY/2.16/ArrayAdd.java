

//练习

public class ArrayAdd{
	
	public static void main(String[] args){
	/*
		实现动态的给数组添加元素效果，实现对数组扩容
			1原始数组使用静态分配int[] arr={1,2,3}
			2增加的元素4,直接放在数组的最后arr={1,2,3,4}
			
	*/
	/*
		1定义初始数组 int[] arr={1,2,3}
		2定义一个新的数组int [] arrNew = new int{arr.length+1};
		3遍历arr数组,依次将arr的元素拷贝到arrNew数组
		4将4赋给arrNew[arrNew.length-1]=4;把4赋给arrNew最后一个元素
		5让arr指向arrNew;arr=arrNew;那么原来arr数组就被销毁
	*/
		
		int[] arr = {1,2,3};
		int[] arrNew = new int[arr.length+1];
		//遍历arr数组,依次将arr的元素拷贝到arrNew数组
		for(int i=0;i<arr.length;i++){
			arrNew[i] = arr[i];
		}
		//把4赋给arrNew最后一个元素
		arrNew[arrNew.length-1] = 4;
		//让arr指向arrNew;
		arr=arrNew;
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}