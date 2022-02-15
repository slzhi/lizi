

/*
	某人又100000元,没经过一次路口,需要缴费,规则如下:
		当现金>50000时,每次交5%
		当现金<=50000时,每次交1000
*/

public class Homework01{
	
	public static void main(String[] args){
		double i = 100000;
	
		int a = 0;
		int b = 1;
		double money = 100000;
	
		while(true){
			
			if(money>50000){
				money = money-money*0.05;
				a++;
			}else if(money>1000 && money<50000){
				money = money -1000;
				a++;
			}else{
				break;
			}
			b++;
		}
		
		System.out.println("可以经过"+a+"次路口");
	}
	
}