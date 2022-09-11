package QLNS;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class GiamDoc  extends  NhanVien{

     double coPhan;


      // contructor
    public GiamDoc(String maSo, String hoTen, int soDienThoai, int ngayLamViec, double luongNgay, double coPhan) {
        super(maSo, hoTen, soDienThoai, ngayLamViec, luongNgay);
        this.coPhan = coPhan;
    }

    public GiamDoc() {
    }

    // get and setter
    public double getCoPhan() {
        return coPhan;
    }

    public void setCoPhan(double coPhan) {
        this.coPhan = coPhan;
    }

    // override Tinhluong()
    @Override
    public double TinhLuong() {
    double luong = luongNgay*ngayLamViec;

    return  luong;
    }

    // override input


    @Override
    public void input() {
        super.input();
        Scanner phim = new Scanner(System.in);
        System.out.println("Nhập cổ phần");
        coPhan = phim.nextDouble();
    }
}
