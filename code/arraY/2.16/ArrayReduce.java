
import java.util.Scanner;

//练习

public class ArrayReduce{
	
	public static void main(String[] args){
	
	/*	
		有一个数组{1,2,3,4,5}可以将数组进行缩减,提示用书是否继续缩减,
		每次缩减最后那个元素,当只剩下最后一个元素,提示,不能再缩减了.
	*/	
		int[] arr = {1,2,3,4,5};
		Scanner scanner = new Scanner(System.in);
		
		do{
			int[] arr1 = new int[arr.length-1];
			for(int i=0;i<arr1.length;i++){
				arr1[i] = arr[i];
			}
			arr = arr1;
			
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i] + "\t");
			}
			System.out.println();
			
			
			System.out.println("是否缩减y/n");
			char key = scanner.next().charAt(0);
			if(key == 'n'){
				break;
			}else if(arr.length-1 == 1){
				System.out.println("这是最后一个数不能再缩减了");
			}
			
		}while(true);
	}
}