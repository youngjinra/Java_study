package Day1.Condition;

//홀수와 짝수를 구별해주세요.
// num이 짝수면 even, 홀수면 odd 출력해주세요.
// 짝수 판별 : 2로 나누어서 떨어지면 짝수
public class Condition2 {
    public static void main(String[] args) {
        int num = 7; //홀수인지 짝수인지 확인할 숫자\
        if (num % 2 == 0) {
            System.out.println("even"); // 짝수일 경우 출력
        } else {
            System.out.println("odd"); // 홀수일 경우 출력
        }
    }
}
