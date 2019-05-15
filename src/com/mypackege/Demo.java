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
	/*	StringBuilder sb=new StringBuilder();
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.nextLine();
	
		int index=0;
		sb.append(scan.nextLine());	
		for(int i=0;i<num/2;i++)
		{
			char ch[]=sb.toString().toCharArray();
			for(int j=0;j<sb.length()-1;j++)
			{
				if((ch[j]=='1'&&ch[j+1]=='0')||(ch[j]=='0'&&ch[j+1]=='1'))
				{
					sb.replace(j, j+2, "");
					index++;
					break;
				}
			}
		}
		
		System.out.println(sb.length());
		
	}*/

}
}
