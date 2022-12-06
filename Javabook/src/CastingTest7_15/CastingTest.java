package CastingTest7_15;

public class CastingTest {
public static void main(String[] args) {
	Car car = null;
	FireEngine fe = new FireEngine();//레퍼런스 변수
	FireEngine fe2 =  null;
	
	fe.water();
	car= fe;
	//car.water();
	fe2 =(FireEngine)car;
	fe2.water();
	
}
}
class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrrr~");
	}
	void stop() {
		System.out.println("stop!!!");
	}
	
}
class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
}