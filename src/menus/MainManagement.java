package menus;

import java.util.Scanner;

public class MainManagement {
    public static void showMenu() {
        int choice;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("1. Quản lí quản trị ");
                System.out.println("2. Quản lí phòng ");
                System.out.println("3. Hóa Đơn ");
                System.out.println("4. Quay lại trang đăng nhập ");
                System.out.println("0.Kết thúc ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> MainAccount.accountMenu();
                    case 2 -> MainRoom.mainRoom();
                    case 3 -> {
                        BillHanding billHanding = new BillHanding();
                        billHanding.menu();
                    }
                    case 4-> Login.logIn();
                    case 0 -> {
                        System.out.println("Kết thúc");
                        System.exit(0);
                    }
                    default -> System.out.println("Tùy chọn không hợp lệ");
                }
            } catch (Exception e) {
                System.out.println("Sai đầu vào");
            }
        }
    }
}