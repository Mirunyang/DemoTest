package writingProject;

public class Solution3 {

	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        
		 int arr[]=new int[nums1.length+nums2.length];
		 int indexi=0;
		 int indexj=0;
		 int i=0;
		while(indexi<nums1.length&&indexj<nums2.length)
		 {
			 if(nums1[indexi]<nums2[indexj])
			 {
				 arr[i]=nums1[indexi];
				 indexi++;
			 }else
			 {
				 arr[i]=nums2[indexj];
				 indexj++;
			 }
			 i++;
		 }
		while(indexi<nums1.length)
		{
			arr[i]=nums1[indexi];
			indexi++;
			i++;
		}
		while(indexj<nums2.length)
		{
			arr[i]=nums2[indexj];
			indexj++;
			i++;
		}
		//zongshuÎ»Å¼Êý
		 if(arr.length%2==0)
		 {
			 int a=arr[arr.length/2-1];
			 int b=arr[arr.length/2];
			 return (a+b)/2.0;
		 }
		 return arr[arr.length/2];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution3 c=new Solution3();
		int arr1[]= {1,2};
		int arr2[]= {3,4};
		System.out.println(c.findMedianSortedArrays(arr1, arr2));
		
	}

}
