package lab;

import java.util.ArrayList;

public class ChristmasFair {	
	public static void main(String[] args) {
		ChristmasFairManager fairManager = new ChristmasFairManager(generateDecorations());
		
		ArrayList<Decoration> foundDecorations = fairManager.findDecorationsByType(new DecorationType(true, false, true, true));
		System.out.println("Found items on fair:");
		printArray(foundDecorations);
		System.out.println("-----------------------");
		System.out.println();
		
		System.out.println("Sorted by price ascending:");
		foundDecorations = fairManager.sortByPrice(SortType.ASCENDING);
		printArray(foundDecorations);
		System.out.println("-----------------------");
		System.out.println();
		
		System.out.println("Sorted by color descending:");
		foundDecorations = fairManager.sortByColor(SortType.DESCENDING);
		printArray(foundDecorations);
	}
	
	private static void printArray(ArrayList<Decoration> items) {
		for (Decoration currentItem : items) {
			System.out.println(currentItem);
		}
	}
	
	private static ArrayList<Decoration> generateDecorations() {
		Light firstLight = new Light("Red", 250.50, new DecorationType(true, false, true, false), 220.0, 50);
		Light secondLight = new Light("Rainbow", 550.10, new DecorationType(true, true, true, true), 250.0, 100);
		TreeToy firstToy = new TreeToy("Blue", 100.0, new DecorationType(true, true, true, false), "Pig", 20);
		TreeToy secondToy = new TreeToy("White", 150.99, new DecorationType(true, true, true, false), "Snowman", 50);
		Garland firstGarland = new Garland("Yellow", 20.0, new DecorationType(true, false, true, true), 2, false);
		Garland secondGarland = new Garland("Green", 50.0, new DecorationType(true, true, true, true), 3, true);
		
		ArrayList<Decoration> avaliableDecorations = new ArrayList<Decoration>();
		avaliableDecorations.add(firstLight);
		avaliableDecorations.add(secondLight);
		avaliableDecorations.add(firstToy);
		avaliableDecorations.add(secondToy);
		avaliableDecorations.add(firstGarland);
		avaliableDecorations.add(secondGarland);
		
		return avaliableDecorations;
	}
}
