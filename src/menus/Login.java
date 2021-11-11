package menus;

import files.FileRoom;

import java.util.Scanner;

public class Login {
    public static void logIn() {
        FileRoom.readAcc();
        int choice;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("1. Đăng nhập");
                System.out.println("2. Đăng kí");
                System.out.println("0. Thoát");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> MainAccount.account();
                    case 2 -> {
                        System.out.println("1. Ấn phím 1 để đăng kí");
                        System.out.println("2. Bạn đã có tài khoản ? ấn phím 2 để Đăng nhập ");
                        int choice2;
                        while (true) {
                            choice2 = scanner.nextInt();
                            switch (choice2) {
                                case 1 -> {
                                    MainAccount.creat();
                                    System.out.println("Đăng kí thành công");
                                    FileRoom.writeAcc();
                                    FileRoom.readAcc();
                                    MainManagement.showMenu();
                                }
                                case 2 -> MainAccount.account();

                                default -> System.out.println("Nhập sai lựa chọn");
                            }
                        }

                    }
                    case 0 -> {
                        System.out.println("kết thúc ");
                        System.exit(0);
                    }
                    default -> System.out.println("Tùy chọn không hợp lệ");
                }
            } catch (Exception e) {
                System.err.println("Vui lòng chọn 1 hoặc 2 ");
                System.out.println("Sai đầu vào");
            }
        }
    }
}

