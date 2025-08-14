## OOP_N02_Group 17 

🏥 HỆ THỐNG QUẢN LÝ BỆNH VIỆN & GIAO DỊCH

Quản lý thông tin Bệnh nhân, Cơ sở y tế và Giao dịch thanh toán một cách đơn giản, rõ ràng và dễ mở rộng.

📌 1. Mục tiêu dự án

Dự án này mô phỏng một hệ thống nhỏ để:

Lưu trữ thông tin bệnh nhân.

Quản lý danh sách bệnh nhân trong bệnh viện/phòng khám.

Theo dõi và quản lý giao dịch thanh toán.

🧍‍♂️ 2. Bệnh nhân (Patient)

Thuộc tính	

🆔 ma	String	Mã định danh bệnh nhân (duy nhất)

📝 ten	String	Họ và tên bệnh nhân

🎂 tuoi	Integer	Tuổi

⚧ gioi_tinh	String	Giới tính (Nam / Nữ / Khác)

🏥 3. Phòng khám / Bệnh viện (Hospital / Clinic)

Thuộc tính	

🏷 ten_co_so	String	Tên bệnh viện hoặc phòng khám

📋 danh_sach_benh_nhan	List<Patient>	

Danh sách bệnh nhân đang được quản lý

Chức năng chính:

➕ Thêm bệnh nhân

❌ Xóa bệnh nhân theo mã

🔍 Tìm kiếm bệnh nhân

Hình Ảnh Sơ Đồ Thuật Toán của Phòng Khám 

 <img src='anh/PhongKham (1).jpg'>

💰 4. Giao dịch (Billing)

Thuộc tính	

🆔 ma_giao_dich	String	Mã định danh giao dịch

🔗 ma_benh_nhan	String	Liên kết đến Patient.ma

💵 so_tien	Float	Số tiền giao dịch

📅 ngay_giao_dich	Date	Ngày thanh toán

Chức năng chính:

➕ Tạo giao dịch mới

📊 Tính tổng số tiền theo bệnh nhân

🧾 Xuất hóa đơn

Thành Viên 

| STT | Họ và Tên              | MSSV     | GitHub ID                                             |
| --- | ---------------------- | -------- | ----------------------------------------------------- |
| 1   | **Trần Đình Tiến Đạt** | 24100257 | [TranDinhTienDat](https://github.com/TranDinhTienDat) |
| 2   | **Cao Tiến Duy**       | 24100487 | [duyneme](https://github.com/duyneme)                 |
| 3   | **Nguyễn Văn Hào**     | 24100450 | [haonguyen06](https://github.com/haonguyen06)         |

  
Link Public : 

Link codespaces : 

Link Demo Team : 
