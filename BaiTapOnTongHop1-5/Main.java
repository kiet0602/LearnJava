public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("       KẾT QUẢ BÀI TẬP TỔNG HỢP JAVA      ");
        System.out.println("=========================================\n");

        // -------------------------------------------------------------
        // BÀI 1: Đã được sửa các lỗi cú pháp
        // -------------------------------------------------------------
        System.out.println("--- BÀI 1: SỬA LỖI CÚ PHÁP ---");
        // int score1st = 95;             // Sửa: Không bắt đầu bằng số (1stScore -> score1st)
        // float price = 19.99f;          // Sửa: Thêm chữ 'f' đằng sau giá trị float
        // Integer count = null;          // Sửa: Dùng Wrapper Class Integer thay vì int primitive
        
        // String input = "100";          // Sửa: Loại bỏ chữ 'đ' để tránh lỗi NumberFormatException
        // int total = Integer.parseInt(input);
        
        // System.out.println("Dữ liệu sau khi sửa lỗi:");
        // System.out.println("Score: " + score1st + " | Price: " + price + " | Total: " + total);
        // System.out.println();

        // -------------------------------------------------------------
        // BÀI 2: Hệ thống Quản lý Hóa đơn Bán hàng
        // -------------------------------------------------------------
        System.out.println("--- BÀI 2: QUẢN LÝ HÓA ĐƠN ---");
        String productName = "Tai nghe Bluetooth";
        String priceStr = "450000";
        String quantityStr = "3";
        String taxRateStr = "0.1";

        // Chuyển đổi từ String sang Primitive
        double priceValue = Double.parseDouble(priceStr);
        int quantity = Integer.parseInt(quantityStr);
        double taxRate = Double.parseDouble(taxRateStr);

        // Tính toán
        double totalBeforeTax = priceValue * quantity;
        double totalAfterTax = totalBeforeTax + (totalBeforeTax * taxRate);

        // Ép kiểu hẹp (Narrowing Casting) từ double sang long
        long finalPayment = (long) totalAfterTax;

        System.out.println("Sản phẩm: " + productName);
        System.out.println("Số lượng: " + quantity);
        System.out.println("Tổng tiền chưa thuế: " + totalBeforeTax + " VNĐ");
        System.out.println("Số tiền phải thanh toán (dạng long): " + finalPayment + " VNĐ");
        System.out.println();

        // -------------------------------------------------------------
        // BÀI 3: Quản lý Thẻ Sinh viên & Điểm số
        // -------------------------------------------------------------
        System.out.println("--- BÀI 3: THÔNG TIN SINH VIÊN ---");
        String studentName = "Nguyen Van A";
        String mathStr = "8.5";
        String englishStr = "7.0";

        // Chuyển String -> Wrapper Class Double
        Double mathObj = Double.valueOf(mathStr);
        Double englishObj = Double.valueOf(englishStr);

        // Tính toán (Tự động Unboxing từ Double sang double)
        double avgScore = (mathObj + englishObj) / 2;
        boolean isPassed = avgScore >= 5.0;

        // Chuyển double -> String
        String avgScoreStr = String.valueOf(avgScore);

        System.out.println("Sinh viên: " + studentName);
        System.out.println("Điểm TB (dạng String): " + avgScoreStr);
        System.out.println("Trạng thái đậu: " + isPassed);
        System.out.println("\n=========================================");
    }
}