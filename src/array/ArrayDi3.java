package array;

// 구조개선 - 초기화, 배열의 길이
public class ArrayDi3 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        // 2차원이니까 {} 두개,
        int [][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };  // 행2, 열3

        // 2중 for문, 첫 번째 for문은 행을 탐색, 내부에 있는 두번째 for문은 열을 탐색
        // arr.length 는 두개를 들 고 있다. {1,2,3}과 {4,5,6} 이로서 행은 이렇게 쓴다. arr 배열은 {},{} 2개의 배열 요소를 가진다.
        // 그렇다면 열은? arr[row].length 로 쓴다. arr[row] 는 {1,2,3}이다. 얘의 length는 3이므로
        // 즉, arr[row].length는 열의 길이를 뜻한다.
        for (int row = 0; row < arr.length; row++) {
            for(int column = 0; column < arr[row].length; column++){
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();   // 한 행이 끝나면 라인 변경
        }
    }
}
