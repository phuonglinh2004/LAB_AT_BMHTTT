# LAB 1: Bắt gói tin Telnet - SSH

- Họ và tên: Trần Ngọc Phương Linh
- Mã số sinh viên: 1150080103
- Lớp:** 11_ĐH_CNPM2
- Link Video Thực Hành: https://www.youtube.com/@phuonglinhtranngoc8293

## Nội dung đã thực hiện
- Thiết lập mô hình mạng giả lập gồm máy Server, Client và Attacker.
- Thực hiện kết nối Telnet từ Client đến Server và dùng Wireshark bắt gói tin để quan sát dữ liệu dạng rõ (Plaintext).
- Thực hiện kết nối SSH từ Client đến Server và dùng Wireshark xác minh dữ liệu đã được mã hóa an toàn.
- Trả lời 11 câu hỏi phân tích thực nghiệm và lý thuyết trong file báo cáo Word.

## Kết quả thực hiện
- Bắt và khôi phục thành công Username/Password phiên Telnet qua tính năng TCP Stream của Wireshark.
- Xác nhận các gói tin SSH chỉ hiển thị dữ liệu đã mã hóa (Encrypted Payload).
- Hoàn thành file báo cáo `.docx` kèm đầy đủ hình ảnh thực nghiệm và link video Youtube.

## Các lưu ý 
- File báo cáo đầy đủ nằm trong thư mục LAB1 với tên: Lab1_11CNPM2_1150080103_TranNgocPhuongLinh.docx.
- Mô hình Lab sử dụng các IP: Server (`10.0.0.1`), Client (`10.0.0.2`), Attacker (`10.0.0.3`).
- Phiên Telnet được lọc theo bộ lọc tcp.port == 23 và SSH theo tcp.port == 22 trên Wireshark.
