# Nhóm 1 - Đề 27 - Quản lý xuất nhập cảnh

## Link github: https://github.com/HTT5104/oop_n14_qlxnc

## Lưu ý trước khi sử dụng hệ thống
### Trước khi đăng nhập, bấm vào Staff path rồi chọn file CSV lưu trữ danh sách nhân sự.
### Đăng nhập vai trò Manager: (ID: M001, Password: 00000000)
### Đăng nhập vai trò Staff: (ID: S001, Password: 00000000)
### Sau khi đăng nhập, ở Trang chủ, bấm vào Record path rồi chọn file CSV lưu trữ danh sách bản ghi xuất nhập cảnh; bấm vào Wanted path rồi chọn file CSV lưu trữ danh sách truy nã.
### Nút Staff path có chức năng như nút Staff path trước khi đăng nhập nên không nhất thiết phải sử dụng.
### Trong thư mục nộp sản phẩm, có 3 file CSV cần tải về: User.csv (Dùng cho nút Staff path), record.csv (Dùng cho nút Record path), wanted.csv (Dùng cho nút Wanted path).

## 1. Phân quyền người dùng

### 1.1. Quản lý (Manager):
- Xem các danh sách
- Thêm, xóa và tìm kiếm các thành phần trong danh sách
- Đổi mật khẩu

### 1.2. Nhân viên (Staff):
- Nhập cảnh cho khách hàng
- Xuất cảnh cho khách hàng
- Hiện cảnh bảo khách hàng sai phạm
- Xem danh sách truy nã
- Đổi mật khẩu

## 2. Các chức năng
### 2.1. Tạo tài khoản
- Người dùng: Manager
- Tạo tài khoản cho Manager và Staff với mật khẩu mặc định là 00000000 (băm MD5 khi lưu trữ)

### 2.2. Đổi mật khẩu
- Người dùng: Manager và Staff
- So khớp bản mã mật khẩu cũ rồi nhập mật khẩu mới và lưu trữ bản mã MD5

### 2.3. Danh sách nhân viên
- Người dùng: Manager
- Xem danh sách gồm cả Manager và Staff
- Thêm: Nhập thông tin rồi thêm
- Xóa: Chọn 1 đối tượng rồi xóa
- Tìm kiếm các đối tượng theo thuộc tính

### 2.4. Danh sách truy nã
- Người dùng: Manager và Staff (chỉ xem)
- Thêm: Nhập thông tin rồi thêm
- Xóa: Chọn 1 đối tượng rồi xóa
- Tìm kiếm các đối tượng theo thuộc tính

### 2.5. Danh sách quá hạn
- Tính toán ngày hết hạn nhập cảnh của khách quốc tế
- Hiển thị các khách có ngày hết hạn thị thực trước ngày hiện tại

### 2.6. Bản ghi xuất nhập cảnh
- Đối tượng: Manager
- Staff tiếp nhận 1 khách xuất/nhập cảnh sẽ tồn tại 1 bản ghi vào dữ liệu
- Manager có thể xem danh sách này và lọc theo nhiều tiêu chí

### 2.7. Nhập cảnh
- Đối tượng: Staff
- Nhập thông tin của lần nhập cảnh
- Nhập thông tin giấy tờ của khách
- Hệ thống hiện thông báo nếu khách bị truy nã hoặc thông tin giấy tờ không khớp

### 2.8. Xuất cảnh
- Đối tượng: Staff
- Nhập thông tin của lần xuất cảnh
- Nhập thông tin giấy tờ của khách
- Hệ thống hiện thông báo nếu thông tin giấy tờ không khớp

## 3. Các đối tượng
### 3.1. Người dùng
Định nghĩa cho hai đối tượng được phân quyền: Manager và Staff

### 3.2. Bản ghi
Mỗi bản ghi vào lịch sử xuất nhập cảnh được coi là một đối tượng

### 3.3. Đối tượng truy nã
Mỗi đối tượng bị truy nã cần được xác định các thuộc tính cụ thể
