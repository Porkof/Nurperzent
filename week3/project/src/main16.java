public class main16 {
    public static void main(String[] args) {
        String text = "Hello World";
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            int j = chars.length - 1 - i;

            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }


        String reversed = new String(chars);

        System.out.println("Исходная: " + text);
        System.out.println("Перевернутая: " + reversed);
    }
}