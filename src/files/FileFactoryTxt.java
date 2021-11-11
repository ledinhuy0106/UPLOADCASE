package files;

import model.Bill;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class FileFactoryTxt {
    public static boolean saveFile2(ArrayList<Bill> listBill, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            for (Bill bill : listBill) {
                String line = bill.toString();
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            osw.close();
            fos.close();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
