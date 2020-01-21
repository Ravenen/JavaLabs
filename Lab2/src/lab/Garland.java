package lab;

public class Garland extends Decoration {
	private double lengthInMetres;
	private boolean isNatural;

	public Garland(String color, double priceInHryvnas, DecorationType type, double lengthInMetres, boolean isNatural) {
		super(color, priceInHryvnas, type);
		this.lengthInMetres = lengthInMetres;
		this.isNatural = isNatural;
	}

	public double getLengthInMetres() {
		return lengthInMetres;
	}

	public void setLengthInMetres(double lengthInMetres) {
		this.lengthInMetres = lengthInMetres;
	}

	public boolean isNatural() {
		return isNatural;
	}

	public void setNatural(boolean isNatural) {
		this.isNatural = isNatural;
	}

	@Override
	public String toString() {
		return "Garland [lengthInMetres=" + lengthInMetres + ", isNatural=" + isNatural + ", color=" + color
				+ ", priceInHryvnas=" + priceInHryvnas + ", type=" + type + "]";
	}

}
