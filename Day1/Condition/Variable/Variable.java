package Day1.Condition.Variable;

public class Variable {

    // {} 영역이 새로 열리면 한번 들여쓰기한다.
    public static void main(String[] args) {

        //같은 값을 여러번 사용해야 하는 경우 -> 저장해 놨다가 재활용
        //ex)사과,바나나 예시 사과상자=변수 / 안에 든 과일=값

        // 변수 선언 및 할당

        // 값의 크기와 모양 -> 타입(자료형) int = 숫자 타입 / String = 문자 타입
        int num = 15;

        String hong = "홍길동";

        // 변수 선언
        // 주의 . 같은 이름으로 변수를 2개 이상 만들지 말 것
        int num2;

        // 할당 - 변수는 왼쪽, 값은 오른쪽
        // 값은 단 한개만 할당 가능
        num2 = 10;
        num2 = 20;

        System.out.println(num);
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);


        int a = 10;
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);

        a = 15;
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
    }
    }
