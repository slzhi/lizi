

//

public class ArrayReduce01{
	
	public static void main(String[] args){
	
		int[] arr = {1,2,3,4,5};
		//Scanner scanner = new Scanner(System.in);
		int[] arr1 = new int[arr.length-1];
		
		for(int i=0;i<arr1.length;i++){
				arr1[i] = arr[i];
			}
			
			arr = arr1;
			
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i] + "\t");
			}
			System.out.println();
	}
}