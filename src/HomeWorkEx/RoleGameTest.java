package HomeWorkEx;

public class RoleGameTest {

	public static void main(String[] args) {
		SwordMan saber = new SwordMan("亞拉岡", 1, 0);
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
		AttackSlash attack1 = new AttackSlash();
		AttackShoot attack2 = new AttackShoot();
		DefenShieldDefense defen1 = new DefenShieldDefense();
		MoveRun move1 = new MoveRun();
		saber.setAttack(attack1);
		saber.setDefend(defen1);
		saber.setMove(move1);
		
		archer.setAttack(attack2);
		archer.setDefend(defen1);
		archer.setMove(move1);
		
		
		
		saber.attack();
		saber.defend();
		saber.move();
		System.out.println("========================");
		archer.attack();
		archer.defend();
		archer.move();
	}

}
