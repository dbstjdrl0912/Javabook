package Tv1;

class Tv {

	String color;
	boolean power;
	private	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}

	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public int getChannel() {
		return channel;
	}
}

public class TvTest2 {
	public static void main(String args[]) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1 의 channel 값은" + t1.getChannel() + "입니다.");
		System.out.println("t2 의 channel 값은" + t2.getChannel() + "입니다.");
		t1.setChannel(7);
		
//		System.out.println(t1.channelp[]);
		
//		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		System.out.println("t1 의 channel 값은" + t1.getChannel() + "입니다.");
		System.out.println("t2 의 channel 값은" + t2.getChannel() + "입니다.");
	}
}
