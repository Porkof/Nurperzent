import java.util.*;

public class main19 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {3, 4, 5, 6};

        Set<Integer> mergedSet = new LinkedHashSet<>();

        for (int num : array1) {
            mergedSet.add(num);
        }
        for (int num : array2) {
            mergedSet.add(num);
        }

        int[] result = new int[mergedSet.size()];
        int index = 0;
        for (int num : mergedSet) {
            result[index++] = num;
        }
        System.out.println("Массив 1: " + Arrays.toString(array1));
        System.out.println("Массив 2: " + Arrays.toString(array2));
        System.out.println("Объединенный: " + Arrays.toString(result));
    }
}





















//public class main1 {
//    public static void main(String[] args) {
//        String text = "ab";
//        for (int i = 0; i < text.length(); i++){
//            char ch = text.charAt(i);
//            int ascii = (int) ch;
//            System.out.println(ch);
//            System.out.println(ascii);
//        }
//    }
//}







//import java.util.Scanner;
//public class main20 {
//    static public void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.next();
//        System.out.printf("ASCII; %d\n", (int) word.charAt(0);
//
//        char A = 65;
//        System.out.printf("A: %c\n", A);
//        scanner.close();
//    }
//}