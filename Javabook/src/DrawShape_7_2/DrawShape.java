package DrawShape_7_2;

class Tv {
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp()

	{
		++channel;
	}

	void channelDown()

	{
		--channel;
	}
}

class CaptionTv extends Tv {
	boolean caption;

	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

class DrawShape {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World1");
		ctv.caption = true;
		ctv.displayCaption("Hello, world2");
	}
}