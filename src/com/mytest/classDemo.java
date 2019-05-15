package com.mytest;

public class classDemo {

	public static int reverse(int x)
	{
		int num=0;
		int i=10;
		try
		{
			
			while(x/i!=0)
			{
				int yushu=x%i;
				int chen=Math.multiplyExact(num, 10);
				num=Math.addExact(chen, yushu);
			//	num=num*10+yushu;
				x=x/10;
				
			}
			int ch=Math.multiplyExact(num, 10);
		num=Math.addExact(ch, x);
			
		}catch(ArithmeticException e)
		{
			return 0;
		}
		
		
		
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(reverse(1534236469));
		System.out.println(Integer.MAX_VALUE);
		
	}

}
