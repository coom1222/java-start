package method;

public class Method2 {

    public static void main(String[] args) {
        // String str = printFooter(); 이런식으로 반환값이 없는데 변수를 받으면 오류가 난다
        printHeaher();
        printFooter();
    }

    public static void printHeaher(){
        System.out.println(" = Start Program!! =");
        return; // void의 경우 생략 가능. 모든 메서드는 항상 return을 호출해야 하나 반환타입 void의 경우는
                // 예외로 return을 생략해도 된다. 자바 컴파일러가 마지막줄에 알아서 넣어주기 때문
    }

    public static void printFooter(){
        System.out.println(" = End Program!! =");
    }
}

