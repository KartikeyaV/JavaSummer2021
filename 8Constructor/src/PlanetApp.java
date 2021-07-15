/**
 * HW8_3
 * @author karti
 *
 */
public class PlanetApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet mercury = new Planet();
		mercury.setName("Mercury");
		mercury.setOrbitalPeriod("88 Days");
		mercury.setDistanceFromSun("30.7 Million Miles");
		mercury.setSurfaceArea("29 Million Miles^2");
		mercury.setLengthOfDay("58.5 Days");
		mercury.setRadius("1516 Miles");
		mercury.setRings(false);
		
		Planet venus = new Planet();
		venus.setName("Venus");
		venus.setOrbitalPeriod("225 Days");
		venus.setDistanceFromSun("67 Million Miles");
		venus.setSurfaceArea("178 Million Miles^2");
		venus.setLengthOfDay("116.75 Days");
		venus.setRadius("3760 Miles");
		venus.setRings(false);
		
		Planet earth = new Planet();
		earth.setName("Earth");
		earth.setOrbitalPeriod("365 Days");
		earth.setDistanceFromSun("94.5 Million Miles");
		earth.setSurfaceArea("197 Million Miles^2");
		earth.setLengthOfDay("24 Hours");
		earth.setRadius("3950 Miles");
		earth.setRings(false);
		
		Planet mars = new Planet();
		mars.setName("Mars");
		mars.setOrbitalPeriod("687 Days");
		mars.setDistanceFromSun("156 Million Miles");
		mars.setSurfaceArea("569 Million Miles^2");
		mars.setLengthOfDay("24.5 Hours");
		mars.setRadius("2106 Miles");
		mars.setRings(false);
		
		Planet jupiter = new Planet();
		jupiter.setName("Jupiter");
		jupiter.setOrbitalPeriod("12 Years");
		jupiter.setDistanceFromSun("468 Million Miles");
		jupiter.setSurfaceArea("24 Billion Miles^2");
		jupiter.setLengthOfDay("10 Hours");
		jupiter.setRadius("43441 Miles");
		jupiter.setRings(true);
		
		Planet saturn = new Planet();
		saturn.setName("Saturn");
		saturn.setOrbitalPeriod("29 Years");
		saturn.setDistanceFromSun("923 Million Miles");
		saturn.setSurfaceArea("16.5 Billion Miles^2");
		saturn.setLengthOfDay("11 Hours");
		saturn.setRadius("36184 Miles");
		saturn.setRings(true);
		
		Planet uranus = new Planet();
		uranus.setName("Uranus");
		uranus.setOrbitalPeriod("84 Years");
		uranus.setDistanceFromSun("1.84 Billion Miles");
		uranus.setSurfaceArea("3.12 Billion Miles^2");
		uranus.setLengthOfDay("17 Hours");
		uranus.setRadius("15759 Miles");
		uranus.setRings(true);
		
		Planet neptune = new Planet();
		neptune.setName("Neptune");
		neptune.setOrbitalPeriod("165 Years");
		neptune.setDistanceFromSun("2.8 Billion Miles");
		neptune.setSurfaceArea("2.94 Billion Miles^2");
		neptune.setLengthOfDay("16 Hours");
		neptune.setRadius("15300 Miles");
		neptune.setRings(true);
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("Name     | Orbital Period | Distance From Sun    | Surface Area         | Length Of Day | Radius      | Has Rings |"); 
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		printDetails(mercury);
		printDetails(venus);
		printDetails(earth);
		printDetails(mars);
		printDetails(jupiter);
		printDetails(saturn);
		printDetails(uranus);
		printDetails(neptune);
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
	}
	
	public static void printDetails(Planet aPlanet) {
		String formatdata = String.format("%-8s | %-14s | %-20s | %-20s | %-13s | %-11s | %-9s |", aPlanet.getName(), aPlanet.getOrbitalPeriod(), aPlanet.getDistanceFromSun(), aPlanet.getSurfaceArea(), aPlanet.getLengthOfDay(), aPlanet.getRadius(), aPlanet.isRings());
		System.out.println(formatdata);
	}

}
