package lab;

import java.util.Comparator;

public class Decoration {

	protected String color;
	protected double priceInHryvnas;
	protected DecorationType type;

	public Decoration(String color, double priceInHryvnas, DecorationType type) {
		super();
		this.color = color;
		this.priceInHryvnas = priceInHryvnas;
		this.type = type;
	}

	public boolean checkCriterion(DecorationType criterion) {
		return type.checkCriterion(criterion);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPriceInHryvnas() {
		return priceInHryvnas;
	}

	public void setPriceInHryvnas(double priceInHryvnas) {
		this.priceInHryvnas = priceInHryvnas;
	}

	public DecorationType getType() {
		return type;
	}

	public void setType(DecorationType type) {
		this.type = type;
	}

	public static Comparator<Decoration> priceComparator = new Comparator<Decoration>() {
		@Override
		public int compare(Decoration firstDecoration, Decoration secondDecoration) {
			return (secondDecoration.getPriceInHryvnas() < firstDecoration.getPriceInHryvnas() ? -1
					: (secondDecoration.getPriceInHryvnas() == firstDecoration.getPriceInHryvnas() ? 0 : 1));
		}
	};
	public static Comparator<Decoration> colorComparator = new Comparator<Decoration>() {
		@Override
		public int compare(Decoration firstDecoration, Decoration secondDecoration) {
			return (int) (firstDecoration.getColor().compareTo(secondDecoration.getColor()));
		}
	};

}
