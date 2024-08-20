package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127;   // -128 ~ 127
        short s = 32767;    // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억)
        // int 는 4byte

        // 아무튼 엄청 크고 김, long은 뒤에 L을 붙여주어야 한다.
        long l = 9223372036854775807L;

        // 실수
        float f = 10.0f;    // float은 뒤에 f 붙여줘야한다.
        double d = 10.0;

        /*
        정수 리터럴은 각 자료형의 표현범위 내에서만 표현 가능하다.
         */
    }
}
