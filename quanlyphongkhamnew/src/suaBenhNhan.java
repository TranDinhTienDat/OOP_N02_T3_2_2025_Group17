public ArrayList<BenhNhan> suaBenhNhan(String maBN) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < danhSachBN.size(); i++) {
        if (danhSachBN.get(i).maBN.equals(maBN)) {
            System.out.print("Nhập tên mới: ");
            String tenMoi = sc.nextLine();
            System.out.print("Nhập tuổi mới: ");
            int tuoiMoi = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập giới tính mới: ");
            String gioiTinhMoi = sc.nextLine();

            danhSachBN.get(i).ten = tenMoi;
            danhSachBN.get(i).tuoi = tuoiMoi;
            danhSachBN.get(i).gioiTinh = gioiTinhMoi;
            break;
        }
    }
    return danhSachBN;
}