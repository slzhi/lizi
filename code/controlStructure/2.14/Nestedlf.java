
import java.util.Scanner;

//嵌套练习

public class Nestedlf{
	
	public static void main(String[] args){
		
		/*
			参加歌手比赛，如果初赛成绩大于8.0进入决赛，否则提示淘汰。并且根据性别提示进入男子组或女子组。输入成绩和性别，进行判断和输出信息。
				double score分数 char gender 性别
				接收字符:char gender = scanner.next().charAt(0);
				1.创建Scanner对象,接受用户输入
				2.接受成绩保存到double score
				3.if-else判断 如果初赛大于8.0进入决赛,否则提示淘汰
				4.如果进入决赛,在接受char gender,使用if-else 输出信息
		*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入分数");
		double score = scanner.nextDouble();//分数
		
			
		if(score>8.0 && score<=10.0){
			
			System.out.println("请输入性别");
			char gender = scanner.next().charAt(0);//性别
			
			if(gender == '男'){
				System.out.println("恭喜你，进入男子组决赛");
			} else if(gender == '女'){
				System.out.println("恭喜你，进入女子组决赛");
			}else{
				System.out.println("请输入正确性别：男或女");
			}
		} else if(score<=8.0 && score>=0.0){
			System.out.println("很遗憾你被淘汰了");
		} else{
			System.out.println("请输入1~10");
		}
	
	}
}