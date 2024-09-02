package cond.ex;

public class KmEx {

    public static void main(String[] args) {

        int km = 22;

        if (km < 1) {
            System.out.println("distance : " + km);
            System.out.println("도보를 이용하세요.");
        } else if (km <= 10) {
            System.out.println("distance : " + km);
            System.out.println("자전거를 이용하세요.");
        } else if (km <= 100) {
            System.out.println("distance : " + km);
            System.out.println("자동차를 이용하세요.");
        } else if (km > 100) {
            System.out.println("distance : " + km);
            System.out.println("비행기를 이용하세요.");
        }
    }
}
