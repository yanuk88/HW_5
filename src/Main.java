public class Main {
    public static void main(String[] args) {
        //exercise 1

        int[] numbers = new int [3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        float[] numbers1 = {1.57f, 7.6540f, 9.986f};

        int[] mine = {17, 8, 19, 88};

        //exercise 2

        for (int i = 0; i < numbers.length; i++ ) {
            if (i != numbers.length - 1) {
                System.out.print(numbers[i] + ", ");}
            else {System.out.print(numbers[i]);}
        }
        System.out.println();

        for (int i = 0; i < numbers1.length; i++ ) {
            if (i != numbers1.length - 1) {
                System.out.print(numbers1[i] + ", ");}
            else {System.out.print(numbers1[i]);}
        }
        System.out.println();

        for (int i = 0; i < mine.length; i++ ) {
            if (i != mine.length - 1) {
                System.out.print(mine[i] + ", ");}
            else {System.out.print(mine[i]);}
        }
        System.out.println();

        //exercise 3

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(numbers[i] + ", ");}
            else {
                System.out.print(numbers[i]);}
            }
        System.out.println();

        for (int i = numbers1.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(numbers1[i] + ", ");}
            else {
                System.out.print(numbers1[i]);}
        }
        System.out.println();

        for (int i = mine.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(mine[i] + ", ");}
            else {
                System.out.print(mine[i]);}
        }
        System.out.println();


        //exercise 4

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] %2 != 0) {
                System.out.println(numbers[i] + 1);
                numbers[i]++;
            }
            else {
                System.out.println(numbers[i]);}

            }
        }

            
        }



