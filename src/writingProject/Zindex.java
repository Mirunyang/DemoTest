package writingProject;

public class Zindex {

	 public String convert(String s, int numRows) {
	        
		 double lenth=s.length();
		 double col=0,row=0;
		 if(lenth==1||numRows<=1)
		 {
			 return s;
		 }
		 row=numRows;
		 col=Math.ceil((lenth/(2*row-2)))*(row-1);
		 char[][]ch=new char[(int) row][(int) col];
		 //³õÊ¼»¯
		 for(int i=0;i<ch.length;i++)
		 {
			 for(int j=0;j<ch[i].length;j++)
			 {
				
				 ch[i][j]=' ';
			 }
		 }
		 int count=0;
		 for(int i=0,j=0;i<row&&count<lenth;i++)
		 {
			 
			 if(i==row-1)
			 {
				 ch[i][j]=s.charAt(count);//chatAt(count);
				 count++;
				 while(i!=0)
				 {
					 if(count==lenth)
					 {
						 break;
					 }
					 //Ð±×ÅÌî³ä
					 ch[i-1][j+1]=s.charAt(count);
					 i--;
					 j++;
					 count++;
					
				 }
			 }
			 else
			 {
				 //Êú×ÅÌî³ä
				 ch[i][j]=s.charAt(count);//chatAt(count);
				 count++;
			 }
			
		 }
		 StringBuffer str=new StringBuffer();
		 for(int i=0;i<ch.length;i++)
		 {
			 for(int j=0;j<ch[i].length;j++)
			 {
				 System.out.print(ch[i][j]);
				// str.append(ch[i][j]);
				 
				 if(ch[i][j]!=' ')
				 {
					 str.append(ch[i][j]);
				 }
				
			 }
			 System.out.println();
		 }
		 System.out.println();
		 return str.toString();
	    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * "jygxbzmralrbcnqjauietpxvllbffkfrilqlmccoqwpsjidlclpwcmtnzwtghaxropfaujpkfgeqohb"
68
 * 
 * 
 * */
		String s="jygxbzmralrbcnqjauietpxvllbffkfrilqlmccoqwpsjidlclpwcmtnzwtghaxropfaujpkfgeqohb";
		Zindex test=new Zindex();
		System.out.println(test.convert(s, 68));
	}

}
