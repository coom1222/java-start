package array;

public class Array1Ref2 {

    public static void main(String[] args) {
        int [] students = new int []{90, 80, 70, 60, 50};
        // 이 값이 들어간 5개짜리 뱅ㄹ이 자동생성 및 초기화

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i+1) + "의 점수: " + students[i] );
            // 문자 + 숫자 는 문자가 되므로 i+1에 ()를 반드시 쳐주어야 한다.
        }
    }
}