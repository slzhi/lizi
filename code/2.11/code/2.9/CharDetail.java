
//char类型的细节
public class CharDetail{

		public static void main(String[] args){
			
			//在Java中，char的本质是一个整数，在输出时，是Unicode码对应的字符
			char c1 = 97;
			System.out.println(c1);//输出为a
			char c2 = 'a';//输出'a'对应的数字
			System.out.println((int)c2);
			char c3 = '沈';
			System.out.println((int)c3);//27784
			char c4 = 27784;
			System.out.println(c4);//沈
			
			//char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode码
			System.out.println('a' + 10);//107
			
			//小测试
			char c5 = 'b' + 1;//98+1=99
			System.out.println((int)c5);//99
			System.out.println(c5);//99→对应的字符→编码表ASCII(规定好的)c
		}
		
}