
//求出一个数组的和还有平均值

public class ArrayExercise03{
	
	public static void main(String[] args){
		
		int[] array = {4,-1,23,10,9};
		int sum = 0;//总和
		double average = 0.0;//平均值
		for(int i=0;i<array.length;i++){
			sum += array[i];//求和
		}
		average = sum/array.length;//求平均值
		System.out.println("当前数组的和为:"+sum+"当前数组的平均值为:"+average);
	}
}