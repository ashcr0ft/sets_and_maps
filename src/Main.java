import java.util.*;

public class Main {
    public static void main(String[] args) {
        taskOne();
        System.out.println("------------------------");
        taskTwo();
        System.out.println("------------------------");
        taskThree();
        System.out.println("------------------------");
        taskFour();
        System.out.println("------------------------");
        taskFourFromSky();
    }

    public static void taskOne() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void taskTwo() {
        List<Integer> nums = new ArrayList<>(List.of(6, 11, 2, 3, 8, 4, 10, 5, 7, 7, 6, 22, 5));
        // Забыл про Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(i) < nums.get(j)) {
                    Integer temp;
                    temp = nums.get(i);
                    nums.set(i, nums.get(j));
                    nums.set(j, temp);
                }
            }
        }
        Set<Integer> sort = new HashSet<>(nums);
        for (Integer s : sort) {
            if (s % 2 == 0) {
                System.out.println(s);
            }
        }
    }

    public static void taskThree() {

        Set<String> words = new HashSet<>(List.of("Привет, Андрей!",
                "Привет, Андрей!",
                "Привет, Андрей",
                "Ну где ты был",
                "Ну обними меня скорей!",
                "Привет, Андрей!",
                "Привет, Андрей!",
                "Привет, Андрей",
                "Ну где ты был",
                "Ну обними меня скорей!"));
        System.out.println(words);
    }

    public static void taskFour() {

        List<String> strings = new ArrayList<>(List.of("один", "один", "один", "один", "один", "один"));
        Set<String> sort = new HashSet<>(strings);
        int counter = 0;
        for (String s : sort) {
            for (String d : strings) {
                if (s.equals(d)) {
                    counter++;
                }
            }
            System.out.println(counter);
            counter = 0;
        }
    }

    //красивое решение...
    public static void taskFourFromSky() {

        List<String> strings = new ArrayList<>(List.of("один", "два", "один", "один", "один", "один", "один"));

        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : strings) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        for (int count : wordCounts.values()) {
            System.out.println(count);
        }
    }
}

