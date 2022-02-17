

//复制拷贝

public class ArrayCopy{
	
	public static void main(String[] args){
	
		//将int[] arr1 = {10,2,3};拷贝到arr2数组
		//要求数据空间独立.
		int[] arr1 = {10,2,3};
		//创建一个新的数组arr2,开辟新空间
		//大小arr1.length;
		int[] arr2 = new int[arr1.length];
		
		//遍历arr1.把每个元素拷贝到arr2对应的元素位置
		for(int i=0;i<arr1.length;i++){
			arr2[i] = arr1[i];
		}
		
		//修改arr2
		arr2[0] = 100;
		
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+"\t");
		}
		
		System.out.println(" ");
		
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+"\t");
		}
		
	}
}