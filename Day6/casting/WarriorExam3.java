package Day6.casting;

public class WarriorExam3 {
    public static void main(String[] args) {
        전사타입2 a전사 = new 전사타입2();

        a전사.이름 = "카니";
        a전사.무기 = "칼";
        a전사.공격력 = 15;
        a전사.스킬명 = "연속 베기";
        a전사.스킬배율 = 2;

        a전사.공격();
        a전사.스킬사용();

        a전사.무기 = "활";
        a전사.공격력 = 10;
        a전사.스킬명 = "불화살";
        a전사.스킬배율 = 1.5;

        a전사.공격();
        a전사.스킬사용();

        a전사.무기 = "칼";
        a전사.공격력 = 15;
        a전사.스킬명 = "불화살";
        a전사.스킬배율 = 2;

        a전사.공격();
        a전사.스킬사용();

    }
}

class 전사타입2 {
    String 이름;
    String 무기;
    int 공격력;
    double 스킬배율;
    String 스킬명;

    void 공격() {
        System.out.printf("%s이/가 %s 으/로 %d의 데미지를 입힙니다.\n", 이름, 무기, 공격력);
    }
    void 스킬사용() {
        System.out.printf("%s 스킬을 사용합니다. %.1f의 피해를 입힙니다.\n", 스킬명, 공격력 * 스킬배율);
    }
}
