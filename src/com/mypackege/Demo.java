package com.mypackege;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.nextLine();
		char[]ch=scan.nextLine().toCharArray();
		int zero=0;
		int one=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='1')
			{
				one++;
			}
			else zero++;
		}
		System.out.println(Math.abs(one-zero));
	System.out.println("testdemo");
	System.out.println("aaaaaaaaaaaaa");

}
}
