package com.mypackege;

import java.util.Scanner;

public class Main {

	private long MAXSIZE=1000000000;//����������
	private long[] arr;
	private long SUN=0;
	public Main()
	{
		//arr=new int[MAXSIZE];
	}
	//���i����������Ϊ����
	//��Ӧ��ֵΪ�±��1
	public boolean IsJishu(long i)
	{
		if(i%2!=0)return true;
		return false;
		
	}
	public int FUNCT(long i)
	{
		return (int) (IsJishu(i)==true?i+1:(i+1)*(-1));
	}
	public long Caculate(int L,int R)
	{
		
		if(L<1||R<1||L>1000000000||R>1000000000||L>R)
		{
			return 0;
		}
		arr=new long[R];
		//��������
		if(IsJishu(L))
			{
			//int index=(int) ((-1)*L);
			 arr[L-1]=L*(-1);
			}
		else {
			//int index=(int) ((-1)*L);
			arr[(L-1)]=L;
		}
		if(IsJishu(R))
		{
			//int index=(int) ((-1)*R);
			arr[R-1]=R*(-1);
		}else
		{
			arr[(R-1)]=R;
		}
		//���ֵ
		//��L-R֮��
		long Lindex=Math.abs(L);
		long Rindex=Math.abs(R);
		//SUN+=arr[(int) (Lindex-1)];
		for(long i=Lindex-1;i<Rindex;i++)
		{
			arr[(int) i]=FUNCT(i);
			SUN+=arr[(int) i];
		}
		
		
		return SUN;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dataCount=0;
		
		 try
		 {
		 Scanner in = new Scanner(System.in);
		 dataCount=in.nextInt();
		 if(dataCount>100000||dataCount<1)
		 {
				System.out.println("�쳣����");
		 }
		 else
		 {
	        for(int i=0;i<dataCount;i++) {//ע��while������case
	        	//dataCount=in.nextInt();
	        	 Main t=new Main();
	            int L = in.nextInt();
	            int R = in.nextInt();
	            //System.out.println(a + b);
              long i1=t.Caculate(L, R);
		      System.out.println(i1);
	        }}}catch(Exception e)
	        {
	        	System.out.println(e.getMessage());
	        
	        
	        }
		 }
}


