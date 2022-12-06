package CarTest_6_24;
class Car{
	String color;
	String gearType;
	int door;
	Car(){}
	Car(String c, String g ,int d) {
		color = c;
		gearType =g;
		door =d;
}
}
class CarTest {
	public static void main(String [] args) {
		Car cl= new Car();
		cl.color = "white";
		cl.gearType ="auto";
		cl.door =4;
		Car c2 =new Car("white","auto", 4);
		System.out.println("c1 의 color"+cl.color+", gearType=" +cl.gearType+", door ="+cl.door);
		System.out.println("c2 의 color"+c2.color+", gearType=" +c2.gearType+", door ="+c2.door);
	}
}
