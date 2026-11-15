-- Tạo tài khoản lab1_user và cấp quyền (đã ẩn mật khẩu thật)
USE [master];
GO
IF NOT EXISTS (SELECT 1 FROM sys.sql_logins WHERE name = N'lab1_user')
BEGIN
    CREATE LOGIN [lab1_user]
        WITH PASSWORD = 'Thay_Mat_Khau_Manh_Cua_Ban',
        CHECK_POLICY = ON,
        CHECK_EXPIRATION = OFF;
END;
GO
USE [LAB1_MaHoaCoDien];
GO
IF NOT EXISTS (SELECT 1 FROM sys.database_principals WHERE name = N'lab1_user')
    CREATE USER [lab1_user] FOR LOGIN [lab1_user];
GO
GRANT SELECT, INSERT, DELETE ON OBJECT::dbo.history TO [lab1_user];
GO