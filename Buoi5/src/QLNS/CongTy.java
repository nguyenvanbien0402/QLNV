package QLNS;
import java.awt.*;
import java.util.*;
import java.util.List;

public class CongTy {

   static Scanner phim = new Scanner(System.in);
   static String tenCongty;
   static int maSoThue;
     static  double doanhThu;
    static List<NhanVien> listNhanVien = new ArrayList<>();
    static List<NhanVien> nhanVienThuong = new ArrayList<>();
    static List<GiamDoc> giamDoc = new ArrayList<>();

    // 1:  Show menu method
    public static void showMenu() {

        System.out.println("======Hệ Thống Quản Lý Nhân Sự=====");
        System.out.println("1: Nhập thông tin công ty");
        System.out.println("2: Thêm nhân viên");
        System.out.println("3: Xoa nhân viên");
        System.out.println("4: Xuất thông tin toàn bộ người trong công ty");
        System.out.println("5: Tính và xuất tổng lương cho toàn công ty");
        System.out.println("6: Tìm nhân viên thường có lương cao nhất");
        System.out.println("7: Tìm trưởng phòng có số lượng nhân viên dưới quyền nhiều nhất");
        System.out.println("8: Sắp xếp nhân viên toàn công ty theo Alpha");
        System.out.println("9: Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần ");
        System.out.println("10: Tìm giám đốc có số lượng cổ phần nhiều nhất");
        System.out.println("11: Tính và xuất thu nhập của từng giám đốc");
        System.out.println("12: ====Kết thúc chương trình====");

    }


    // 1: nhập thông tin công ty
    public static void InfoCompany() {
        System.out.println("Nhập thông tin công ty");
        System.out.println("Nhập tên công ty");
        tenCongty = phim.nextLine();
        System.out.println("Nhập mã số thuế");
        maSoThue = phim.nextInt();
        System.out.println("Nhập doanh thu");
        doanhThu = phim.nextDouble();
    }

    // 2: Thêm nhân viên mới
    public  static  void addNhanVien() {
        NhanVien nv = null;

        int choose;
     do {
         Scanner phim = new Scanner(System.in);


         System.out.println("Bạn muốn thêm nhân viên gì ");
         System.out.println("1: Thêm giám đốc");
         System.out.println("2: Thêm nhân viên thường ");
         System.out.println("3: Thêm trưởng phòng");
         System.out.println("4: thoat");
         choose = phim.nextInt();
         switch (choose) {
             case 1: GiamDoc  gd = new GiamDoc();
                 gd.input();
                 listNhanVien.add(gd);
                 giamDoc.add(gd);
                 break;
             case  2:  nv = new NhanVienThuong();
                 nv.input();
                 listNhanVien.add(nv);
                 nhanVienThuong.add(nv);
                 break;
             case 3: nv = new TruongPhong();
                 nv.input();
                 listNhanVien.add(nv);
                 break;
             default: System.out.println("Quay lại");
         }
     } while (choose!=4);

    }


    // 3: Xóa nhân viên theo mã cán bộ
    public static void Delete() {
        Scanner phim = new Scanner(System.in);
        System.out.println("Nhập mã cán bộ cần xóa");
        String dele = phim.nextLine();

      for(int i =0; i<listNhanVien.size(); i++) {
          if(listNhanVien.get(i).getMaSo().equalsIgnoreCase(dele)) {
              listNhanVien.remove(i);
              System.out.println("xoa thanh cong");
          }
      }
    }


    // 4: xuất thông tin toàn bộ người trong công ty
    public static void AllInfo() {
        for (NhanVien nv : listNhanVien
             ) {
            System.out.println("==Toàn bộ nhân viên là == ");
            System.out.println(nv.toString());
        }
    }


    // 5: Tính và xuất tổng lương cho toàn công ty
    public static double TongLuong() {
        double Tongluong = 0;
        for (NhanVien nv: listNhanVien
             ) {
          Tongluong = Tongluong +   nv.TinhLuong();
        }
        return Tongluong;
    }

    // 6: Tìm nhân viên thường có lương cao nhất
    public static void NhanVienLuongCao() {
        double max = nhanVienThuong.get(0).TinhLuong();
        for(int i =1; i<nhanVienThuong.size(); i++) {
            if(nhanVienThuong.get(i).TinhLuong()>max) {
                max = nhanVienThuong.get(i).TinhLuong();
            }
        }
        System.out.println("Nhân viên thường có mức lương cao nhất là :" + max ) ;
    }

    //7: Tìm trưởng phòng có nhân viên dưới quyền nhiều nhất

    // 8: Sắp xếp nhân viên theo thứ tự Alpha

    public static void SapXepAlpha() {
        Collections.sort(listNhanVien, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
        System.out.println("Sau khi đã sắp xếp theo họ và tên");
        for (NhanVien nv: listNhanVien
             ) {
            System.out.println(nv.toString());
        }
    }


    // 9: Sắp xếp luong toàn công ty theo thứ tự giảm dần
    public static void LuongDown () {
        Collections.sort(listNhanVien, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return  (int)(o2.TinhLuong()-o1.TinhLuong());
            }
        });
        for (NhanVien nv: listNhanVien
             ) {
            System.out.println("List sau khi sắp xếp lương giảm dần là :" + nv.toString());
        }
    }


    // 10: Tìm giám đốc có lượng cổ phần nhiều nhất
    public static void CoPhanNhieuNhat() {
        double max = giamDoc.get(0).getCoPhan();
        for (int i = 0; i<giamDoc.size(); i++) {
            if(giamDoc.get(i).getCoPhan()>max) {
                max = giamDoc.get(i).getCoPhan();
            }
        }
        System.out.println("Giám đốc có cổ phần cao nhất là :" + max);
    }


    // 11: Tính và xuất thu nhập cho giám đốc
    public static void ThuNhapGiamDoc() {
        double tl = TongLuong();
        double loiNhuan = doanhThu - tl;
        double thuNhap ;
        for (GiamDoc gd: giamDoc
             ) {
            thuNhap = gd.TinhLuong() +(gd.getCoPhan()*loiNhuan);
            System.out.println("Thu nhập của từng giám đốc :" + gd.getHoTen() + "là: " + thuNhap );
        }

    }






    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int choose;
        do {
            showMenu();
            choose = scan.nextInt();

            switch (choose) {
                case 1: InfoCompany();
                    break;
                case 2: addNhanVien();
                    break;
                case 3: Delete();
                    break;
                case 4 : AllInfo();
                    break;
                case 5: System.out.println("Tong luong cua con ty là :" + TongLuong());
                    break;
                case 6: NhanVienLuongCao();
                    break;
                case 7:
                    break;
                case  8: SapXepAlpha();
                    break;
                case 9 : LuongDown();
                    break;
                case 10: CoPhanNhieuNhat();
                    break;
                case 11: ThuNhapGiamDoc();
                    break;
                default: System.out.println("Thoát chương trình");
            }
        } while (choose!=12);

    }
}
