//111
//import java.util.*;
//
//public class main1 {
//    public static void main(String[] args) {
//        String text = "Java is great and programming is powerful";
//
//        String[] words = text.toLowerCase().split(" ");
//
//        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
//
//        for (String word : uniqueWords) {
//            System.out.println(word);
//        }
//    }
//}

//222
//public class main2 {
//    public static void main(String[] args) {
//        String text = "i am vengeance i am the night i am batman";
//
//        String longestWord = findLongestWord(text);
//        System.out.println("Самое длиное слово: " + longestWord);
//    }
//
//    public static String findLongestWord(String text) {
//        String[] words = text.split(" ");
//        String longest = "";
//
//        for (String word : words) {
//            if (word.length() > longest.length()) {
//                longest = word;
//            }
//        }
//
//        return longest;
//    }
//}


//333
//public class main3 {
//    public static void main(String[] args) {
//        String text = "banananananananananananana";
//        text = text.toLowerCase();
//
//        int vowels = 0;
//        int consonants = 0;
//
//        for (int i = 0; i < text.length(); i++) {
//            char c = text.charAt(i);
//
//            if (c >= 'a' && c <= 'z') {
//                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//                    vowels++;
//                } else {
//                    consonants++;
//                }
//            }
//        }
//
//        System.out.println("Гласные: " + vowels);
//        System.out.println("Согласные: " + consonants);
//    }
//}



//444
//public class main4 {
//    public static void main(String[] args) {
//        String text = "Java is great and programming is powerful";
//
//        String cleaned = text.toLowerCase().replaceAll(" ", "");
//
//        boolean isPalindrome = true;
//        int n = cleaned.length();
//
//        for (int i = 0; i < n / 2; i++) {
//            if (cleaned.charAt(i) != cleaned.charAt(n - 1 - i)) {
//                isPalindrome = false;
//                break;
//            }
//        }
//
//        System.out.println("Текст: '" + text + "'");
//        System.out.println("Является палиндромом: " + isPalindrome);
//    }
//}


//555
//public class main5 {
//    public static void main(String[] args) {
//        String text = "hello world";
//        String substring = "world";
//        int index = findSubstring(text, substring);
//        System.out.println("Подстрока '" + substring + "' найдена на позиции: " + index);
//    }
//    public static int findSubstring(String text, String substring) {
//        if (substring.isEmpty()) return 0;
//
//        int n = text.length();
//        int m = substring.length();
//
//        for (int i = 0; i <= n - m; i++) {
//            boolean found = true;
//
//            for (int j = 0; j < m; j++) {
//                if (text.charAt(i + j) != substring.charAt(j)) {
//                    found = false;
//                    break;
//                }
//            }
//            if (found) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}


//666
//import java.util.Arrays;
//public class main6 {
//    public static void main(String[] args) {
//        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
//
//        System.out.println("Исходный массив: " + Arrays.toString(numbers));
//        bubbleSort(numbers);
//        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));
//    }
//
//    public static void bubbleSort(int[] arr) {
//        int n = arr.length;
//
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }
//}



//777
//public class main7 {
//    public static void main(String[] args) {
//        String s = "a12bc34d5";
//        int total = 0;
//        String numStr = "";
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//
//            if (c >= '0' && c <= '9') {
//                numStr += c;
//            }
//            else if (!numStr.isEmpty()) {
//                total += Integer.parseInt(numStr);
//                numStr = "";
//            }
//        }
//        if (!numStr.isEmpty()) {
//            total += Integer.parseInt(numStr);
//        }
//
//        System.out.println("Сумма чисел: " + total); // 51
//    }
//}


//888
//import java.util.*;
//public class main8 {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1};
//
//        Set<Integer> seen = new HashSet<>();
//        Set<Integer> duplicates = new HashSet<>();
//
//        for (int num : numbers) {
//            if (!seen.add(num)) {
//                duplicates.add(num);
//            }
//        }
//
//        System.out.println("Исходный массив: " + Arrays.toString(numbers));
//        System.out.println("Дубликаты: " + duplicates);
//    }
//}


//999
//import java.util.Arrays;
//public class main9 {
//    public static void main(String[] args) {
//        String word1 = "listen";
//        String word2 = "silent";
//
//        char[] chars1 = word1.toLowerCase().toCharArray();
//        char[] chars2 = word2.toLowerCase().toCharArray();
//
//        Arrays.sort(chars1);
//        Arrays.sort(chars2);
//
//        boolean isAnagram = Arrays.equals(chars1, chars2);
//
//        System.out.println("Строка 1: " + word1);
//        System.out.println("Строка 2: " + word2);
//        System.out.println("Анаграммы? " + isAnagram);
//    }
//}


//1010
//public class main10 {
//    public static void main(String[] args) {
//        String text = "Hello World This is a      test.";
//
//        String result = text.replaceAll("\\s", "");
//
//        System.out.println("До: '" + text + "'");
//        System.out.println("После: '" + result + "'");
//    }
//}


//11 11
//import java.util.*;
//public class main11 {
//    public static void main(String[] args) {
//        String text = "hello world";
//
//        Map<Character, Integer> countMap = new HashMap<>();
//
//        for (char c : text.toCharArray()) {
//            if (countMap.containsKey(c)) {
//                countMap.put(c, countMap.get(c) + 1);
//            } else {
//                countMap.put(c, 1);
//            }
//        }
//
//        System.out.println("Частота символов в строке: '" + text + "'");
//        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
//            char c = entry.getKey();
//            String displayChar = (c == ' ') ? "пробел" : String.valueOf(c);
//            System.out.println(displayChar + ": " + entry.getValue());
//        }
//    }
//}



