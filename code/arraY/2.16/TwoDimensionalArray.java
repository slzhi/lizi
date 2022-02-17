

//二维数组


public class TwoDimensionalArray{
	
	public static void main(String[] args){
		/*
			从定义形式上看int[][]
			可以这样理解,原来的一维数组的每个元素是一维数组,就构成二维数组
		*/
		
		int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
		
		/*关于二维数组的关键概念
			1.
			System.out.println("二维数组的元素个数="+arr.length);
			2.二维数组的每个元素是一维数组,所以如果需要得到每个一维数组的值还需要再次遍历
			3.如果我们要访问第(i+1)个一维数组的第j+1个值arr[i][j];
			举例:访问3,→它是第1个一维数组的第3个值arr[0][2];
			System.out.println("第1个一维数组的第3个值"+arr[0][2]);
		
		*/
		
		//输出二维图形
		for(int i=0;i<arr.length;i++){//遍历二维数组的每个元素
			//遍历二维数组的每个元素(数组)
			//1.arr[i]表示二维数组的第i+1个元素比如arr[0]:二维数组的第一个元素
			//2.arr[i].length得到对应的每个一维数组的长度
			for(int j=0;j<arr[i].length;j++){
			System.out.print("arr["+i+"]["+j+"]"+arr[i][j]+" ");//输出了一维数组
			}
			
			System.out.println();
		}
	}
}