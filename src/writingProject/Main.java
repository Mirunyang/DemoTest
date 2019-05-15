package writingProject;

public class Main {

	
	 public int[] maxSlidingWindow(int[] nums, int k) {
		 int max=Integer.MIN_VALUE;
		 int backarr[]=new int[nums.length-k+1];
		 if(k==0||nums.length==0)
		 {
			 return new int[] {};
		 }
		
		 if(k>=nums.length)
		 {
			
			 for(int i=0;i<nums.length;i++)
			 {
				 if(max<nums[i])max=nums[i];
			 }
			 backarr[0]=max;
			 return new int[] {max};
		 }
		 for(int i=0;i<nums.length-k+1;i++)
		 {
			 int j=i+k-1;
			 max=Integer.MIN_VALUE;
			 for(int m=i;m<=j;m++)
			 {
				 if(max<nums[m])max=nums[m];
			 }
			 backarr[i]=max;
			 
			 
		 }
		 
		 return backarr;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[]= {1,-1};
		Main m=new Main();
		int arr[];
		int k=1;
		arr=m.maxSlidingWindow(nums, k);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
