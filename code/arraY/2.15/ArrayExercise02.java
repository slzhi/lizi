
//求出一个数组int[]最大的值{4,-1,9,10,23},并得到对应的下标

public class ArrayExercise02{
	
	public static void main(String[] args){
		//定义一个数组int[] array = {4,-1,9,10,23};
		//定义最大值max = arr[0];max1=0为下标
		//从下标1开始遍历arr,如果max<当前元素,说明max不是真正的最大值,我们就max=当前元素;maxIndex=当前元素下标
		int[] array = {4,-1,23,10,9};
		int max1=0;
		for(int i=1;i<array.length;i++){
			if(array[max1]>array[i]){
				
			}else{
				max1 = i;
			}
		}
		System.out.println("当前数组最大值为:"+array[max1]+"下标值为"+max1);
	}
}