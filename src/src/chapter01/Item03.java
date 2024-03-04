package chapter01;

// private 생성자나 열거 타입으로 싱글톤임을 보증하라
public class Item03 {
    /**
     * 싱글턴을 구현하는 3가지 방식
     * - 1. public static final 필드 방식
     * - 2. 정적 팩터리 방식
     * - 3. 열거타입 방식
     *
     */

    // 1
    public static class Elvis {
        public static final Elvis INSTANCE = new Elvis();
        private Elvis() {}

        public void leaveTheBuilding() {
            // 생략
        }
    }

    // 2.
    public static class Elvis2 {
        private static final Elvis2 INSTANCE = new Elvis2();

        private Elvis2() {}

        public static Elvis2 getInstance() {
            return INSTANCE;
        }

        public void leaveTheBuilding() {
            // 생략
        }
    }

    // 3. 대부분 상황에서 가장 좋은 방식
    public enum Elvis3 {
        INSTANCE;

        public void leaveTheBuilding() {
            // 생략
        }
    }


}
