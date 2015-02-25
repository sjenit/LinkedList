class Node()
{
	Node()
	{
		this.data = null;
		this.next = null;
	}
	
	Node(Object o)
	{
		this.data = o;
	}

	public Node getNext()
	{
		return next;
	}
	
	public Object getData()
	{
		return data;
	}

	public void setData(Object o)
	{
		this.data = o;
	}

	public void setNext(Node n)
	{
		next = n;
	}

	private Object data;
	private Node next;
}
class LinkedList()
{
	LinkedList()
	{
		head = null;
		size = 0;
	}
	
	public int getSize()
	{
		return this.size;
	}

	public void insert(Object o)
	{
		Node n = new Node(o);
		if (head == null)
		{
			head = n;
		}
		else
		{
			Node temp = head;
			while (temp.getNext() != null)
			{
				temp = temp.getNext();
			}
			n.setNext(temp.getNext());
			temp.setNext(n);
		}
	}

	public void insert(Object o, int position)
	{
		Node n = new Node(o);
		int i = 0;
		Node temp = head;
		while (i < position)
		{
			temp.setNext(t.getNext());		
		}
		n.setNext(temp.getNext());
		temp.setNext(n);		
	}
	
	private Node head;
	private int size;
}
