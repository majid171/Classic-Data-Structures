
public class Queue<T>{
	
	public class Node{
		
		private T data;
		private Node next;
	
		public Node(T data, Node next){
			this.data = data;
			this.next = next;
		}
	
	} // End of inner class Node
	
	private Node front;
	
	public Queue(){
		front = null;
	}
	
	public boolean isEmpty(){
		return front == null;
	}
	
	public void enqueue(T data){
		
		if (front == null)
			front = new Node(data, null);
		else{
			Node temp = front;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = new Node(data, null);
		}

	}
	
	public T dequeue(){
		
		if (!isEmpty()){
			T temp = front.data;
			front = front.next;
			return temp;
		}
		
		return null;
	}
	
	public int size(){
		int count = 0;
		Node temp = front;
		
		while(temp != null){
			count++;
			temp = temp.next;
		}
		
		return count;
	}
	
	public void print(){
		Node temp = front;
		
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
		
		System.out.println();
	}
	
}
