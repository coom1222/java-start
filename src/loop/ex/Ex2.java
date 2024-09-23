package loop.ex;

public class Ex2 {

    public static void main(String[] args) {
        //int num = 2;
        // int count = 1;
        // while문으로
//        while (count <= 10) {
//            num += 1;
//            if (num % 2 == 0) {
//                System.out.println(num);
//                count++;
//            }
        // for문으로
        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
            System.out.println(num);
        }

    }
}
