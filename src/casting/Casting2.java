package casting;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int) doubleValue;   // 형변환
        System.out.println(intValue);

        System.out.println(10.5);
        System.out.println((int) 10.5);
    }
}

/*
형변환 -> 영어로는 casting
타입을 바꾼다 해서 형변환이라 한다.
 */