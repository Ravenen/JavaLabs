package lab;

public class ParkClass {
	private String adress;
	private int bikeLanesLengthInMetres;
	private int entrenceTicketPrice;
	private int areaInMetresSquare;
	private String fullName;
	public static int numberOfParks;
	protected int numberOfTrees;
	protected int numberOfPonds;

	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getBikeLanesLengthInMetres() {
		return this.bikeLanesLengthInMetres;
	}

	public void setBikeLanesLengthInMetres(int bikeLanesLengthInMetres) {
		this.bikeLanesLengthInMetres = bikeLanesLengthInMetres;
	}

	public int getEntrenceTicketPrice() {
		return this.entrenceTicketPrice;
	}

	public void setEntrenceTicketPrice(int entrenceTicketPrice) {
		this.entrenceTicketPrice = entrenceTicketPrice;
	}

	public int getAreaInMetresSquare() {
		return this.areaInMetresSquare;
	}

	public void setAreaInMetresSquare(int areaInMetresSquare) {
		this.areaInMetresSquare = areaInMetresSquare;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public ParkClass(String adress, int bikeLanesLengthInMetres, int entrenceTicketPrice, int areaInMetresSquare,
			String fullName, int numberOfTrees, int numberOfPonds) {
		this.adress = adress;
		this.bikeLanesLengthInMetres = bikeLanesLengthInMetres;
		this.entrenceTicketPrice = entrenceTicketPrice;
		this.areaInMetresSquare = areaInMetresSquare;
		this.fullName = fullName;
		this.numberOfTrees = numberOfTrees;
		this.numberOfPonds = numberOfPonds;
		ParkClass.numberOfParks++;
	}

	public ParkClass(String adress, int bikeLanesLengthInMetres, int entrenceTicketPrice, int areaInMetresSquare) {
		this(adress, bikeLanesLengthInMetres, entrenceTicketPrice, areaInMetresSquare, "Unnamed", 0, 0);
	}

	public ParkClass() {
		this("Unknown", 0, 0, 0, "Unnamed", 0, 0);
	}

	@Override
	public String toString() {
		return "ParkClass [adress=" + adress + ", bikeLanesLengthInMetres=" + bikeLanesLengthInMetres
				+ ", entrenceTicketPrice=" + entrenceTicketPrice + ", areaInMetresSquare=" + areaInMetresSquare
				+ ", fullName=" + fullName + ", numberOfTrees=" + numberOfTrees + ", numberOfPonds=" + numberOfPonds
				+ ", getAdress()=" + getAdress() + ", getBikeLanesLengthInMetres()=" + getBikeLanesLengthInMetres()
				+ ", getEntrenceTicketPrice()=" + getEntrenceTicketPrice() + ", getAreaInMetresSquare()="
				+ getAreaInMetresSquare() + ", getFullName()=" + getFullName() + ", printNumberOfParks()="
				+ printNumberOfParks() + "]";
	}

	public static String printStaticNumberOfParks() {
		return "Number of parks (static): " + ParkClass.numberOfParks;
	}

	public String printNumberOfParks() {
		return "Number of parks: " + ParkClass.numberOfParks;
	}

	public void resetValues(String adress, int bikeLanesLengthInMetres, int entrenceTicketPrice, int areaInMetresSquare,
			String fullName, int numberOfTrees, int numberOfPonds) {
		this.adress = adress;
		this.bikeLanesLengthInMetres = bikeLanesLengthInMetres;
		this.entrenceTicketPrice = entrenceTicketPrice;
		this.areaInMetresSquare = areaInMetresSquare;
		this.fullName = fullName;
		this.numberOfTrees = numberOfTrees;
		this.numberOfPonds = numberOfPonds;
	}
}
