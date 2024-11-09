# Nhóm 1 - Đề 27 - Quản lý xuất nhập cảnh

## Link github: https://github.com/HTT5104/oop_n14_qlxnc

## Lưu ý trước khi sử dụng hệ thống
### Trước khi đăng nhập, bấm vào Staff path rồi chọn file CSV lưu trữ danh sách nhân sự.
### Đăng nhập vai trò Manager: (ID: M001, Password: 00000000)
### Đăng nhập vai trò Staff: (ID: S001, Password: 00000000)
### Sau khi đăng nhập, ở Trang chủ, bấm vào Record path rồi chọn file CSV lưu trữ danh sách bản ghi xuất nhập cảnh; bấm vào Wanted path rồi chọn file CSV lưu trữ danh sách truy nã.
### Nút Staff path có chức năng như nút Staff path trước khi đăng nhập nên không nhất thiết phải sử dụng.
### Trong thư mục nộp sản phẩm, có 3 file CSV cần tải về: User.csv (Dùng cho nút Staff path), record.csv (Dùng cho nút Record path), wanted.csv (Dùng cho nút Wanted path).

## Mạch sự kiện khi sử dụng hệ thống

### Chung
- Chọn Staff path (chọn file User.csv)
- Đăng nhập

### Vai trò Manager

#### Hoempage
- Chọn Record path (chọn file record.csv)
- Chọn Wanted path (chọn file wanted.csv)

#### Changepassword

#### Records
- Bấm See all để xem toàn bộ danh sách
- Chọn các thuộc tính (gồm khoảng thời gian, loại bản ghi, loại khách hàng) cho bộ lọc trên khung hình rồi bấm Filter để lọc dữ liệu

#### Staff list
- Bấm Update để xem danh sách
- Chọn 1 hàng rồi bấm Delete để xóa
- Bấm Add rồi nhập thông tin nhân sự mới để thêm

#### Wanted people list
- Bấm Update để xem danh sách
- Chọn 1 hàng rồi bấm Delete để xóa
- Bấm Add rồi nhập thông tin đối tượng truy nã mới để thêm
- Có thanh tìm kiếm số hộ chiếu (Passport) theo thời gian thực

#### Expired people list
Hiện danh sách khách quá hạn lưu trú

### Vai trò Staff

#### Hoempage
- Chọn Record path (chọn file record.csv)
- Chọn Wanted path (chọn file wanted.csv)

#### Changepassword

#### Entry or Exit
- Chọn loại: Entry/Exit
- Chọn loại khách hàng: Với mỗi loại khách hàng sẽ có giao diện khác nhau
- Nhập thông tin của lần xuất/nhập cảnh đó
- Bấm Check để kiểm tra thông tin đầu vào có hợp lệ hay không hoặc khách có bị truy nã không
- Bấm Accept để lưu bản ghi mới (tự động chạy Check trước khi lưu)

#### Wanted people list
- Bấm Update để xem danh sách
- Có thanh tìm kiếm số hộ chiếu (Passport) theo thời gian thực

#### Expired people list
Hiện danh sách khách quá hạn lưu trú
