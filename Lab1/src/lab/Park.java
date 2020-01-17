package lab;

public class Park {
	private static final int DEFAULT_AREA_IN_METRES_SQUARE = 0;
	private static final int DEFAULT_ENTRENCE_TICKET_PRICE = 15;
	private static final int DEFAULT_BIKE_LANES_LENGTH_IN_METRES = 0;
	private static final int DEFAULT_NUMBER_OF_PONDS = 1;
	private static final int DEFAULT_NUMBER_OF_TREES = 50;
	private static final String DEFAULT_ADRESS = "Unknown";
	private static final String DEFAULT_FULL_NAME = "Unnamed National Park";
	
	private String adress;
	private int bikeLanesLengthInMetres;
	private int entrenceTicketPrice;
	private int areaInMetresSquare;
	private String fullName;
	public static String cityOfLocation;
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

	public Park(String adress, int bikeLanesLengthInMetres, int entrenceTicketPrice, int areaInMetresSquare,
			String fullName, int numberOfTrees, int numberOfPonds) {
		this.adress = adress;
		this.bikeLanesLengthInMetres = bikeLanesLengthInMetres;
		this.entrenceTicketPrice = entrenceTicketPrice;
		this.areaInMetresSquare = areaInMetresSquare;
		this.fullName = fullName;
		this.numberOfTrees = numberOfTrees;
		this.numberOfPonds = numberOfPonds;
	}

	public Park(String adress, int bikeLanesLengthInMetres, int entrenceTicketPrice, int areaInMetresSquare) {
		this(adress, bikeLanesLengthInMetres, entrenceTicketPrice, areaInMetresSquare, DEFAULT_FULL_NAME, DEFAULT_NUMBER_OF_TREES, DEFAULT_NUMBER_OF_PONDS);
	}

	public Park() {
		this(DEFAULT_ADRESS, DEFAULT_BIKE_LANES_LENGTH_IN_METRES, DEFAULT_ENTRENCE_TICKET_PRICE, DEFAULT_AREA_IN_METRES_SQUARE);
	}

	@Override
	public String toString() {
		return "ParkClass [adress=" + adress + ", bikeLanesLengthInMetres=" + bikeLanesLengthInMetres
				+ ", entrenceTicketPrice=" + entrenceTicketPrice + ", areaInMetresSquare=" + areaInMetresSquare
				+ ", fullName=" + fullName + ", numberOfTrees=" + numberOfTrees + ", numberOfPonds=" + numberOfPonds
				+ ", getAdress()=" + getAdress() + ", getBikeLanesLengthInMetres()=" + getBikeLanesLengthInMetres()
				+ ", getEntrenceTicketPrice()=" + getEntrenceTicketPrice() + ", getAreaInMetresSquare()="
				+ getAreaInMetresSquare() + ", getFullName()=" + getFullName() + ", printCityOfLocation()="
				+ printCityOfLocation() + "]";
	}

	public static String printStaticCityOfLocation() {
		return "City of location (static): " + Park.cityOfLocation;
	}

	public String printCityOfLocation() {
		return "City of location: " + Park.cityOfLocation;
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
