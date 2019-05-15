package writingProject;

public class Solution4 {

	  public String longestPalindrome(String s) {
	        
		  char []ch=s.toCharArray();
		  if(ch.length==0)
		  {
			  return new String();
		  }
		  if(ch.length==1)
		  {
			  return String.valueOf(ch);
		  }
		  StringBuffer str=new StringBuffer();
		  str.append(ch[0]);
		  int count=0;
		 int from=0;
		 int to=0;
		  for(int i=2;i<=ch.length;i++)
		  {
			  for(int j=0;j<=ch.length-i;j++)
			  {
				  int pre=j;
				  int las=j+i-1;
				  count=0;
				  while(pre<=las)
				  {
					  
					  if(ch[pre]==ch[las])
					  {
						  count++;
						  
						  pre++;
						  las--;
					  }
					  else
					  {
						 
						  break;
					  }
				  }
				  if((i+1)/2==count&&str.length()<i)
				  {
					
					 from=j;
					 to=j+i-1;
					 
				  }
				  
				  
			  }
		  }
		  str.setLength(0);
		  for(int m=from;m<=to;m++)
		  {
			  str.append(s.charAt(m));
		  }
		  return str.toString();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution4 c=new Solution4();
		String s="ccc";
		String temp=c.longestPalindrome(s);
		System.out.println(temp);
	}

}
