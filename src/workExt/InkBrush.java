package workExt;

public class InkBrush extends Pen {
	

	public InkBrush(String brand, double price) {
		super(brand,price);
	}
	public InkBrush(String brand) {
		super(brand);
	}
	public InkBrush(double price) {
		super(price);
	}
	public InkBrush() {
		super();
	}

	@Override
	protected void write() {
		System.out.println("沾墨汁再寫");
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice()*0.9;
	}
	public double getOriPrice() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}

}
