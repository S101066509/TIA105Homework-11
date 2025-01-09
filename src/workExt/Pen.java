package workExt;

public abstract class  Pen {
	//屬性
	private String brand;
	private double price;
	//建構子無參數
	
	//建構子品牌與售價
	public Pen(String str, double price) {
		this.brand = str;
		this.price = price;
	}
	//2
	public Pen(String str) {
		this(str,0);
	}
	//3
	public Pen(double price) {
		this("-",price);
	}
	//4
	public Pen() {
		this("-",0);
	}
	
	
	//gettet
	public String getBrand() {
		return brand;
	}
	public double getPrice() {
		return price;
	}
	//settet
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(double price) {
		if(price>=0) {
			this.price = price;
		}else {
			System.err.println("請確認售價");
		}
	}
	
	//抽象方法
	protected abstract void write();
	

}
