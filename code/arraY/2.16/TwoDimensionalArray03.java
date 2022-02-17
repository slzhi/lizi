

//int arr[][] = {{2,3},{1,2,3},{-1}};遍历该二维数组,并得到和

public class TwoDimensionalArray03{
	
	public static void main(String[] args){
	
		int arr[][] = {{2,3},{1,2,3},{-1}};
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr[i].length;j++){
				sum += arr[i][j];
			}
		}
		System.out.println("和:"+sum);
	}
}