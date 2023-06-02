package Day3.Method.array;

public class Array {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        //변수 선언
        int f;

        //변수 초기화
        f = 10;

        //변수 선언 및 초기화
        int g = 10;

        //배열 선언
        int[] arr = new int[5];

        //배열 초기화

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        //배열 선언 및 초기화
        int[] arr2 = {10,20,30,40,50,60,70}; // 길이 지정 x


        System.out.println(0); //배열의 시작은 0이다.
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        // 배열은 같은 자료형만 저장 가능하다.
        //arr[0] = "바나나"; // int 배열에 String을 저장하려고 하면 안된다.


        // 배열의 길이 정보 확인하는 방법
        System.out.println(arr.length);
        System.out.println(arr2.length);
    }}

