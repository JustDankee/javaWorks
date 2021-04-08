import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel marriott = new Hotel(new Room[]
                {
                        new Room(2,true,true,false,false,11),
                        new Room(2,true,true,false,false,12),
                        new Room(3,true,true,true,false,13),
                        new Room(3,true,true,true,true,21),
                        new Room(4, true,true,false,false,22),
                        new Room(2,false,false,false,false,23),
                        new Room(2, false,true,false,false,31),
                        new Room(1, false, true,true,true,32),
                        new Room(1,true,true,true,true,33)
                });
        while(true){
            System.out.println("Введите команду");
            String command = scanner.nextLine();
            if(command.equals("eat")){
                marriott.getRoomsWithEat();

            }else if(command.equals("freeRooms")){
                marriott.getFreeRooms();

            }else if(command.equals("wifi")){
                marriott.getRoomsWithWifi();

            }else if(command.equals("UsedRooms")){
                marriott.getUsedRooms();

            }else if(command.equals("toilet")) {
            marriott.getRoomsWithToilet();

            }else if(command.equals("shower")) {
                marriott.getRoomsWithShower();
            }
        }
    }
}

public class Hotel {
    Room[] freeRooms;
    int[] usedRooms;
    Hotel(Room[] rooms){
        this.freeRooms =  rooms;
        this.usedRooms = new int[rooms.length];
    }
    void getFreeRooms(){
        Room[] rooms = this.freeRooms;
        System.out.println("--Список свободных комнат--");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].roomNumber==0) {
                continue;
            }
            System.out.println("Комната №"+rooms[i].roomNumber);
        }
        System.out.println("--Конец списка--");
    }
    void getUsedRooms(){
        int[] rooms = this.usedRooms;
        System.out.println("--Список занятых комнат--");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i]==0) {
                continue;
            }
            System.out.println("Комната №"+rooms[i]);
        }
        System.out.println("--Конец списка--");
    }
    void reservedRoom(int needRoom){
        Room[] freeRooms = this.freeRooms; //3
        for (int i = 0; i < freeRooms.length; i++) {
            if(needRoom == freeRooms[i].roomNumber){
                freeRooms[i].roomNumber = 0;
                this.usedRooms[i] = needRoom;
                System.out.println("Комната номер "+needRoom+" свободна");
                break;
            }else if(i+1==freeRooms.length){
                System.out.println("Такой комныты не найдено");
            }
        }
    }
    void getRoomsWithEat(){
        Room[] rooms = this.freeRooms;
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i].eat && rooms[i].roomNumber!=0){
                System.out.println("Комната с едой "+rooms[i].roomNumber);
            }
        }
    }
    void getRoomsWithWifi(){
        Room[] rooms = this.freeRooms;
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i].wifi && rooms[i].roomNumber!=0){
                System.out.println("Комната с вайфаем "+rooms[i].roomNumber);
            }
        }
    }
    void getRoomsWithToilet(){
        Room[] rooms = this.freeRooms;
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i].toilet && rooms[i].roomNumber!=0){
                System.out.println("Комната с туалетом "+rooms[i].roomNumber);
            }
        }
    }
    void getRoomsWithShower(){
        Room[] rooms = this.freeRooms;
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i].shower && rooms[i].roomNumber!=0){
                System.out.println("Комната с душем "+rooms[i].roomNumber);
            }
        }
    }
}

public class Room {
    int place;
    boolean shower;
    boolean toilet;
    boolean wifi;
    boolean eat;
    int roomNumber;

    public Room(int place, boolean shower, boolean toilet, boolean wifi, boolean eat, int roomNumber) {
        this.place = place;
        this.shower = shower;
        this.toilet = toilet;
        this.wifi = wifi;
        this.eat = eat;
        this.roomNumber = roomNumber;
    }
}
