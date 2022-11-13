package ua.hillel.javapro.hw06.primitiv;

public class HomeWorkApp {
    public static void main(String[] args) {

        // 2
        printThreeWords();
        // 3
        checkSumSign();
        // 4
        printColor();
        // 5
        compareNumbers();
        // 6
        System.out.println(sum(5, 6));
        //7
        positive(-2);
        // 8
        System.out.println(negative(-1));
        // 9
        writer("Text", 2);
        // 10
        System.out.println(leapYear(2000));
        System.out.println(leapYear(2002));
        System.out.println(leapYear(2020));
        System.out.println(leapYear(2100));
        System.out.println(leapYear(2400));
    }

    // 2
    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 3
    private static void checkSumSign() {
        int a = 1;
        int b = -2;

        if(a + b >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    // 4
    private static void printColor() {
        int value = 101;

        if(value <= 0) {
            System.out.println("Червоний");
        } else if (value <= 100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
    }

    // 5
    private static void compareNumbers() {
        int a = 15;
        int b = 14;

        System.out.println(a >= b ? "a>=b" : "a<b");

    }

    // 6
    private static boolean sum(int a, int b) {

        return (a + b) >= 10 && (a + b) <= 20 ? true : false;
    }

    // 7
    private static void positive(int numeric) {
        System.out.println(numeric >= 0 ? "positive" : "negative");
    }

    // 8
    private static boolean negative(int numeric) {
        return numeric < 0 ? true : false;
    }

    // 9
    private static void writer(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    // 10
    private static boolean leapYear(int year) {

//        if(year % 4 == 0) {
//            if(year % 100 == 0) {
//                if(year % 400 == 0) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//            return true;
//        }
//        return false;

        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? true : false;
    }



}
