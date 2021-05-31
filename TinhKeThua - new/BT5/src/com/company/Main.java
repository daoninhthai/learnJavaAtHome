package com.company;

public class Main {

    public static void main(String[] args) {
	// Viết lớp Shape, lớp này chỉ có một hàm là draw() không có tham số và không trả về giá trị, chỉ xuất ra dòng chữ "Drawing a Shape".
        //Viết lớp Rectangle kế thừa từ lớp Shape. Thêm vào lớp Rectangle hai thuộc tính là chiều dài và chiều rộng (số nguyên). Viết các hàm khởi tạo và các hàm getter/setter cho lớp này, chú ý giá trị gán cho 2 thuộc tính nằm trong [1,15]. Trong lớp Rectangle, viết lại hàm draw() của lớp Shape để vẽ ra hình chữ nhật bởi các dấu *, với số lượng dấu * mỗi cạnh tùy thuộc vào các thuộc tính chiều dài và chiều rộng. Ví dụ thuộc tính chiều dài và chiều rộng lần lượt là 7 và 3 thì hàm draw() vẽ được hình:
        //hinh chu nhat PNG
        //
        //Viết lớp RightTriangle kế thừa tè lớp Shape. Thêm vào lớp RightTriangle một thuộc tính là cạnh vuông (số nguyên). Viết các hàm khởi tạo và các hàm getter/setter cho lớp này, chú ý giá trị gán cho thuộc tính nằm trong [1,20]. Trong lớp RightTriangle viết lại hàm draw()của lớp Shape để vẽ ra hình tam giác vuông bởi các dấu *, với số lượng dấu * mỗi cạnh tùy thuộc vào các thuộc tính cạnh vuông. Ví dụ thuộc tính cạnh vuông là 4 thì hàm draw() vẽ được hình:
        //hinh tam giac vuong PNG
        //
        //Viết lớp ArtistDemo, lớp này chứa hàm main(): khai báo biến rectangle có kiểu Rectangle và biến rightTriangle có kiểu RightTriangle. Viết chương trình nhập vào chiều dài, chiều rộng của hình chữ nhật và cạnh vuông cho hình tam giác vuông, sau đó gọi hàm draw() để vẽ hình tương ứng.
    }
}
