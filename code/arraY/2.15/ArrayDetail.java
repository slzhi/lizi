
//数组使用

public class ArrayDetail{
	
	public static void main(String[] args){
		//1.数组是多个相同类型数据的组合,实现对这些数据的统一管理
		//int[] i = {1,2,3,"hello"};//String→int 错String不能自己转int
		double[] d = {1.1,2.2,3.3,4.4,11};//int→doublt 对
		
		//2.数组中的元素可以是任何数据类型,包括基本类型和引用类型,但是不能混用.
		String[] s = {"上海","杭州","hello"};
		
		//3.数组创建后,如果没有复制,有默认值,int 0;short 0;byte 0;long 0;float 	0.0;double 0.0;char \u0000; boolean false; String null;
		
		short[] arr1 = mew short[3];
		
		//4.使用数组的步骤:1声明数组并开辟空间 2给数组各个元素赋值 3使用数组
		
		
		//5.数组的下标是从0开始的
		
		
		//6.数组下标必须在指定范围内使用,否则报:下标越界异常.
		//	如:int[] arr = new int[5];则有效下标为0~4
		//下组下标/索引 最小值为0 最大值为数组长度-1(5)
		int[] arr2 = new int[6];
		System.out.println(arr2[6]);
		
		//7.数组属于引用类型,数组型数据是对象(object)
	
	
	}
}