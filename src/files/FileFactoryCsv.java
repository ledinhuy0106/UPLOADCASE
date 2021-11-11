package files;
import model.Bill;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class FileFactoryCsv {
    public static boolean saveFileCsvBill(ArrayList<Bill> listBill, String path) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            StringBuilder str = new StringBuilder("Mã HD, Ngày HD,Tên KH,Mã Phòng,Đơn giá");
            for (Bill bill : listBill) {
                str.append("\n");
                str.append(bill.getIdBill()).append(",");
                str.append(sdf.format(bill.getDateBill())).append(",");
                str.append(bill.getNameCustomer()).append(",");
                str.append(bill.getIdRoom()).append(",");
                str.append(bill.getPrice());
            }
            bw.write(str.toString());
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

