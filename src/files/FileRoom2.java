package files;

import model.Room;
import service.RoomHanding;

import java.io.*;
import java.util.List;

public class FileRoom2 {
    public static void write(String path, List<Room> list) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        StringBuilder str = new StringBuilder(" Id room , Price, Status, Number bed, Number toilet");
        for (Room room : list) {
            str.append("\n");
            str.append(room.getRoomId()).append(",");
            str.append(room.getPrice()).append(",");
            str.append(room.setStatus(true)).append(",");
            str.append(room.getNumberOfBedroom()).append(",");
            str.append(room.getNumberOfToilet());

        }
        bufferedWriter.write(str.toString());
        bufferedWriter.close();
        fileWriter.close();
    }

    public static List<Room> read(String patch) throws IOException {
        RoomHanding roomHanding = new RoomHanding();
        FileReader fileReader = new FileReader(patch);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            int id = Integer.parseInt(arr[0]);
            int price = Integer.parseInt(arr[1]);
            boolean status = Boolean.getBoolean("uy");
            int bed = Integer.parseInt(arr[3]);
            int toilet = Integer.parseInt(arr[4]);
            roomHanding.add(new Room(id, price, status, bed, toilet));
        }
        roomHanding.printList();
        bufferedReader.close();
        return null;
    }
}