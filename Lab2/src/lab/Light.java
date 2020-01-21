package lab;

public class Light extends Decoration {
	private double maxVoltage;
	private int numberOfBulbs;

	public Light(String color, double priceInHryvnas, DecorationType type, double maxVoltage, int numberOfBulbs) {
		super(color, priceInHryvnas, type);
		this.maxVoltage = maxVoltage;
		this.numberOfBulbs = numberOfBulbs;
	}

	public double getMaxVoltage() {
		return maxVoltage;
	}

	public void setMaxVoltage(double maxVoltage) {
		this.maxVoltage = maxVoltage;
	}

	public int getNumberOfBulbs() {
		return numberOfBulbs;
	}

	public void setNumberOfBulbs(int numberOfBulbs) {
		this.numberOfBulbs = numberOfBulbs;
	}

	@Override
	public String toString() {
		return "Light [maxVoltage=" + maxVoltage + ", numberOfBulbs=" + numberOfBulbs + ", color=" + color
				+ ", priceInHryvnas=" + priceInHryvnas + ", type=" + type + "]";
	}

}
