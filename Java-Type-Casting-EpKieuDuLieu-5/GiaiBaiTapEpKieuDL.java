public class GiaiBaiTapEpKieuDL {
    public static void main(String[] args) {
        String text = "150";
        Integer obj = Integer.valueOf(text); //String -> Integer
        int result = obj + 50;// unboxing Integer -> int

        System.out.println(result);

    }
}
