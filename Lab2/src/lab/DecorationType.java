package lab;

public class DecorationType {
	private boolean indoorTree;
	private boolean outdoorTree;
	private boolean houseInterior;
	private boolean houseExterior;

	public DecorationType(boolean indoorTree, boolean outdoorTree, boolean houseInterior, boolean houseExterior) {
		this.indoorTree = indoorTree;
		this.outdoorTree = outdoorTree;
		this.houseInterior = houseInterior;
		this.houseExterior = houseExterior;
	}

	public boolean checkCriterion(DecorationType criterion) {
		boolean result = true;
		if (criterion.indoorTree && !this.indoorTree) {
			result = false;
		}
		if (criterion.outdoorTree && !this.outdoorTree) {
			result = false;
		}
		if (criterion.houseExterior && !this.houseExterior) {
			result = false;
		}
		if (criterion.houseInterior && !this.houseInterior) {
			result = false;
		}
		return result;
	}

	@Override
	public String toString() {
		return "DecorationType [indoorTree=" + indoorTree + ", outdoorTree=" + outdoorTree + ", houseInterior="
				+ houseInterior + ", houseExterior=" + houseExterior + "]";
	}

}
