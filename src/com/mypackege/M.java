package com.mypackege;

import java.util.Scanner;

public class M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		//怪兽数量 Mnum;
		int Mum=0;
		int money=0;
		int power=0;
		Mum=scan.nextInt();
		//
		//怪兽需要的钱
		int NeedM[]=new int[Mum];
		int stranth[]=new int[Mum];
		for(int i=0;i<Mum;i++)
		{
			stranth[i]=scan.nextInt();
		}
		for(int j=0;j<Mum;j++)
		{
			NeedM[j]=scan.nextInt();
		}

		//贿赂第一支怪兽
		int buy[]=new int[Mum];
		money+=NeedM[0];
		power+=stranth[0];
		buy[0]=1;
		for(int i=1;i<Mum;i++)
		{
			if(power<stranth[i])
			{
				//w往回找
				int tempmoney=money;
				int temppower=power;
				for(int j=i-1;j>=0;j--)
				{
					if(buy[j]==0&&stranth[j]+temppower>stranth[i])
					{
						//买下来
						tempmoney+=NeedM[j];
						temppower+=stranth[j];
						break;
					}
					else
					{
						tempmoney+=NeedM[j];
						temppower+=stranth[j];
					}
				}
				//找完了都打不过、
				if(temppower<stranth[i])
				{
					//只有买下来了
					money+=NeedM[i];
					power+=stranth[i];
				}
				else
				{
					money=tempmoney;
					power=temppower;
				}
								
			}
			
			
		}
		System.out.println(money);
		
		
	}

}
