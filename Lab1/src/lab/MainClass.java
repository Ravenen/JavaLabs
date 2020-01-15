package lab;

public class MainClass {
	public static void main(final String[] args) {
		ParkClass.numberOfParks = 0;
		ParkClass firstPark = new ParkClass();
		ParkClass secondPark = new ParkClass("Sheptitskogo 15", 35, 50, 350);
		ParkClass thirdPark = new ParkClass("Shevchenka 12", 240, 50, 1500, "National Central Park", 350, 3);

		System.out.println(firstPark.toString());
		System.out.println(secondPark.toString());
		System.out.println(thirdPark.toString());
		System.out.println(firstPark.printNumberOfParks());
		System.out.println(ParkClass.printStaticNumberOfParks());

		ParkClass[] parkArray = new ParkClass[4];
		int currentParkIndex = 0;
		while (currentParkIndex < 4) {
			parkArray[currentParkIndex] = new ParkClass("Mazepu 1" + currentParkIndex, 35, 50, 350);
			currentParkIndex++;
		}
		for (ParkClass parkArrayElement : parkArray) {
			System.out.println(parkArrayElement.toString());
		}
	}
}
