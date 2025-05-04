package test;

public class MyLinkedList {
	
	private MyNode head;

	public void add(int value) {
		
		if(head==null) {
			head = new MyNode(value);
		}else {
			MyNode thisNode = head;
			
			while(thisNode.getNextNode()!=null) {
				//前往下一個節點
				thisNode = thisNode.getNextNode();
			}
			//尾部節點
			thisNode.setNextNode(new MyNode(value));
		}
	}
	
	public void printList() {
	    MyNode current = head;
	    System.out.print("[");
	    while (current != null) {
	    	System.out.print(current.getValue() + " , ");
	        current = current.getNextNode();
	    }
	    System.out.print("null");
	    System.out.print("]");
	    
	}
	
	public static void main(String[] args) {
		
		MyLinkedList testList = new MyLinkedList();
		
		for(int i=0;i<10;i++) {
			testList.add(i);
		}
		
		testList.printList();
		
	}

}
