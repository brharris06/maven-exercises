//import org.apache.commons.lang3.StringUtils;
//
//import java.util.Scanner;
//
//public class MavenExercise {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter something: ");
//        String input = scanner.nextLine();
//        System.out.println("You entered: ");
//        System.out.println(input);
//        if (StringUtils.isNumeric(input)) {
//            System.out.println(input + " is a number!");
//        } else {
//            System.out.println(input + " is not a number!");
//        }
//    }
//}

import java.util.ArrayList;
import java.util.List;
public class Mae {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(8); // Line 7
        numbers.add((int) 3.6); // Line 8
        for (Integer number: numbers) System.out.println(number); // Line 9
    }
}