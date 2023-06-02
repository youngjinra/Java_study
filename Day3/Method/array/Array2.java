package Day3.Method.array;

public class Array2 {
    public static void main(String[] args) {
        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i = 10; i <= 100; i++) {
            if (i % 10 == 0)
                System.out.println(i);

        }
    }
}
