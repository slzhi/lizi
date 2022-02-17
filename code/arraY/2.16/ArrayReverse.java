

//数据反转把数组的元素内容反转：
//arr{11,22,33,44,66,77}→{77,66,44,33,22,11}

public class ArrayReverse{
	
	public static void main(String[] args){
	
		int[] arr = {11,22,33,44,66,77};
		/*
			把arr[0]和arr[5]进行交换
			以供交换3次 = arr.length/2
			每次交换时,对应的下标是arr[i]和arr[arr.length-1-i]
		*/
		int temp = 0;
		int len = arr.length;//计算数组的长度
		for(int i=0;i<len/2;i++){
			temp = arr[len-1-i];//保存
			arr[len-1-i] = arr[i];
			arr[i] = temp;
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}