
import java.util.Scanner;

//判断一个整数是否为水仙花数,所谓水仙花数是指一个3位数,其各位上数字立方和等于其本身

public class Homework02{
	
	public static void main(String[] args){
		
		/*
			int daffodil =123;
			先得到n的百位,十位,个位的数字.使用if判断他们的立方和是否相等
			daffodil的百位=d/100
			daffodil的十位=d%100/10
			daffodil的个位=d/10	
		*/
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个三位数");
		int daffodil = scanner.nextInt();
		
		int d1 = daffodil/100;
		int d2 = daffodil%100/10;
		int d3 = daffodil%10;
		
		if(d1*d1*d1+d2*d2*d2+d3*d3*d3 == daffodil){
			System.out.println(daffodil+"是水仙花数");
		}else{
			System.out.println(daffodil+"不是水仙花数");
		}
		*/
		
		for(int i=100;i<=999;i++){
			int bai = i/100;
			int shi = i%100/10;
			int ge = i%10;
			
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai == i){
				System.out.println(i);
			}
			
		}
	}
	
}