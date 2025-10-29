public class main7 {
    public static void main(String[] args) {
        String s = "a12bc34d5";
        int total = 0;
        String numStr = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= '0' && c <= '9') {
                numStr += c;
            }
            else if (!numStr.isEmpty()) {
                total += Integer.parseInt(numStr);
                numStr = "";
            }
        }
        if (!numStr.isEmpty()) {
            total += Integer.parseInt(numStr);
        }

        System.out.println("Сумма чисел: " + total); // 51
    }
}