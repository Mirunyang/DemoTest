package writingProject;

public class Solution {

	//都是带有头节点的链表
	public ListNode GetAnswer(ListNode list1,ListNode list2)
	{
		/*ListNode l1=list1;
		ListNode l2=list2;
		while(l1.next!=null)
		{
			l1=l1.next;
		}
		l1.next=new ListNode(-1);
		while(l2.next!=null)
		{
			l2=l2.next;
		}
		l2.next=new ListNode(-1);*/
		//头结点
		ListNode newlist=new ListNode(0);
		ListNode t1=list1;
		ListNode t2=list2;
		ListNode temp=newlist;
		int  carry=0;

        while(t1!=null&&t2!=null)
        {
        	int value=t1.val+t2.val;
        	if(value>=10)
        	{
        		value-=10;
        		carry=1;
        	}
           	else
        	{
        		carry=0;
        	}
        	
        	temp.val+=value;
        	if(temp.val>=10)
        	{
        		temp.val-=10;
        		temp.next=new ListNode(1);
        	}
        	else
        	{
        		temp.next=new ListNode(carry);
        	}
        	
        	
        	temp=temp.next;
        	t1=t1.next;
        	t2=t2.next;
        }


        	while(t2!=null)
        	{
        		temp.val+=t2.val;
            	if(temp.val>=10)
            	{
            		temp.val-=10;
            		temp.next=new ListNode(1);
            	}
            	else
            	{
            	   	temp.next=new ListNode(0);
            	}
         
            	temp=temp.next;
            	t2=t2.next;
        	}
        
        	while(t1!=null)
        	{
        		temp.val+=t1.val;
            	if(temp.val>=10)
            	{
            		temp.val-=10;
            		temp.next=new ListNode(1);
            	}
            	else
            	{
            		temp.next=new ListNode(0);
            	}
            	
            	temp=temp.next;
            	t1=t1.next;
        	}
        

		ListNode t=newlist;
		while(t.next!=temp)
		{
			t=t.next;
		}
		if(temp.val==0)
		{
			t.next=null;
		}
	//	t.next.next=null;
		return newlist;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]= {3,7};
		int arr2[]= {9,2};
		ListNode list1=new ListNode(arr1[0]);
		ListNode t1=list1;
		ListNode list2=new ListNode(arr2[0]);
		ListNode t2=list2;
		
		for(int i=1;i<arr1.length;i++)
		{
			
			t1.next=new ListNode(arr1[i]);
			t1=t1.next;
		}
		//去掉最后一个结点
		//t1=null;
		for(int i=1;i<arr2.length;i++)
		{
			//t2.val=arr2[i];
			t2.next=new ListNode(arr2[i]);
			t2=t2.next;
		}
		//去掉最后一个结点
		//t2=null;
		/*while(list1!=null&&list1.val!=-1)
		{
			System.out.print(list1.val);
			list1=list1.next;
		}*/
		Solution s=new Solution();
		ListNode head=s.GetAnswer(list1, list2);
		while(head!=null)
		{
			
			System.out.print(head.val);
			head=head.next;
		}
		
		
	}

}
