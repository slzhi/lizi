
//
public class AssignOperatorExercise{
	
	public static void main(String[] args){
		
		//案例实现三个数的最大值
		int n1 = 11;
		int n2 = 33;
		int n3 = 22;
		//思路
		//先得到n1和n2中最大数，保存到max1中
		//再求出max1和n3谁大，保存到max2中
		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 : n3;
		System.out.println("最大数为" + max2);
	}
	
}