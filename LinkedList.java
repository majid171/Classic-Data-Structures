
public class LinkedList <T>{
	
	public class Node{
		
		private T data;
		private Node next;
		
		public Node(T data, Node next){
			this.data = data;
			this.next = next;
		}
		
	} // End of inner class Node

	private Node head;
	
	public LinkedList(){
		head = null;
	}
	
	public void print(){
		Node temp = head;
		
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
		
		System.out.println();
	}

	public int size(){
		int count = 0;
		
		Node temp = head;
		
		while(temp != null){
			count++;
			temp = temp.next;
		}
		
		return count;
	}
	
	public void addToFront(T data){
		head = new Node(data, head);
	}
	
	public void addToEnd(T data){
		
		if (head == null){
			addToFront(data);
		}
		else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = new Node(data, null);
		}
	}
	
	public void deleteFirst(){
		head = head.next;
	}
	
	public void deleteLast(){
		Node temp = head;
		
		while(temp.next != null){
			temp = temp.next;
		}
		
		temp.next = null;
	}

}
