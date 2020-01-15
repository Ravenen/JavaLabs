package lab;

public class ParkClass
{
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
    
    public void setAdress(final String adress) {
        this.adress = adress;
    }
    
    public int getBikeLanesLengthInMetres() {
        return this.bikeLanesLengthInMetres;
    }
    
    public void setBikeLanesLengthInMetres(final int bikeLanesLengthInMetres) {
        this.bikeLanesLengthInMetres = bikeLanesLengthInMetres;
    }
    
    public int getEntrenceTicketPrice() {
        return this.entrenceTicketPrice;
    }
    
    public void setEntrenceTicketPrice(final int entrenceTicketPrice) {
        this.entrenceTicketPrice = entrenceTicketPrice;
    }
    
    public int getAreaInMetresSquare() {
        return this.areaInMetresSquare;
    }
    
    public void setAreaInMetresSquare(final int areaInMetresSquare) {
        this.areaInMetresSquare = areaInMetresSquare;
    }
    
    public String getFullName() {
        return this.fullName;
    }
    
    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }
    
    public ParkClass(final String adress, final int bikeLanesLengthInMetres, final int entrenceTicketPrice, final int areaInMetresSquare, final String fullName, final int numberOfTrees, final int numberOfPonds) {
        this.adress = adress;
        this.bikeLanesLengthInMetres = bikeLanesLengthInMetres;
        this.entrenceTicketPrice = entrenceTicketPrice;
        this.areaInMetresSquare = areaInMetresSquare;
        this.fullName = fullName;
        this.numberOfTrees = numberOfTrees;
        this.numberOfPonds = numberOfPonds;
        ++ParkClass.numberOfParks;
    }
    
    public ParkClass(final String adress, final int bikeLanesLengthInMetres, final int entrenceTicketPrice, final int areaInMetresSquare) {
        this(adress, bikeLanesLengthInMetres, entrenceTicketPrice, areaInMetresSquare, "Unnamed", 0, 0);
    }
    
    public ParkClass() {
        this("Unknown", 0, 0, 0, "Unnamed", 0, 0);
    }
    
    @Override
    public String toString() {
        return "ParkClass [adress=" + this.adress + ", bikeLanesLengthInMetres=" + this.bikeLanesLengthInMetres + ", entrenceTicketPrice=" + this.entrenceTicketPrice + ", areaInMetresSquare=" + this.areaInMetresSquare + ", fullName=" + this.fullName + ", numberOfTrees=" + this.numberOfTrees + ", numberOfPonds=" + this.numberOfPonds + ", getAdress()=" + this.getAdress() + ", getBikeLanesLengthInMetres()=" + this.getBikeLanesLengthInMetres() + ", getEntrenceTicketPrice()=" + this.getEntrenceTicketPrice() + ", getAreaInMetresSquare()=" + this.getAreaInMetresSquare() + ", getFullName()=" + this.getFullName() + "]";
    }
    
    public static String printStaticNumberOfParks() {
        return "Number of parks (static): " + ParkClass.numberOfParks;
    }
    
    public String printNumberOfParks() {
        return "Number of parks: " + ParkClass.numberOfParks;
    }
    
    public void resetValues(final String adress, final int bikeLanesLengthInMetres, final int entrenceTicketPrice, final int areaInMetresSquare, final String fullName, final int numberOfTrees, final int numberOfPonds) {
        this.adress = adress;
        this.bikeLanesLengthInMetres = bikeLanesLengthInMetres;
        this.entrenceTicketPrice = entrenceTicketPrice;
        this.areaInMetresSquare = areaInMetresSquare;
        this.fullName = fullName;
        this.numberOfTrees = numberOfTrees;
        this.numberOfPonds = numberOfPonds;
        ++ParkClass.numberOfParks;
    }
}
