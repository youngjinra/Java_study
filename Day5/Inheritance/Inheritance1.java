package Day5.Inheritance;

public class Inheritance1 {
    public static void main(String[] args) {
        Cat C1 = new Cat();
        C1.move();
        C1.meow();

        Dog D1 = new Dog();
        D1.move();
        D1.bark();
        // 클래스 안에서 중복된 코드가 발생하게 될 경우가 있다
        // 상속(말 그대로 물려주는 것) -> 더 상위 개념을 만들어라
        // 상속은 더 상위 개념을 만들어야 한다.
        // Class Dog extends Cat = Cat에 있는 코드를 Dog가 물려받는 메서드 기능적으로는 code를 물려받아서 적용할 수 있지만 내용이 이상해질 수도 있음

    }
}

    class Animal {
        public void move() {
            System.out.println("움직입니다~~~");
        }
    }

    class Cat extends Animal{

        public void meow() {
            System.out.println("야옹");
        }
}

    class Dog extends Animal {

        public void bark() {
            System.out.println("멍멍");
        }
    }