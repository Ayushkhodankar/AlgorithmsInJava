package recursionImplementation;

import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;


public class GoodStringDistance {

    public static int calculateDistance(String goodString, String name) {
        Map<Character, Integer> goodMap = new HashMap<>();
        for (int i = 0; i < goodString.length(); i++) {
            goodMap.put(goodString.charAt(i), i);
        }

        char prevGoodLetter = goodString.charAt(0);
        
        int totalDistance = 0;

        for (char c : name.toCharArray()) {
            if (goodString.indexOf(c) != -1) {
                totalDistance += Math.abs(prevGoodLetter - c);
                prevGoodLetter = c;
            } else {
                int index1 = goodMap.get(prevGoodLetter);
                int index2 = (index1 + 1) % goodString.length();

                int distance1 = Math.abs(c - goodString.charAt(index1));
                int distance2 = Math.abs(c - goodString.charAt(index2));

                if (distance1 <= distance2) {
                    totalDistance += distance1;
                    prevGoodLetter = goodString.charAt(index1);
                } else {
                    totalDistance += distance2;
                    prevGoodLetter = goodString.charAt(index2);
                }
            }
        }

        return totalDistance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String goodString = scanner.nextLine().trim();
        String name = scanner.nextLine().trim();

        System.out.println(calculateDistance(goodString, name));
    }
}
