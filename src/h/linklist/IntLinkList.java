package h.linklist;

public class IntLinkList {
	
	public Node head;
	
	public IntLinkList(int item)
	{
		Node node=new Node();
		node.value=item;
		node.link=null;
		head=node;
	}
	
	public boolean addItemToLinkList(int item)
	{
		Node n=new Node();
		n.value=item;
		n.link=head;
		head=n;
		return true;
		
	}
	
	public boolean deleteItem(int item)
	{
		if(head.value==item){
			head=head.link;
			return true;
		}
		Node p=head;
		Node q=p.link;
		
		
		 do
		 {
		 if(q.value==item)
		 {
			 p.link=q.link;
			 q.link=null;
			 return true;
		 }
		 else 
		 {
			    p=q;
				q=q.link;
		 }
		 }while(q!=null);
		 System.out.println("item not find in list");
		 return false;
	}
	
	
	
	public void showAllElements()
	{   Node z=head;
		while(z !=null)
		{
			System.out.println(z.value);
			z=z.link;
		}
		
		
		
	}
    class Node
    {
    	private int value;
    	private Node link;
    	
    }
	
	
	
	
	
	

}
