public class Room {
     int roomNo;
     String roomType;
     double roomArea;
     boolean acMachine;

   

    public void setData(int roomNo, String roomType, double roomArea, boolean acMachine) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.acMachine = acMachine;
    }

    public void displayData() {
        System.out.println("Room Number: " + roomNo);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Area: " + roomArea + " square meters");
        System.out.println("AC Machine Installed: " + (acMachine ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Room room = new Room();

        room.setData(101, "Standard", 25.5, true);

        room.displayData();
    }
}
