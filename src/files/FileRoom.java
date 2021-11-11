package files;

import model.Account;
import model.Room;
import service.AccountHanding;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileRoom {
    public static void fireWrite(String patch, List<Room> roomList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(patch);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(roomList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException ignored) {
        }
    }

    public static List<Room> readData(String patch) {
        List<Room> roomList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(patch);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            roomList = (List<Room>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        for (Room room : roomList) {
            System.out.println(room);
        }
        return null;
    }

    public static  List<Account> readAcc() {
        List<Account> accountList = new ArrayList<>();
        try {
            AccountHanding accountHanding=AccountHanding.getInstance();
            FileInputStream fileInputStream = new FileInputStream("account.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            accountList = (List) objectInputStream.readObject();
            accountHanding.setAccountList(accountList);
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return accountList;
    }
    public static void writeAcc (){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("account.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(AccountHanding.getInstance().getAccountList());
            objectOutputStream.close();
        } catch (IOException ignored) {
        }
    }
}

