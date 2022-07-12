package Model;

public class Apartment extends Building{

        private int price;
        private int floor;
        private double area;
        private int rooms;
        private boolean sunnySide;
        private boolean repaired;
        private boolean freeOrSold;

        public int getPrice() {
                return price;
        }
        public void setPrice(int price) {
                this.price = price;
        }
        public int getFloor() {
                return floor;
        }
        public void setFloor(int floor) {
                this.floor = floor;
        }
        public double getArea() {
                return area;
        }
        public void setArea(double area) {
                this.area = area;
        }
        public int getRooms() {
                return rooms;
        }
        public void setRooms(int rooms) {
                this.rooms = rooms;
        }
        public boolean isSunnySide() {
                return sunnySide;
        }
        public void setSunnySide(boolean sunnySide) {
                this.sunnySide = sunnySide;
        }
        public boolean isRepaired() {
                return repaired;
        }
        public void setRepaired(boolean repaired) {
                this.repaired = repaired;
        }
        public boolean isFreeOrSold() {
                return freeOrSold;
        }
        public void setFreeOrSold(boolean freeOrSold) {
                this.freeOrSold = freeOrSold;
        }

        public Apartment(String address, int storey, boolean stone, boolean restaurnat,
                         boolean businessCenter, boolean parking,
                         int apartmentsOnTheFloor, int price,
                         int floor, double area, int rooms,
                         boolean sunnySide, boolean repaired,
                         boolean freeOrSold) {

                super(address, storey, stone, restaurnat, businessCenter, parking, apartmentsOnTheFloor);
                this.price = price;
                this.floor = floor;
                this.area = area;
                this.rooms = rooms;
                this.sunnySide = sunnySide;
                this.repaired = repaired;
                this.freeOrSold = freeOrSold;
        }
}
