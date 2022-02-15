
import java.util.Scanner;

//循环输入五个成绩,保存到double数组,并输出

public class Array01{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		//第一种动态分配方式
		double[] d = new double[5];
		//第二种分配方式
		//double d[];
		//d = new double[5];
		for(int i=0;i<d.length;i++ ){
			System.out.println("请输入第"+(i+1)+"个成绩");
			 d[i] = scanner.nextDouble();
		}
		for(int i=0;i<d.length;i++){
			System.out.print("第"+(i+1)+"个成绩:"+d[i]+"\n");
		}
		
	}
}