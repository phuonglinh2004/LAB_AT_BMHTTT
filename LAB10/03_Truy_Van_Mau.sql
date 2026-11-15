USE [LAB1_MaHoaCoDien];
GO

-- Kiểm tra tổng số bản ghi hiện có
SELECT DB_NAME() AS ten_co_so_du_lieu, COUNT(*) AS so_ban_ghi FROM dbo.history;
GO

-- Xem toàn bộ lịch sử mã hóa/giải mã mới nhất
SELECT * FROM dbo.history ORDER BY id DESC;
GO

-- Thống kê số lần thực hiện theo từng thuật toán và thao tác
SELECT algorithm, operation, COUNT(*) AS so_lan
FROM dbo.history
GROUP BY algorithm, operation
ORDER BY algorithm, operation;
GO