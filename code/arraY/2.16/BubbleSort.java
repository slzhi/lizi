

//冒泡排序

public class BubbleSort{
	
	public static void main(String[] args){
		/*
			1假设我们一共有5个数组
			2一共进行了4轮排序,可以看成是外层循环
			3每1轮排序可以确定一个数的位置,比如第1轮排序确定最大数,
				第2轮排序,确定第2大的数位置,以此类推
			4当进行比较时,如果前面的数大于后面的数,就交换
			5每轮比较在减少4→3→2→1
		*/
		int[] arr = {23,13,60,16,31,11,22,90,1};
		int temp = 0;//用于辅助交换的变量
		for(int i=1;i<arr.length;i++){//外层循环4次
			for(int j=0;j<arr.length-i;j++){//内层循环依次递减
				//如果前面的数>后面的数,就交换
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println("第"+i+"轮");
			for(int a=0;a<arr.length;a++){
				System.out.print(arr[a]+" ");
			}
			System.out.println();
		}
		
		
	}
}