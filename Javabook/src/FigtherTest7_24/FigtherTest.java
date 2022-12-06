package FigtherTest7_24;

class FigtherTest {
	public static void main(String[] args) {
		Figther f = new Figther();

		if (f instanceof Unit) {
			System.out.println("f는 Unit클래스의 자손입니다.");
		}

		if (f instanceof Figthable) {
			System.out.println("f는 Fightable인터페이스를 구현합니다.");
		}
		if (f instanceof Movable) {
			System.out.println("f는  Movable인터페이스를 구현했습니다.");
		}
		if (f instanceof Attackable) {
			System.out.println("f는 Attackable인터페이스를 구현했습니다.");
		}
		if (f instanceof Object) {
			System.out.println("f 는 Object클래스의 자손입니다.");
		}
	}
}
	class Figther extends Unit implements Figthable {
		public void move(int x, int y) {
		}

		public void attack(Unit u) {
		}
	}

	class Unit {
		int currentHp;
		int x;
		int y;

	}

	interface Figthable extends Movable, Attackable {
	}

	interface Movable {
		void move(int x, int y);
	}

	interface Attackable {
		void attack(Unit u);
	}

