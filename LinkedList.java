class Node
{
	Node()
	{
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
class LinkList
{
	LinkList()
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
	public void removehead()
	{
		if (head == null)
		{
			System.out.println("You can not remove head becaz head is null");
		}
		else
		{
			head = head.getNext();
		}
	}
	public void removelast()
	{
		
			Node temp = head;
			Node t=temp;
			while (temp.getNext() != null)
			{
				t=temp;
				temp = temp.getNext();
			}
			t.setNext(null);
			//delete(temp);
		
	}
	public void remove(int position)
	{
		
		int i = 0;
		Node temp = head;
		Node t,t1;
		while (i < position)
		{
			temp.setNext(temp.getNext());
			i++;		
		}
		t=temp;
		t1=temp.getNext();
		//free(t);
		temp.setNext(t1.getNext());
				
	}
	public Node gethead()
	{
		return head;	
	}
	public void insert(Object o, int position)
	{
		Node n = new Node(o);
		int i = 0;
		Node temp = head;
		while (i < position)
		{
			temp.setNext(temp.getNext());
			i++;		
		}
		n.setNext(temp.getNext());
		temp.setNext(n);		
	}
	
	private Node head;
	private int size;
}
public class LinkedList {
public static void main(String[] args) {
        LinkList l1 = new LinkList();
	Node node = new Node();
	node.setData("Apple");
        l1.insert(node);
Node node1 = new Node();
	node1.setData("Nokia");
        l1.insert(node1);
Node node2 = new Node();
	node2.setData("Google");
        l1.insert(node2);
System.out.println("LinkList: ");
	node = l1.gethead();
     		while (node!= null)
			{
				System.out.println(node.getData());
				node = node.getNext();
			}
l1.remove(1);
System.out.println("LinkList: ");
	node = l1.gethead();
     		while (node!= null)
			{
				System.out.println(node.getData());
				node = node.getNext();
			}
}		
}
