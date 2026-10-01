public class GiaiBaiTapEpKieuDL {
    public static void main(String[] args) {
        int total = 10;
        int count = 4;
        double avg = (double) total / count;
        double avg2 = total / count; 
        System.out.println(avg); // 2.5
        System.out.println(avg2); // 2.0
        System.out.println(count);
        System.out.println(total);
    }
}
