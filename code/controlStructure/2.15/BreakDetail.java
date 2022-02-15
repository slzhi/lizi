

//break演示

public class BreakDetail{
	
	public static void main(String[] args){
		
		abc1:
		for(int i=0;i<4;i++){//外层for循环
			abc2:
			for(int j=0;j<10;j++){//内层for循环
				if(j==2){
					break abc1;//等价break abc2
				}
				System.out.println("j="+j);
			}
		}
		
	}
	
}