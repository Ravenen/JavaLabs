package lab;

public class MainClass
{
    public static void main(final String[] args) {
        ParkClass.numberOfParks = 0;
        final ParkClass firstPark = new ParkClass();
        final ParkClass secondPark = new ParkClass("Sheptitskogo 15", 35, 50, 350);
        final ParkClass thirdPark = new ParkClass("Shevchenka 12", 240, 50, 1500, "National Central Park", 350, 3);
        System.out.println(firstPark.toString());
        System.out.println(secondPark.toString());
        System.out.println(thirdPark.toString());
        System.out.println(firstPark.printNumberOfParks());
        System.out.println(ParkClass.printStaticNumberOfParks());
        final ParkClass[] parkArray = new ParkClass[4];
        for (int currentParkIndex = 0; currentParkIndex < 4; ++currentParkIndex) {
            parkArray[currentParkIndex] = new ParkClass("Mazepu 1" + currentParkIndex, 35, 50, 350);
        }
        ParkClass[] array;
        for (int length = (array = parkArray).length, i = 0; i < length; ++i) {
            final ParkClass park = array[i];
            System.out.println(park.toString());
        }
    }
}
