package Day1.Condition.Operator;

public class Operator1 {
    public static void main(String[] args) {

        // 문제 : 실행되는 출력문에는 참 그렇지 않으면 거짓 이라고 적어주세요.

        if (true) {
            System.out.println("참");
        }

        if (false) {
            System.out.println("거짓");
        }

        int a = 10;
        // `==` => 같다.<비교연산자>
        if (a == 10) {
            System.out.println("참");
        }

        // `!=` => 같지 않다.
        if (a != 10) {
            System.out.println("거짓");
        }

        if (a > 10) {
            System.out.println("거짓");
        }

        if (a >= 10) {
            System.out.println("참");
        }

        int b = 10;

        if (a == b) {
            System.out.println("참");
        }

        //숫자는 int, 문자는 Spring, boolean c => c 에는 오직 true/false 만 담을 수 있다.

        boolean c = a != b;//c=false

        if (c) {
            System.out.println("거짓");
        }

        if (c == false) {
            System.out.println("참");
        }

        // `!` => 반전
        if (!c) {
            System.out.println("참");
        }

        // `!` => 반전
        if (!(!c)) {
            System.out.println("거짓");
        }

        boolean d = true;

        if (c != d) {
            System.out.println("참");
        }
    }
}
