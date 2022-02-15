
//数组使用

public class Array{
	
	public static void main(String[] args){
		double[] hens = {3,5,1,3.1,2,20};
		/*
			1.我们可以通过hens[下标]来访问数组的元素
			下标是从0开始编号的比如第一个元素就是hens[0]
			第2个元素就是hens[1],依次类推
			2.通过for就可以循环的访问数组的元素/值
			3.使用一个变量totalWeight将各个元素累积
		*/
		double totalWeight =0;
		//数组名.length可以得到数组的大小/长度.
		for(int i=0;i<hens.length;i++){
			totalWeight += hens[i];
			//System.out.println("第"+(i+1)+"个元素的值="+hens[i]);
		}
		System.out.println("总重量="+totalWeight
			+"\t平均体重="+(totalWeight/hens.length));
	}
}