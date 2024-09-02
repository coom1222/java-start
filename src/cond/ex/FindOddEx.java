package cond.ex;

public class FindOddEx {

    public static void main(String[] args) {
        int x = 2;

//        if (x % 2 == 0){
//            System.out.println("x = " + x + "," + x + " is odd");
//        } else {
//            System.out.println("x = " + x + "," + x + " is even");
//        }

        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println(result);

    }
}

