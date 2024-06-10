package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {
        String answer = "out of range";
        switch (number) {
            case 1, 2, 3, 4, 5 -> answer = "number is between 1 and 5";
            case 6, 7, 8, 9, 10 -> answer = "number is between 6 and 10";
        }
        System.out.println(answer);
    }
}
