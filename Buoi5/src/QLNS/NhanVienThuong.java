package QLNS;
import java.util.Scanner;
public class NhanVienThuong  extends NhanVien{

    String maTruongPhong;


    // contructor
    public NhanVienThuong(String maSo, String hoTen, int soDienThoai, int ngayLamViec, double luongNgay, String maTruongPhong) {
        super(maSo, hoTen, soDienThoai, ngayLamViec, luongNgay);
        this.maTruongPhong = maTruongPhong;
    }

    public NhanVienThuong() {
    }


    // get and setter
    public String getMaTruongPhong() {
        return maTruongPhong;
    }

    public void setMaTruongPhong(String maTruongPhong) {
        this.maTruongPhong = maTruongPhong;
    }

    // override TinhLuong()
    @Override
    public double TinhLuong() {
    double luong = luongNgay*ngayLamViec;
    return luong;
    }

    @Override
    public void input() {
        super.input();
        Scanner phim = new Scanner(System.in);
        System.out.println("Nhập mã trưởng phòng");
        maTruongPhong = phim.nextLine();
    }
}
