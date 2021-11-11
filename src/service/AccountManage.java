package service;

import model.Regex;

import java.io.Serializable;
import java.util.Scanner;

public class AccountManage implements Serializable {
    public static String inputPhoneNumber() {
        Scanner scanner = new Scanner(System.in);
        String clientPhoneNumber;
        boolean invalidPhoneNUmber;
        do {
            System.out.println("Nhập số điện thoại người dùng: ");
            clientPhoneNumber = scanner.nextLine();
            invalidPhoneNUmber = Regex.validate(clientPhoneNumber, Regex.PHONE_NUMBER_REGEX);
            if (invalidPhoneNUmber) System.out.println("Sai định dạng số điện thoại ");
        } while (invalidPhoneNUmber);
        return clientPhoneNumber;
    }

    public static String inputClientAccount() {
        Scanner scanner = new Scanner(System.in);
        String clientAccount;
        boolean invalidAccount;
        do {
            System.out.println("Tên đăng nhập: ");
            clientAccount = scanner.nextLine();
            invalidAccount = Regex.validate(clientAccount, Regex.USER_NAME_REGEX);
            if (invalidAccount) System.out.println("Sai định dạng ");
        } while (invalidAccount);
        return clientAccount;
    }

    public static String inputClientPassword() {
        Scanner scanner = new Scanner(System.in);
        String clientPassword;
        boolean invalidPassword;
        do {
            System.out.println("Mật khẩu");
            clientPassword = scanner.nextLine();
            invalidPassword = Regex.validate(clientPassword, Regex.PASSWORD_REGEX);
            if (invalidPassword) System.out.println("Mật khẩu phải có ít nhất 6 số ,kí tự chữ thường và chữ hoa,và số");
        } while (invalidPassword);
        return clientPassword;
    }

    public static String inputEmail() {
        Scanner scanner = new Scanner(System.in);
        String clientEmail;
        boolean invalidEmail;
        do {
            System.out.println("Email: ");
            clientEmail = scanner.nextLine();
            invalidEmail = Regex.validate(clientEmail, Regex.LICENSE_REGEX);
            if (invalidEmail) System.out.println("Sai định dạng");
        } while (invalidEmail);
        return clientEmail;
    }
}