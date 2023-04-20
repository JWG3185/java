package game;

public class MyWeapon implements weapon{
	
	//�ʵ�(�Ӽ�)
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
