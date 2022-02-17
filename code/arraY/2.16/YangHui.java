

//杨辉三角

public class YangHui{
	
	public static void main(String[] args){
		/*
			1第一行有1个元素,第n行有n个元素
			2每一行的第一个元素和最后一个元素都是1
			3从第三行开始,对于非第一个元素和最后一个元素的元素值.4,2
				arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
		*/
		int[][] arr = new int[10][];
		for(int i=0;i<arr.length;i++){//遍历arr的每个元素
			//给每个一维数组开空间
			arr[i] = new int[i+1];
			//给每个一维数组赋值
			for(int j=0;j<arr[i].length;j++){
				
				if(j==0 || j == arr[i].length-1){
					arr[i][j] = 1;
				}else{
					arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}