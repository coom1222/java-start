package method;

public class MethodValue2 {
    // main()에 정의한 변수와 메서드의 매개변수(파라미터)의 이름이 둘다 number로 같다.
    // main()도 사실은 메서드이다. 각각의 메서드 안에서 사용하는 변수는 서로 완전히 분리된 다른 변수이다.
    // 즉 여기서는 이름만 같지 완전히 다른 변수인 것이다.
    // 완전히 다른 메모리공간에 생기는 완전히 다른 변수이다.
    public static void main(String[] args) {
        int number = 5;

        System.out.println("1. changeNumber 호출 전, number: " + number);  //5
        changNumber(number);
        System.out.println("4. changeNumber 호출 후, number: " + number);  //5

    }

    public static void changNumber(int number) {
        System.out.println("2. changeNumber 변경 전, number: " + number);  //5
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number: " + number);  //10
    }
}
