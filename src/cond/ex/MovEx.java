package cond.ex;

public class MovEx {

    public static void main(String[] args) {

        double doubleRating = 7.1;

        if (doubleRating <= 9) {
            System.out.println("어바웃타임을 추천합니다.");
        }
        if (doubleRating <= 8) {
            System.out.println("토이스토리를 추천합니다.");
        }
        if (doubleRating <= 7) {
            System.out.println("고질라를 추천합니다.");
        }
    }
}