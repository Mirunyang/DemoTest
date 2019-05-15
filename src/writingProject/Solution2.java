package writingProject;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
	
	 public int lengthOfLongestSubstring(String s) {
	        char[]ch=s.toCharArray();
	        int count=0;
	        int num=0;
	        Set<Character>set=new HashSet<>();
	        for(int i=0;i<ch.length-count;i++)
	        {
	        	set.clear();
	        	count=0;
	        	for(int j=i;j<ch.length;j++)
	        	{
	        		if(set.add(ch[j]))
	        		{
	        			count++;
	        		}else
	        		{
	        			break;
	        		}
	        	}
	        	if(count>num)
	        	{
	        		num=count;
	        	}
	        	
	        }
 
		 return num;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Set<Character>set=new HashSet<>();
		boolean f=set.add('a');
		System.out.println(f);
		f=set.add('b');
		System.out.println(f);
		f=set.add('a');
		System.out.println(f);*/
		String s="pwwkew";
		Solution2 c=new Solution2();
		System.out.println(c.lengthOfLongestSubstring(s));
		
		
	}

}
