package menus;

import model.Room;

import files.FileRoom2;

import service.RoomHanding;


import java.io.IOException;
import java.util.Scanner;

public class MainRoom {
    public static void mainRoom() throws IOException {
        RoomHanding roomHanding = new RoomHanding();
        roomHanding.add(new Room(1, 100, true, 1, 1));
        int choice = -1;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("1. in danh sách phòng ");
                System.out.println("2. Thêm phòng ");
                System.out.println("3. CHỉnh thông tin phòng ");
                System.out.println("4. Ktra phòng ");
                System.out.println("5. Find the room by ID. ");
                System.out.println("6. Tìm phòng theo giá ");
                System.out.println("7. Viết");
                System.out.println("8. in ");
                System.out.println("9. Xóa phòng theo id ");
                System.out.println("10. Quay lại menu ");
                System.out.println("0. Kết thúc ");
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Sai đâuf vào");
            }
            switch (choice) {
                case 1 -> roomHanding.printList();
                case 2 -> {
                    roomHanding.add(RoomHanding.creat());
                    System.out.println("Hoàn thành");
                }
                case 3 -> {
                    System.out.println("Nhập id muốn sửa");
                    int edit = scanner.nextInt();
                    roomHanding.edit(edit, RoomHanding.creat());
                }
                case 4 -> {
                    System.out.println("Status = 1: Clear room. ");
                    System.out.println("Status = 2: Phòng trống ");
                    System.out.println("Status = 3: Đang sửa ");
                    int status = scanner.nextInt();
                    roomHanding.checkRoomByStatus(status);
                }
                case 5 -> {
                    System.out.println("Nhập id");
                    int find = scanner.nextInt();
                    roomHanding.findRoomById2(find);
                }
                case 6 -> {
                    System.out.println("Enter price to find: ");
                    int price = scanner.nextInt();
                    roomHanding.findRoomByPrice3(price);
                }
                case 7 -> {
                    FileRoom2.write("fileRoom.csv", roomHanding.getRoomList());
                    System.out.println("Hoàn thành");
                }
                case 8 -> {
                    FileRoom2.read("fileRoom.csv");
                    System.out.println("Hoàn thành");
                }
                case 9 -> {
                    System.out.println("Nhập id muốn xóa");
                    int deleteId = scanner.nextInt();
                    roomHanding.delete(deleteId);
                }
                case 10 -> MainManagement.showMenu();
                case 0 -> {
                    System.out.println("Kết thúc");
                    System.exit(0);
                }
                default -> System.out.println("Lựa không hợp lệ ");
            }
        }
    }
}
