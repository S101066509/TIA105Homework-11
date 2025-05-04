package test;

public class MyNode {
	
	private int value ;
	private MyNode nextNode;
	
	public MyNode(int value){
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public MyNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(MyNode nextNode) {
		this.nextNode = nextNode;
	}
	

}
