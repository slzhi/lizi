

//输出菱形


public class Lozenge{
	
	public static void main(String[] args){
		
		for(int i=1;i<=5;i++){//i表示层数
			
			for(int a=1;a<=5-i;a++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				if(j==1 || j==2*i-1 || i==5){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		
		for(int i=5;i>=1;i--){
			for(int a=1;a<=5-i;a++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				if(j==1 || j==2*i-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
	}
	
}