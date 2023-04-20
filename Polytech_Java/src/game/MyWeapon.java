package game;

public class MyWeapon implements weapon{
	
	//필드(속성)
	private int curPower;
	
	@Override
	public void fire(int power) {
		this.curPower = this.curPower - power;
	}

	@Override
	public int getRestPower() {
		return this.curPower;
	}

	@Override
	public int charge(int power) {
		return this.curPower = this.curPower + power;
	}
	
}
