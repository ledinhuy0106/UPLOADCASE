package RunMain;

import files.FileRoom;
import menus.Login;

public class RunMain {
    public static void main(String[] args) {
       FileRoom.readAcc();
        Login.logIn();
    }
}