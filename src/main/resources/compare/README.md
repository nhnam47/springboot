
# So sánh Dependency Injection Pattern với Factory Pattern

Cả hai Dependency Injection (DI) và Factory đều nhằm mục đích cung cấp một cách tiện lợi cho việc tạo một thể hiện của một class. Hai Pattern này đều dựa trên quy tắc “lập trình cho interface chứ không phải để implement interface đó”.

Một vài khác biệt chủ yếu giữa DI và Factory Pattern là:

DI giúp chúng ta tạo ra ứng dụng ít kết dính, với Factory Pattern mỗi class có một dependency với Factory method.
Sử dụng Factory Pattern khó khăn khi viết Unit test do phụ thuộc vào các dependency. Ngược lại với DI thì dễ dàng viết Unit do không phụ thuộc vào dependency.
Hạn chế của DI so với Factory Pattern là cần phải cấu hình và cần một container để inject các dependency.

