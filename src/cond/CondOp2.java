package cond;
// 삼항연산자
public class CondOp2 {

    public static void main(String[] args) {
        int age = 120;
        String status = (age >= 18) ? "성인" : "미성년자";
        // 조건 검사, 참이면 왼쪽, 거짓이면 오른쪽이 status 변수에 들어감
        System.out.println("age = " + age + " status = " + status);
    }
}
