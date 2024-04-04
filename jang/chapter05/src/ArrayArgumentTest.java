// 예제 5-4
// 배열을 받아서 최소값을 계산하여 반환하는 메소드 minArray(double[] list)를 작성하고 테스트 해보자
/*
실행 결과
첫 번째 배열의 최소값=0.1
두 번째 배열의 최소값=-9.0
 */

/*
특징:
minArray 메소드를 static으로 선언하여, ArrayArgumentTest 클래스 내에서 직접 구현하고 사용합니다.
장점:
접근성과 편리성: minArray 메소드가 static이므로, 객체 생성 없이 바로 클래스 이름을 통해 메소드를 호출할 수 있어 사용이 편리합니다.
오버헤드 감소: 별도의 객체를 생성할 필요가 없기 때문에, 관련 오버헤드가 없습니다.
단점:
재사용성과 모듈화의 제한: minArray 메소드가 특정 클래스에 종속적이므로, 다른 프로그램이나 컨텍스트에서 재사용하기 어려울 수 있습니다.
책임 분리의 부재: 모든 코드가 하나의 클래스 내에 구현되어 있어, 책임 분리가 명확하지 않을 수 있습니다.
 */
//public class ArrayArgumentTest {
//
//    // 접근지정자 public(동일클래스, 동일패키지, 자식클래스, 전체세계), 정적메소드(클래스 멤버 메소드), 매개변수 double[] list
//    // 메소드가 static 이므로 객체 생성 없이 바로 클래스 이름을 토앻 메소드를 호출할 수 있음
//    public static double minArray(double[] list) {
//        double min = list[0];
//
//        for (int i = 1; i < list.length; i++) {
//            if (list[i] < min) {
//                min = list[i];
//            }
//        }
//        return min;
//    }
//
//    public static void main(String[] args) {
//        double[] a = {1.1, 2.2, 3.3, 4.4, 0.1, 0.2};
//        double[] b = {-2.0, 3.0, -9.0, 2.9, 1.5};
//
//        double min;
//
//        min = minArray(a);
//        System.out.println("첫 번째 배열의 최소값=" + min);
//        min = minArray(b);
//        System.out.println("두 번째 배열의 최소값=" + min);
//    }
//}

/*
특징:
ArrayArgument 클래스를 따로 정의하여, 배열의 최소값을 찾는 기능(minArray 메소드)를 이 클래스 내에 구현했습니다.
ArrayArgumentTest 클래스에서는 ArrayArgument 객체를 생성하여 minArray 메소드를 사용합니다.
장점:
모듈화와 재사용성: ArrayArgument 클래스는 다른 프로그램에서도 재사용할 수 있어, 코드의 모듈화와 재사용성이 높아집니다.
책임 분리: 데이터 처리 로직(minArray 메소드)이 별도의 클래스에 있어, 코드 관리가 용이하고 책임이 명확하게 분리됩니다.
단점:
객체 생성 오버헤드: 매번 ArrayArgument 객체를 생성해야 하므로, 이에 따른 미세한 오버헤드가 발생할 수 있습니다.
접근성: minArray 기능을 사용하기 위해서는 ArrayArgument 객체가 필요하기 때문에, 직접적인 메소드 호출보다 약간 번거로울 수 있습니다.
 */
class ArrayArgument { // 클래스
    // 반환형 double, 매개변수 double[] list
    double minArray(double[] list) {
        double min = list[0];

        for (int i = 0; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }

        return min;
    }
}

public class ArrayArgumentTest {
    public static void main(String[] args) {
        double[] a = {1.1, 2.2, 3.3, 4.4, 0.1, 0.2};
        double[] b = {-2.0, 3.0, -9.0, 2.9, 1.5};

        // ArrayArgument는 클래스, obj1 obj2는 객체(클래스의 인스턴스), new~는 생성자
        ArrayArgument obj1 = new ArrayArgument();
        ArrayArgument obj2 = new ArrayArgument();

        double min;

        min = obj1.minArray(a);
        System.out.println("첫 번째 배열의 최소값=" + min);
        min = obj2.minArray(b);
        System.out.println("en 번째 배열의 최소값=" + min);
    }
}