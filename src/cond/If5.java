package cond;

public class If5 {

    public static void main(String[] args) {
        int price = 100000;
        int age = 10;
        int discount = 0;

        if (price >= 10000){
            discount = discount + 1000;
            System.out.println("10000 이상 구매, 1000원 할인");
        }

        if (age <= 10){
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("총 할인 금액 " + discount + "원");
    }
}


//// 예시1. if-else 사용: 서로 연관된 조건이어서, 하나로 묶을 때 if (condition1) {
//// 작업1 수행
//} else if (condition2) {
//// 작업2 수행 }
//// 예시2. if 각각 사용: 독립 조건일 때 if (condition1) {
//// 작업1 수행 }
//        if (condition2) { // 작업2 수행
//        }