//12 12
//public class main12 {
//    public static void main(String[] args) {
//        int n = 10;
//        System.out.println("Первые " + n + " чисел Фибоначчи:");
//        printFibonacci(n);
//    }
//
//    public static void printFibonacci(int n) {
//        if (n <= 0) return;
//
//        long a = 0, b = 1;
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(a + " ");
//            long next = a + b;
//            a = b;
//            b = next;
//        }
//    }
//}


//13 13
//public class main13 {
//    public static void main(String[] args) {
//        int n = 30;
//        System.out.println("Простые числа от 2 до " + n + ":");
//        printPrimesSimple(n);
//    }
//
//    public static void printPrimesSimple(int n) {
//        for (int i = 2; i <= n; i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//
//    public static boolean isPrime(int num) {
//        if (num <= 1) return false;
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}


//14 14
//public class main14 {
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int sum = sumEvenIndices(array);
//
//        System.out.println("Массив: " + java.util.Arrays.toString(array));
//        System.out.println("Сумма элементов на четных индексах: " + sum);
//    }
//
//    public static int sumEvenIndices(int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i += 2) {
//            sum += arr[i];
//        }
//        return sum;
//
//    }
//}


//15 15
//import java.util.Arrays;
//
//public class main15 {
//    public static void main(String[] args) {
//        int[] array = {3, 7, 2, 9, 1, 5, 8};
//        System.out.println("Исходный массив: " + Arrays.toString(array));
//
//        swapMinMax(array);
//
//        System.out.println("После обмена: " + Arrays.toString(array));
//    }
//    public static void swapMinMax(int[] arr) {
//        if (arr.length == 0) return;
//
//        int minIndex = 0;
//        int maxIndex = 0;
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < arr[minIndex]) {
//                minIndex = i;
//            }
//            if (arr[i] > arr[maxIndex]) {
//                maxIndex = i;
//            }
//        }
//        int temp = arr[minIndex];
//        arr[minIndex] = arr[maxIndex];
//        arr[maxIndex] = temp;
//    }
//}


//1616
//public class main16 {
//    public static void main(String[] args) {
//        String text = "Hello World";
//        char[] chars = text.toCharArray();
//
//        for (int i = 0; i < chars.length / 2; i++) {
//            int j = chars.length - 1 - i;
//
//            char temp = chars[i];
//            chars[i] = chars[j];
//            chars[j] = temp;
//        }
//
//        String reversed = new String(chars);
//
//        System.out.println("Исходная: " + text);
//        System.out.println("Перевернутая: " + reversed);
//    }
//}

//17 17
//import java.util.*;
//public class main17 {
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 2, 4, 5, 1, 6, 3};
//        System.out.println("Исходный массив: " + Arrays.toString(array));
//
//        int[] result = removeDuplicates(array);
//        System.out.println("Без дубликатов: " + Arrays.toString(result));
//    }
//
//    public static int[] removeDuplicates(int[] arr) {
//        Set<Integer> set = new LinkedHashSet<>();
//        for (int num : arr) {
//            set.add(num);
//        }
//
//        int[] result = new int[set.size()];
//        int index = 0;
//        for (int num : set) {
//            result[index++] = num;
//        }
//        return result;
//    }
//}



//18 18
//import java.util.Arrays;
//
//public class main18 {
//    public static void main(String[] args) {
//        int[] numbers = {12, 35, 1, 10, 34, 1};
//
//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//
//        for (int num : numbers) {
//            if (num > largest) {
//                secondLargest = largest;
//                largest = num;
//            } else if (num > secondLargest && num != largest) {
//                secondLargest = num;
//            }
//        }
//
//        System.out.println("Массив: " + Arrays.toString(numbers));
//        System.out.println("Наибольшее число: " + largest);
//
//        if (secondLargest != Integer.MIN_VALUE) {
//            System.out.println("Второе по величине число: " + secondLargest);
//        } else {
//            System.out.println("Второго по величине числа не существует");
//        }
//    }
//}

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






//19 19
//import java.util.*;
//
//public class main19 {
//    public static void main(String[] args) {
//        int[] array1 = {1, 2, 3, 4};
//        int[] array2 = {3, 4, 5, 6};
//
//        Set<Integer> mergedSet = new LinkedHashSet<>();
//
//        for (int num : array1) {
//            mergedSet.add(num);
//        }
//        for (int num : array2) {
//            mergedSet.add(num);
//        }
//
//        int[] result = new int[mergedSet.size()];
//        int index = 0;
//        for (int num : mergedSet) {
//            result[index++] = num;
//        }
//        System.out.println("Массив 1: " + Arrays.toString(array1));
//        System.out.println("Массив 2: " + Arrays.toString(array2));
//        System.out.println("Объединенный: " + Arrays.toString(result));
//    }
//}


//20 20
//import java.util.*;
//
//public class main20 {
//    public static void main(String[] args) {
//        String text = "apple,banana,orange,grape";
//        char delimiter = ',';
//
//        List<String> parts = new ArrayList<>();
//        StringBuilder currentPart = new StringBuilder();
//
//        for (int i = 0; i < text.length(); i++) {
//            char c = text.charAt(i);
//
//            if (c == delimiter) {
//                parts.add(currentPart.toString());
//                currentPart.setLength(0);
//            } else {
//                currentPart.append(c);
//            }
//        }
//        parts.add(currentPart.toString());
//
//        System.out.println("Исходная строка: " + text);
//        System.out.println("Разделенные части: " + parts);
//    }
//}