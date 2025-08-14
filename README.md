## OOP_N02_Group 17 

Ứng Dụng Quản Lí Bệnh Viện 

1. Mục tiêu

Dự án này mô phỏng hệ thống quản lý thông tin bệnh nhân, phòng khám/bệnh viện và giao dịch thanh toán. Hệ thống gồm ba thành phần chính:

Bệnh nhân (Patient): Lưu trữ thông tin cá nhân.

Phòng khám / Bệnh viện (Hospital / Clinic): Quản lý danh sách bệnh nhân.

Giao dịch (Billing): Liên kết giao dịch thanh toán với bệnh nhân.

2. Cấu trúc đối tượng
Bệnh nhân (Patient)
Thuộc tính	Kiểu dữ liệu	Mô tả
ma	String	Mã định danh bệnh nhân (duy nhất)
ten	String	Họ và tên bệnh nhân
tuoi	Integer	Tuổi bệnh nhân
gioi_tinh	String	Giới tính (Nam, Nữ, Khác)
Phòng khám / Bệnh viện (Hospital / Clinic)
Thuộc tính	Kiểu dữ liệu	Mô tả
ten_co_so	String	Tên bệnh viện hoặc phòng khám
danh_sach_benh_nhan	List<Patient>	Danh sách bệnh nhân đang được quản lý

Chức năng chính:

Thêm bệnh nhân mới

Xóa bệnh nhân theo mã

Tìm kiếm bệnh nhân

Giao dịch (Billing)
Thuộc tính	Kiểu dữ liệu	Mô tả
ma_giao_dich	String	Mã định danh giao dịch
ma_benh_nhan	String	Liên kết đến Patient.ma
so_tien	Float	Số tiền giao dịch
ngay_giao_dich	Date	Ngày thực hiện thanh toán

Chức năng chính:

Tạo giao dịch mới cho bệnh nhân

Tính tổng số tiền giao dịch theo bệnh nhân

Xuất hóa đơn

   <img src='anh/PhongKham (1).jpg'>
