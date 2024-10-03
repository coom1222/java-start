package array;

// 구조개선 - 초기화, 배열의 길이
public class ArrayDi4 {

    public static void main(String[] args) {
        int [][] arr = new int [10][10];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = i++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for(int column = 0; column < arr[row].length; column++){
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();   // 한 행이 끝나면 라인 변경
        }
    }
}
