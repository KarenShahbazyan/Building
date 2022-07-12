package Model;

public class Building {

    private String address;
    private int storey;
    private boolean stone;
    private boolean restaurant;
    private boolean businessCenter;
    private boolean parking;
    private int apartmentsOnTheFloor;

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getStorey() {
        return storey;
    }
    public void setStorey(int storey) {
        this.storey = storey;
    }
    public boolean isStone() {
        return stone;
    }
    public void setStone(boolean stone) {
        this.stone = stone;
    }
    public boolean isRestaurant() {
        return restaurant;
    }
    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }
    public boolean isBusinessCenter() {
        return businessCenter;
    }
    public void setBusinessCenter(boolean businessCenter) {
        this.businessCenter = businessCenter;
    }
    public boolean isParking() {
        return parking;
    }
    public void setParking(boolean parking) {
        this.parking = parking;
    }
    public int getApartmentsOnTheFloor() {
        return apartmentsOnTheFloor;
    }
    public void setApartmentsOnTheFloor(int apartmentsOnTheFloor) {
        this.apartmentsOnTheFloor = apartmentsOnTheFloor;
    }



    public Building(String adress, int storey, boolean stone,
                    boolean restaurant, boolean businessCenter,
                    boolean parking, int apartmentsOnTheFloor) {

        this.address = adress;
        this.storey = storey;
        this.stone = stone;
        this.restaurant = restaurant;
        this.businessCenter = businessCenter;
        this.parking = parking;
        this.apartmentsOnTheFloor = apartmentsOnTheFloor;
    }
}
