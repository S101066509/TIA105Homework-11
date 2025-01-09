package workExt;

public class Pencil extends Pen{
	public Pencil(String brand, double price) {
		super(brand,price);
	}
	public Pencil(String brand) {
		super(brand);
	}
	public Pencil(double price) {
		super(price);
	}
	public Pencil() {
		super();
	}

	@Override
	protected void write() {
		System.out.println("削鉛筆再寫");
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice()*0.8;
	}
	public double getOriPrice() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}


}
