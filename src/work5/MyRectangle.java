package work5;

public class MyRectangle {
	private double width;
	private double depth;

	public MyRectangle() {
		this(0, 0);
	}

	public MyRectangle(double width, double depth) {
		if (width >= 0 && depth >= 0) {
			this.width = width;
			this.depth = depth;
		} else {
			System.out.println("請確認輸入值");
		}
	}

	public void setWidth(double width) {
		if (width >= 0) {
			this.width = width;
		} else {
			System.out.println("請確認輸入值");
		}

	}

	public void setDepth(double depth) {
		if (depth >= 0) {
			this.depth = depth;
		} else {
			System.out.println("請確認輸入值");
		}

	}

	public double getArea() {
		return this.width * this.depth;
	}

}
