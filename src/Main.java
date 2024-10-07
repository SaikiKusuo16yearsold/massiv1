import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //задача 1
        byte[] three = new byte[3];
        three[0] = 1;
        three[1] = 2;
        three[2] = 3;

        float[] fractionalNumbers = {1.57F, 7.654F, 9.986F};

        int[] age = {14, 15, 16};
        //задача 2
        for (int i = 0; i <= three.length - 1; i++) {
            if (i != three.length - 1) {
                System.out.printf(three[i] + ", ");
            } else {
                System.out.println(three[i]);
            }

        }
        for (int i = 0; i <= fractionalNumbers.length - 1; i++) {
            if (i != fractionalNumbers.length - 1) {
                System.out.printf(fractionalNumbers[i] + ", ");
            } else {
                System.out.println(fractionalNumbers[i]);
            }
        }
        for (int i = 0; i <= age.length - 1; i++) {
            if (i != age.length - 1) {
                System.out.printf(age[i] + ", ");
            } else {
                System.out.println(age[i]);
            }
        }
        //задча 3
        for (int i = three.length - 1; 0 <= i; i--) {
            if (i != 0) {
                System.out.printf(three[i] + ", ");
            } else {
                System.out.println(three[i]);
            }

        }
        for (int i = fractionalNumbers.length - 1; 0 <= i; i--) {
            if (i != 0) {
                System.out.printf(fractionalNumbers[i] + ", ");
            } else {
                System.out.println(fractionalNumbers[i]);
            }

        }
        for (int i = age.length - 1; 0 <= i; i--) {
            if (i != 0) {
                System.out.printf(age[i] + ", ");
            } else {
                System.out.println(age[i]);
            }

        }

        //задача 4
        for (int i = 0; i <= three.length - 1; i++) {
            if (three[i] % 2 != 0) {
                three[i] += 1;
            }
        }
        //результат преобразования
        System.out.println(Arrays.toString(three));
    }


}




