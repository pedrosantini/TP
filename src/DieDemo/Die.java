package DieDemo;
import java.util.Random;

public class Die {
    private int sideUp;
	
	public Die() {
		this.roll();
	}
	
	public int getSideUp() {
		return this.sideUp;
	}
	public void roll() {
		Random x = new Random();
		this.sideUp = (x.nextInt(6)+1);
	}
}
