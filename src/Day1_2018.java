// Advent Of Code 2018 Day 1

import java.io.File;
import java.util.Scanner;

public class Day1_2018 {

    public static void main(String[] args) throws Exception {
        String add = "+";
        String subtract = "-";
        int sum = 0;

        File file = new File("src\\input_day1");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.startsWith(add)) {
                sum += Integer.parseInt(line.substring(1));
            } else if (line.startsWith(subtract)) {
                sum -= Integer.parseInt(line.substring(1));
            }
        }

        System.out.println(sum);
    }
}
