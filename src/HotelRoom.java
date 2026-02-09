// CONSTRUCTOR CHAINING USING this().

public class HotelRoom {
    String roomType;
    double roomRate;
    int roomNumber;
    public HotelRoom(String roomType) {
        this(roomType, 100.0, 0);
    }
    public HotelRoom(String roomType, double roomRate) {
        this(roomType, roomRate, 0);
    }
    public HotelRoom (String roomType, double roomRate, int roomNumber) {
        this.roomType = roomType;
        this.roomRate = roomRate;
        this.roomNumber = roomNumber;
    }
    public void roomDetails() {
        System.out.println("Room Type: " +roomType);
        System.out.println("Room Rate: $" +roomRate);
        System.out.println("Room Number: " +roomNumber);
    }
}
