# LAB 3: MẬT MÃ KHÓA CÔNG KHAI & CHỮ KÝ SỐ (JAVA SWING + SQL SERVER)

* **Học phần:** An toàn và Bảo mật thông tin
* **Sinh viên thực hiện:** Trần Ngọc Phương Linh
* **MSSV:** 1150080103
* **Lớp:** 11_ĐH_CNPM2
* **Ngày thực hành:** 23/11/2026

---

## 1. Giới thiệu bài thực hành
Dự án xây dựng ứng dụng Java Swing minh họa các thuật toán mật mã bất đối xứng, hệ mã lai, chữ ký số sử dụng thư viện chuẩn của Java (`java.security`, `javax.crypto`) kết hợp lưu trữ nhật ký thao tác vào Microsoft SQL Server:

* **Bài 3.1 (`RSADemo.java`):** Mật mã RSA (đệm OAEP với SHA-256) chạy trên console, khảo sát tốc độ sinh khóa và kích thước dữ liệu với khóa 2048-bit và 3072-bit.
* **Bài 3.2 (`frm_RSA.java`):** Giao diện Swing thực hiện sinh khóa, mã hóa và giải mã RSA.
* **Bài 3.3 (`frm_ECC.java`):** Mật mã đường cong Elliptic (ECC - đường cong `secp256r1`) theo sơ đồ ECIES (ECDH + HKDF-SHA256 + AES-256-GCM), hỗ trợ xuất/nhập tệp khóa.
* **Bài 3.4 (`frm_RSA_AES.java`):** Hệ mã lai kết hợp RSA-2048 và AES-256-GCM để mã hóa văn bản dài không giới hạn kích thước và phát hiện chỉnh sửa toàn vẹn bản mã.
* **Bài 3.5 (`frm_ECC_Signature.java`):** Chữ ký số ECDSA (`SHA256withECDSA`), mô phỏng quy trình ký bằng khóa riêng và xác minh bằng khóa công khai.
* **Tích hợp SQL Server (`frm_KetNoiSQL.java`, `frm_LichSu.java`):** Kết nối JDBC tới CSDL `LAB3_MaHoaKhoaCongKhai` để ghi nhận và tra cứu lịch sử các thao tác mã hóa, giải mã, ký và xác minh.

---

## 2. Yêu cầu môi trường & Cài đặt
* **JDK:** Java 17 trở lên
* **IDE:** Apache NetBeans IDE (dự án cấu trúc Maven)
* **Cơ sở dữ liệu:** Microsoft SQL Server Express (bật TCP/IP cổng `14333`, chế độ xác thực Mixed Mode)
* **Thư viện:** `com.microsoft.sqlserver:mssql-jdbc:12.8.1.jre11` (đã khai báo trong `pom.xml`)

### Thiết lập Cơ sở dữ liệu
1. Mở SQL Server Management Studio (SSMS) và chạy script `01_Tao_CSDL.sql` để tạo database `LAB3_MaHoaKhoaCongKhai` cùng bảng `dbo.History`.
2. Chạy script `02_Tao_TaiKhoan_LAB.sql` để tạo tài khoản `lab3_user` (chỉ cấp quyền `SELECT`, `INSERT` trên `dbo.History`).

---

## 3. Hướng dẫn chạy chương trình
1. Mở project `LAB3_MaHoaKhoaCongKhai` trong NetBeans, chọn **Clean and Build (`Shift + F11`)** để tải dependency.
2. **Chạy bài 3.1 (Console):** Nhấp phải vào `week_03/RSADemo.java` → **Run File (`Shift + F6`)**.
3. **Chạy toàn bộ ứng dụng (GUI):** Bấm **Run Project (`F6`)** để mở cửa sổ chính `frm_Menu`:
   * Bấm **Kết nối SQL Server**, nhập thông tin kết nối (`127.0.0.1`, port `14333`, user `lab3_user`) và bấm **Test Connection** trước khi thao tác các bài khác để hệ thống tự động lưu lịch sử.
   * Chọn các nút **3.2 – 3.5** để kiểm thử từng thuật toán, sau đó bấm **Xem lịch sử** để kiểm tra kết quả lưu trong database.

---

## 4. Lưu ý bảo mật
* Mật khẩu kết nối SQL Server chỉ nhập trực tiếp trên giao diện khi chạy chương trình (`char[]` lưu tạm trên RAM), không lưu cứng (hard-code) trong mã nguồn.
* Không lưu trữ hay đính kèm khóa riêng (`PRIVATE`) thật trong hồ sơ nộp bài.
