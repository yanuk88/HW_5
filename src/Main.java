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

        System.out.print(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        System.out.println();
        System.out.print(numbers1[0] + ", " + numbers1[1] + ", " + numbers1[2]);
        System.out.println();
        System.out.print(mine[0] + ", " + mine[1] + ", " + mine[2] + ", " + mine[3]);
        System.out.println();

        //exercise 3

        System.out.print(numbers[2] + ", " + numbers[1] + ", " + numbers[0]);
        System.out.println();
        System.out.print(numbers1[2] + ", " + numbers1[1] + ", " + numbers1[0]);
        System.out.println();
        System.out.print(mine[3] + ", " + mine[2] + ", " + mine[1] + ", " + mine[0]);

        //exercise 4

        for (int i = 0; i <= 3; i++) {
            if(i %2 != 0) {i = i + 1;}
            System.out.println(i);
            
        }


    }
}