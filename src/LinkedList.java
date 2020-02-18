
public class LinkedList {
	
	public Node head=null;
	
	public void add(Object obj) {
		Node n= new Node(obj);
		if(head == null) {
			head=n;
		
		}else {
			Node temp=head;
			while(temp.next != null) {
				temp= temp.next;
			}
			temp.next=n;
		}
	}
	
	
	public void display() {
		Node temp=head;
		while(temp != null){
			System.out.println(temp.obj);
			temp=temp.next;
		}
	}
	
	
	public void reverse() {
		
		
		Node prev=null;
		Node current=head;
		Node next=null;
		
		while(current != null) {
			
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			
		}
		
		head=prev;
		
		
	}
	
	public void reverse1(Node current,Node prev) {
		
		
		Node next=current.next;
		
		
		if(next != null) {
			
			reverse1(next, current);
		}
		if(current.next == null) {
			current.next=prev;
			head=current;
		}else {
			current.next=prev;
			
		}
		
	}

}
