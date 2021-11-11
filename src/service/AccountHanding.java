package service;

import model.Account;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountHanding implements interFace<Account>, Serializable {
    private static final AccountHanding instance= new AccountHanding();

    private AccountHanding() {
        accountList = new ArrayList<>();
    }

    public static AccountHanding getInstance(){
        return instance;
    }
    private List<Account> accountList = new ArrayList<>();
    public AccountHanding(List<Account> accountList) {
        this.accountList = accountList;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    @Override
    public void add(Account account) {
        accountList.add(account);
    }

    @Override
    public void edit(int id, Account account) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public int findIndexById(int id) {
        return 0;
    }

    public int findUserAndPass2(String user, String pass) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getUseName().equals(user) && accountList.get(i).getPassWord().equals(pass)) {

                return i;
            }
        }
        return -1;
    }

    public String findPass(String pass) {
        for (Account account : accountList) {
            if (account.getPassWord().equals(pass)) {
                return account.getPassWord();
            }
        }
        return null;
    }

    public String findUser(String user) {
        for (Account account : accountList) {
            if (account.getName().equals(user)) {
                return account.getUseName();
            }
        }
        return null;
    }

    public boolean findUserAndPass(String user, String pass) {
        for (Account account : accountList) {
            if (account.getUseName().equals(user) && account.getPassWord().equals(pass)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printList() {
        for (Account account : accountList) {
            System.out.println(account);

        }
    }

    public static Account creat() {
        Scanner scanner = new Scanner(System.in);
        String useName = AccountManage.inputClientAccount();
        String pass = AccountManage.inputClientPassword();
        System.out.print("Enter client name: ");
        String name = scanner.nextLine();
        String email = AccountManage.inputEmail();
        System.out.print("Enter client age: ");
        int age = scanner.nextInt();
        String phone = AccountManage.inputPhoneNumber();
        return new Account(useName, pass, name, age, phone, email);
    }
}
