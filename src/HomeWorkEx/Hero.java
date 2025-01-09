package HomeWorkEx;

public abstract class Hero {
	// 省略 getter/setter...

	private String name;
	private int level;
	private double exp;
	
	//宣告動作的模式，待後面getter接收外部產生的物件
	//使用介面來表達動作方法，然後於類別中實作方法
	private AttackMode attack;
	private DefendMode defend;
	private MoveMode move;
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	
	
	public void setAttack(AttackMode attack) {
		this.attack =attack;
	}
	
	public void setDefend(DefendMode defend) {
		this.defend =defend;
	}
	
	public void setMove(MoveMode move) {
		this.move =move;
	}
	
	protected void attack() {
		attack.attack();
	}
	
	protected void defend() {
		defend.defend();
	}
	
	protected void move() {
		move.move();
	}
}
