
import java.util.Scanner;

//switch使用练习

public class SwitchExercise02{
	
	public static void main(String[] args){
		
		/*
			对学生成绩大于60嗯的，输出"合格"。低于60分的，输出"不合格"。
		注：输入成绩不能大于100(要求使用switch)
			如果成绩在[60,100] (成绩/60)=1
			如果成绩在[0,60),(成绩/60)=0;
			
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入成绩");
		double score = scanner.nextDouble();
		
		if(score>=0 && score<=100){
			
			switch ((int)(score/60)){
				case 0 :
					System.out.println("不合格");
					break;
				case 1 :
					System.out.println("合格");
					break;
				default :
					System.out.println("输入有误");
			}
		} else {
			System.out.println("输入有误请重新输入");
		}
	}
	
}