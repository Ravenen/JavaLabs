package lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ChristmasFairManager {
	ArrayList<Decoration> decorations = new ArrayList<Decoration>();

	public ChristmasFairManager(ArrayList<Decoration> decorations) {
		super();
		this.decorations = decorations;
	}

	public ArrayList<Decoration> findDecorationsByType(DecorationType criterion) {
		ArrayList<Decoration> foundDecorations = new ArrayList<Decoration>();
		for (Decoration currentDecoration : decorations) {
			if (currentDecoration.checkCriterion(criterion)) {
				foundDecorations.add(currentDecoration);
			}
		}
		return foundDecorations;
	}

	public ArrayList<Decoration> sortByColor(SortType sortType) {
		return sort(sortType, Decoration.colorComparator);
	}

	public ArrayList<Decoration> sortByPrice(SortType sortType) {
		return sort(sortType, Decoration.priceComparator);
	}

	private ArrayList<Decoration> sort(SortType sortType, Comparator<Decoration> comparator) {
		if (sortType == SortType.ASCENDING) {
			Collections.sort(decorations, comparator);
		} else if (sortType == SortType.DESCENDING) {
			Collections.sort(decorations, Collections.reverseOrder(comparator));
		}
		return decorations;
	}

}
