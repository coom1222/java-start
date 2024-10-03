package array;

public class Array1Ref3 {

    public static void main(String[] args) {
        int [] students = {90, 80, 70, 60, 50, 20, 10, 100, 65}; // int형 배열 생성과 초기화를 자바가 추측해서 돌아가게 만들어준다.
        // 이렇게 쓸 때는 라인을 나눌수는 없다. 배열을 선언함과 동시에 초기화 해주어야 돌아간다.
        // new int[] 가 생략됐쥬?

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i+1) + "의 점수: " + students[i] );
            // 문자 + 숫자 는 문자가 되므로 i+1에 ()를 반드시 쳐주어야 한다.
        }
        // 이젠 학생을 마음껏 추가, 삭제해도 코드를 수정할 필요가 없다!
    }
}