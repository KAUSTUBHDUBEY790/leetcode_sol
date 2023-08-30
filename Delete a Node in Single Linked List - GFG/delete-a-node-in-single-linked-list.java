//{ Driver Code Starts
import java.util.*;
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}
class DeleteNode
{
	Node head;
	void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	public void addToTheLast(Node node) 
	{
		if (head == null) 
		{
			head = node;
		} else 
		{
		   Node temp = head;
		   while (temp.next != null)
		   temp = temp.next;

		   temp.next = node;
		}}
	public static void main(String args[])
    {
       
         Scanner sc = new Scanner(System.in);
		 int t  =sc.nextInt();
		 
		 while(t>0)
         {
			int n = sc.nextInt();
			//int k = sc.nextInt();
			DeleteNode llist = new DeleteNode();
			//int n=Integer.parseInt(br.readLine());
			int a1 = sc.nextInt();
			Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
			int x = sc.nextInt();
			//System.out.println(llist.head.data);
			  GfG g = new GfG(); 
			//System.out.println(k);
			//System.out.println(g.getNthFromLast(llist.head,k));
			Node result = g.deleteNode(llist.head, x);
			llist.printList(result);
		t--;
		}
	}
}
// } Driver Code Ends




/* Linklist node structure
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
/*You are required to complete below method*/
class GfG
{
    Node deleteNode(Node l, int x)
    {
	// Your code here
	Node head=l;
	int z=1;
	if(x==1)
	{
	    l=l.next;
	    return l;
	}
	while(z<x-1)
	{
	    head=head.next;
	    z++;
	}
	head.next=head.next.next;
	return l;
    }
}
