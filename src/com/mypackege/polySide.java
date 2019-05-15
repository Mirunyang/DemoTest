package com.mypackege;

import java.util.Scanner;

public class polySide {

	
	
	//获得交点的横坐标
	public boolean getCrossPoint(Point x1,Point x2, Point target)
	{
		//double _x=0;
		//平行
		if(x1.getY()==x2.getY())
		{
			if(target.y==x1.y&&target.x>=x1.x&&target.x<=x2.x)
			{
				//重合的情况
				return true;
			}
			//平行的情况
			return false;
		}else
		{
			//相交的情况
			double _x=(target.y-x1.y)*(x2.x-x1.x)/(x2.y-x1.y)+x1.x;
			if(_x==target.x)
			{
				return true;
			}
			if(_x<target.x)
			{
				return false;
			}else if(_x>Math.max(x1.x, x2.x))
			{
				return false;
			}
			if(_x<Math.max(x1.x,x2.x)&&_x>Math.min(x1.x, x2.x))
			{
				return true;
			}
			
		}
			
		return false;
	}
	public boolean isInSide(Point p[],Point target)
	{
		if(p.length<3)
		{
			return false;
		}
		for(Point t:p)
		{
			if(target.x==t.x&&target.y==t.y)
			{
				return true;
			}
		}
		int count=0;
		
		for(int i=0;i<p.length;i++)
		{
			Point p0=p[i];
			Point p1=p[(i+1)%p.length];
			if(getCrossPoint(p0,p1,target))
			{
				count++;
			}	
			
		}
		
		if(count%2!=0)
		{
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		polySide ps=new polySide();
		int num=5;
		Scanner scan=new Scanner(System.in);
		System.out.println("输入点的个数。。。");
		 num=scan.nextInt();
		 Point target=new Point();
		 System.out.println("输入待判断的点。。。");
		 Point p[]=new Point[num];
		 target.x=scan.nextDouble();
		 target.y=scan.nextDouble();
		 System.out.println("依次输入"+num+"个节点的x...");
		for(int i=0;i<num;i++)
		{
			p[i]=new Point();
			p[i].x=scan.nextDouble();
		}
		 System.out.println("依次输入"+num+"个节点的y...");
		for(int i=0;i<num;i++)
		{
			p[i].y=scan.nextDouble();
		}
		System.out.println(ps.isInSide(p, target));
		
		
	}

}
