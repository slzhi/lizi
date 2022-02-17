

//分配复制

public class ArrayAssign{
	
	public static void main(String[] args){
		//基本数据类型赋值，赋值方式为值拷贝
		//N2的变化，不会影响到n1的值
		int n1 = 10;
		int n2 = n1;
		n2 =80;
		System.out.print(n1+"\t");
		System.out.println(n2+"\t");
	
		
		int[] arr1 = {1,2,3};
		int[] arr2 = arr1;
		arr2[0] = 20;
		//数组在默认情况下是引用传递，赋的值是地址，赋值方式为引用传达
		//是一个地址，arr2变化会影响到arr1
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+"\t");
		}
		System.out.println(" ");
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr2[i]+"\t");
		}
	}
}