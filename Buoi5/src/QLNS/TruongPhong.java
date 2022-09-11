package QLNS;
import java.util.Scanner;
public class TruongPhong  extends  NhanVien{

    int soNhanVienDuoiQuyen;


    // contructor
    public TruongPhong(String maSo, String hoTen, int soDienThoai, int ngayLamViec, double luongNgay, int soNhanVienDuoiQuyen) {
        super(maSo, hoTen, soDienThoai, ngayLamViec, luongNgay);
        this.soNhanVienDuoiQuyen = soNhanVienDuoiQuyen;
    }

    public TruongPhong() {
    }

    // get and setter
    public int getSoNhanVienDuoiQuyen() {
        return soNhanVienDuoiQuyen;
    }

    public void setSoNhanVienDuoiQuyen(int soNhanVienDuoiQuyen) {
        this.soNhanVienDuoiQuyen = soNhanVienDuoiQuyen;
    }

    // override TinhLuong()
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
        System.out.println("Nhập số nhân viên dưới quyền");
        soNhanVienDuoiQuyen = phim.nextInt();
    }
}
