

import java.util.Scanner;

//多重循环练习

public class ForMultiply01{
	
	public static void main(String[] args){
		
		//统计3个班成绩情况,每个班都有5名学生,求出各个班的平均分和所有班级
		/*
			1.先计算一个班,5个学生的成就(可以使用for)
				创建Scanner对象然后接受用户输入
				得到该班级的平均分,定义一个double sum 把该班级5个学生的成就累积
			2.统计三个班的平均分每个班都是5人
			3.所有班级的平均分
				定义一个变量,double totalScore累积索引学生的成就
				当多重循环结束后,totalScore/(3*5)
			4.统计三个班级及格人数
				定义变量int passNum=0;当有一个学生成就>=60,passNum++
				如果>=60 passNum++
			5.可以优化[效率,可读性,结构]
		*/
		Scanner scanner = new Scanner(System.in);
		double totalScore = 0;//累积索引学生的成就
		int passNum = 0;//累积及格人数
		for(int i=1;i<=3;i++){
			double sum = 0;
			for(int j=1;j<=5;j++){
				System.out.println("请输入第"+i+"个班的第"+j+"个学生成绩");
				double score = scanner.nextDouble();
				if(score >= 60){
					passNum++;
				}
				sum += score;//累积
				System.out.println("成绩为"+score);
				
			}
			//因为sum是5个学生的总成绩
			System.out.println("总分为"+sum + sum +"平均分为"+(sum/5));
			
			//把sum累积到totalScore
			totalScore += sum;
		}
		
		System.out.println("三个班总分=" + totalScore + "平均分=" + 
			totalScore/15);
			System.out.println("及格人数=" + passNum);
	}
	
}