package array;

public class Array1Ref1 {

    public static void main(String[] args) {
        int [] students;    // 배열 변수 선언(배열을 담을 수 있는 변수), 이 배열변수에 참조값(주소값)을 보관해둔다.
        students = new int [5]; // 배열 생성
        // 배열은 메모리에 생성되지만, 참조값을 통해 이 메모리에 접근해 배열을 사용할 수 있다.

        // System.out.println(students);
        // [I@a09ee92 -> 돌리면 나오는 값. I는 int를 뜻, @뒤에가 16진수로 표현된 메모리의 참조값

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for (int i = 0; i < 5; i++) {
            // students.length = 5 이다
            System.out.println(students.length);
            System.out.println("학생" + (i+1) + "의 점수: " + students[i] );
            // 문자 + 숫자 는 문자가 되므로 i+1에 ()를 반드시 쳐주어야 한다.
        }
    }
}
/*
리펙토링(Refactoring)은 기존의 코드 기능은 유지하면서 내부 구조를 개선하여 가독성을 높이고, 유지보수를 용이하게 하는 과정을 뜻한다.
이는 중복을 제거하고, 복잡성을 줄이며, 이해하기 쉬운 코드로 만들기 위해 수행된다.
리펙토링은 버그를 줄이고, 프로그램의 성능을 향상시킬 수도 있으며, 코드의 설계를 개선하는 데에도 도움이 된다.
즉, 작동은 똑같으나 코드를 개선하는 것을 리펙토링이라 한다.
 */