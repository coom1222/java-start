package method;

public class MethodReturn2 {

    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");
            return;
        }   // 이렇게 return을 만나면 method가 끝난다. 즉, 밑에 로직을 수행하지 않고 바로 탈출한다.

        System.out.println(age + "살, 입장하세요");

    }
}
