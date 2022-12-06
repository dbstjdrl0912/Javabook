package TVCR_7_4;
class Tv { 
	boolean power;
	int channel;
	int Hp = 100;
	
	void power() {power = ! power;}
	void channelUp() {++channel;}
	void channelDown() { --channel;}
	void hit() {--Hp;;}
}
class VCR{
	boolean power;
	int counter = 0;
	void power() { 
		power = !power;
		}
	void hit() {
		
	}
	void stop() {
		
	}
	void rew() {
		
	}
	void ff() {
		
	}
}
class TVCR extends Tv {
	VCR vcr = new VCR();
	void hit() {
		vcr.hit();
	}
	void stop() {
		vcr.stop();
	}
	void rew() {
		vcr.rew();
	}
	void ff() {
		vcr.ff();
	}
}