package lab;

public class ParkMaker {
	public static void main(final String[] args) {
		Park firstPark = new Park();
		Park secondPark = new Park("Sheptitskogo 15", 35, 50, 350);
		Park thirdPark = new Park("Shevchenka 12", 240, 50, 1500, "National Central Park", 350, 3);
		Park.cityOfLocation = "Chervonohrad";

		System.out.println(firstPark);
		System.out.println(secondPark);
		System.out.println(thirdPark);
		System.out.println(firstPark.printCityOfLocation());
		System.out.println(Park.printStaticCityOfLocation());

		Park[] parkArray = new Park[4];
		int currentParkIndex = 0;
		while (currentParkIndex < 4) {
			parkArray[currentParkIndex] = new Park("Mazepu 1" + currentParkIndex, 35, 50, 350);
			currentParkIndex++;
		}
		for (Park parkArrayElement : parkArray) {
			System.out.println(parkArrayElement.toString());
		}
	}
}
