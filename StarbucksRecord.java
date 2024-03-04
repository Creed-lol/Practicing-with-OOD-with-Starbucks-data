//Yuvan Singh

public class StarbucksRecord {
    private String storeId;
    private String name;
    private String address;
    private String city;
    private String state;
    private String county;
    private double latitude;
    private double longitude;
    private String ownershipType;

    public StarbucksRecord(String storeId, String name, String address, String city, String state, String county, double latitude, double longitude, String ownershipType) {
        this.storeId = storeId;
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.county = county;
        this.latitude = latitude;
        this.longitude = longitude;
        this.ownershipType = ownershipType;
    }

    // Getter methods for each property
    public String getStoreId() { return storeId; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getCounty() { return county; }
    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
    public String getOwnershipType() { return ownershipType; }
}
