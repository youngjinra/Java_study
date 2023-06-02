package Day3.Method.Input;

public class Input5 {
    public static void main(String[] args) {
        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("배열의 합 : " + sum);
    }
}
