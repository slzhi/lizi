
//浮点类型的细节
public class FloatDetail{
		
	public static void main(String[] args){
			
		//Java的浮点型常量(具体值)默认为double型，声明float型常量，须后加'f'或'F'
		//float num1 = 1.1;错误
		float num2 = 1.1f;
		double num3 = 1.1;
		double num4 = 1.1f;
		
		//十进制数形式：如：5.12	512.0f	.512(必须有小数点)
		double num5 = .123;//等价0.123
		
		//科学记数法形式：如：5.12e2[5.12*10的2次方]  5.12E-2[]
		System.out.println(5.12e2);//5.120
		System.out.println(5.12E-2);//0.0512
		
		//通常情况下，应该使用double型，因为它比float型更精确。
		//如：double num9 = 2.1234567851; float num10 = 2.1234567821f;
		double num9 = 2.1234567851;
		float num10 = 2.1234567821f;
		System.out.println(num9);
		System.out.println(num10);
		
		//浮点数使用陷阱:2.7和8.1/3 比较
		double num11 = 2.7;
		double num12 = 8.1/3; 
		System.out.println(num11);//2.7
		System.out.println(num12);//接近2.7的一个小数，而不是2.7
		
		//得到一个重要的使用点：当我们对运算结果是小数的进行相等判断时，要小心
		//应该是以两个数的差值的绝对值，在某个精度范围内判断
		if( num11 == num12 ){
			System.out.println("相等");
		}
		//正确的写法
		if(Math.abs(num11 - num12 ) < 0.0001){
			System.out.println("差值非常小，到我规定的精度，认为相等");
		}
		System.out.println(Math.abs(num11 - num12));
		
	}
	
}