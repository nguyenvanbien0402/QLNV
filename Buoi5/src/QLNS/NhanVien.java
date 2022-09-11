package QLNS;

import java.util.Scanner;

public class NhanVien {

    String maSo;
    String hoTen;
    int soDienThoai;
    int ngayLamViec;
    double luongNgay;

    public double TinhLuong() {
        return 0;}
    public void input() {
        Scanner phim = new Scanner(System.in);
        System.out.println("Nhập mã số ");
        maSo = phim.nextLine();
        System.out.println("Nhập họ và tên ");
        hoTen = phim.nextLine();
        System.out.println("Nhập số điện thoại");
        soDienThoai = phim.nextInt();
        System.out.println("Nhập ngày làm việc");
        ngayLamViec = phim.nextInt();
        System.out.println("Nhập luong ngày");
        luongNgay = phim.nextDouble();
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maSo='" + maSo + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", soDienThoai=" + soDienThoai +
                ", ngayLamViec=" + ngayLamViec +
                ", luongNgay=" + luongNgay +
                '}';
    }

    public NhanVien(String maSo, String hoTen, int soDienThoai, int ngayLamViec, double luongNgay) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.ngayLamViec = ngayLamViec;
        this.luongNgay = luongNgay;
    }

    public NhanVien() {
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getNgayLamViec() {
        return ngayLamViec;
    }

    public void setNgayLamViec(int ngayLamViec) {
        this.ngayLamViec = ngayLamViec;
    }

    public double getLuongNgay() {
        return luongNgay;
    }

    public void setLuongNgay(double luongNgay) {
        this.luongNgay = luongNgay;
    }
}
