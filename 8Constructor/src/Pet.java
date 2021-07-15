/**
 * HW8_6
 * @author karti
 *
 */
public class Pet {
	private String petType;
	private String petName;
	private String breed;
	private int age;
	private String color;
	private boolean barks;
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void barks() {
		if (breed.equalsIgnoreCase("dog")) {
			barks = true;
		} else {
			barks = false;
		}
	}
	
}
