

/*
	把数组的元素内容反转：
	arr{11,22,33,44,66,77}→{77,66,44,33,22,11}
*/

public class ArrayReverse01{
	
	public static void main(String[] args){
	
		int[] arr = {11,22,33,44,66,77};
		//先创建一个新的数组arr1,大小的等于arr.length
		//逆序遍历arr,将每个元素拷贝到arr2元素中
		int[] arr2 = new int[arr.length];
		
		//逆序遍历arr
		for(int i=arr.length-1,j=0;i>=0;i--,j++){
			arr2[j] = arr[i];
		}
		
	//当for循环结束,arr2就是一个逆序的数组
	//当arr指向arr2数据空间,此时arr原来的数据空间就没有变量引用会被当做垃圾.销毁
		arr = arr2;
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}