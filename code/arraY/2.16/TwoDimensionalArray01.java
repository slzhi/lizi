

//二维数组的使用

public class TwoDimensionalArray01{
	
	public static void main(String[] args){
	
		//int arr[][] = new int[3][4];
		int arr[][];//声明二维数组
		arr = new int[3][4];//再开空间
		arr[2][3]=3;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){//对每个一维数组遍历
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();//换行
		}
	}
}