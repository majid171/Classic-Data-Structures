
public class Stack<T>{
	
	public class Node{
		
		private T data;
		private Node next;
		
		public Node(T data, Node next){
			this.data = data;
			this.next = next;
		}
		
	} // End of inner class Node

	private Node top;
	private int size;
	
	public Stack(){
		top = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return top == null;
	}
	
	public int size(){
		return size;
	}
	
	public void enqueue(T data){
		top = new Node(data, top);
		size++;
	}
	
	public T dequeue(){
		
		if (!isEmpty()){
			T temp = top.data;
			top = top.next;
			size--;
			return temp;
		}
	
		return null;
	}
	
	public void print(){
		Node temp = top;
		
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
		
		System.out.println();
	}
}


