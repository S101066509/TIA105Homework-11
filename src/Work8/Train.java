package Work8;

import java.util.Objects;

public class Train implements Comparable<Train> {
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public int getNumber() {
		return number;
	}
	
	public String getType() {
		return type;
	}
	public String getStart() {
		return start;
	}
	public String getDest() {
		return dest;
	}
	public double getPrice() {
		return price;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Train(int number,String type,String start,String dest,double price){
		this.setNumber(number);
		this.setType(type);
		this.setStart(start);
		this.setDest(dest);
		this.setPrice(price);
	}
	public Train() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	@Override
	public int compareTo(Train o) { //實作compareTo以便後續TreeSet使用
		if(this.number>o.number) {
			return 1;
		}else if(this.number<o.number) {
			return -1;
		}else {
			return 0;
		}
	}
}
