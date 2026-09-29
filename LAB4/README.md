# LAB 4: Network Reconnaissance with Nmap

## 1. Thông tin sinh viên & Bài nộp
* **Họ và tên:** Trần Ngọc Phương Linh
* **Mã số sinh viên (MSSV):** 1150080103
* **Lớp:** 11CNPM2
* **Link Repository GitHub:** *(Nộp trực tiếp trên hệ thống)*
* **Link Video Demo:** https://youtu.be/mRO4CJmJt08

---

## 2. Phiên bản môi trường thực hành
* **Host OS:** Windows 11 (Host)
* **Phần mềm ảo hóa:** VMware Workstation Pro 17.5.x
* **Attacker Machine:** Kali Linux (Nmap v7.99)
* **Target Machine:** Metasploitable 2 (Linux 2.6.24-16-server)
* **Chế độ mạng:** Host-Only (Mạng nội bộ cách ly)

---

## 3. Quy trình dựng môi trường thực hành (Environment Setup)
1. **Chuẩn bị file:** Tải file nén `metasploitable-linux-2.0.0.zip` và giải nén ra thư mục máy tính.
2. **Import máy ảo:** Mở VMware Workstation Pro, chọn `File` -> `Open...` và trỏ tới file `Metasploitable.vmx` trong thư mục đã giải nén. Bật máy ảo và chọn `I Copied It`.
3. **Cấu hình Card mạng:**
   * Chuyển Card mạng của máy **Kali Linux** sang chế độ **Host-Only**.
   * Chuyển Card mạng của máy **Metasploitable 2** sang chế độ **Host-Only** để đảm bảo 2 máy ảo kết nối trong cùng dải mạng nội bộ an toàn.
4. **Cài đặt công cụ:** Chuyển tạm Kali sang mạng NAT để cài đặt gói `net-tools` và `nmap`, sau đó chuyển lại Host-Only.
5. **Đăng nhập & Kiểm tra kết nối:**
   * Đăng nhập Metasploitable 2 với tài khoản `msfadmin` / `msfadmin`.
   * Sử dụng lệnh `ifconfig` kiểm tra địa chỉ IP trên cả 2 máy và thực hiện lệnh `ping` để xác nhận thông mạng.


