/**
 * HW8_2
 * @author karti
 *
 */
public class HW8_2 {
	private boolean power;
	
	public void switchOn() {
		power = true;
	}
	public void switchOff() {
		power = false;
	}
	public void isLampOn() {
		if (power == true) {
			System.out.println("The Lamp is On");
		} else {
			System.out.println("The Lamp is Off");
		}
	}

}
