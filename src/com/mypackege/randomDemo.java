package com.mypackege;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class randomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rd=new Random();
		Set<Integer>set=new HashSet<>();
		int arr[]=new int[4];
		while(set.size()<100)
		{
	
        arr[0]=Math.abs(rd.nextInt())%7+1;
		arr[1]=(Math.abs(rd.nextInt())%7+1);
		arr[2]=(Math.abs(rd.nextInt())%4);
		arr[3]=(Math.abs(rd.nextInt())%9+1);
		int n=0;
		n=arr[0]*1000+arr[1]*100+arr[2]*10+arr[3];
		set.add(n);
		}
		for(Iterator<Integer>it=set.iterator();it.hasNext();)
		{
			System.out.println(it.next());
		}
	}
}
