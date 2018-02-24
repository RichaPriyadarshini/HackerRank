
public class CircularLinkedList {

	private Node head;
	public CircularLinkedList()
	{
		this.head=new Node("head");
		
	}
	
	public Node head()
	{
		return head;
	}
	
	public void Add(Node node)
	{
		Node current=head;
		
		while(current.next!=null)
		{
			current=current.next();
		}
		
		current.setNext(node);
	}
	
	public boolean isCyclic()
	{
		Node ptr1=head;
		Node ptr2=head;
		
		while(ptr1!=null && ptr1.next!=null)
		{
			ptr1=ptr1.next.next;
			System.out.println(ptr1.data);
			
			ptr2=ptr2.next();
			System.out.println(ptr2.data);
			
			if(ptr1==ptr2)
			{
				return true;
			}
			
		}
		return false;
	}

	public static class Node{
		private String data;
		private Node next;
		
		public Node( String data)
		{
			this.data=data;
		}
		
		public String data()
		{
			return data;
		}
		
		public void setData()
		{
			this.data=data;
		}
		
		public Node next() 
		{ return next; }
		
		public void setNext(Node next) 
		{ this.next = next; }

		@Override 
		public String toString() { return this.data; }

		
		
	}
		public static void main(String args[])
		{
			CircularLinkedList linkedList = new CircularLinkedList(); 
			linkedList.Add(new CircularLinkedList.Node("101"));
			CircularLinkedList.Node cycle = new CircularLinkedList.Node("201");
			linkedList.Add(cycle);
			linkedList.Add(new CircularLinkedList.Node("301"));
			linkedList.Add(new CircularLinkedList.Node("401"));
			linkedList.Add(cycle);
			
			if(linkedList.isCyclic()){
				System.out.println("Linked List is cyclic");
				}else
				{ System.out.println("LinkedList is not cyclic");
				} 

			
		}
	}


