// 도전 문제
// Circle 객체 2개를 생성해보자. 참조 변수 obj1과 obj2로 가리키게 하라.
//  첫 번재 객체에는 100, "red"를 저장하고 두 번째 객체에는 200, "blue"를 저장해 본다.
class Circle {
    // 필드
    int radius;
    String color;

    // 메소드
    double calcArea() {
        return 3.14 * radius * radius;
    }
}

public class CircleTest { // 한 소스파일 안에는 public은 하나만 존재
    public static void main(String[] args) { // static은 object를 만들 필요 없이 호출할 수 있는 메소드
        Circle obj1; // 참조 변수 선언
        obj1 = new Circle(); // 객체 생성
        obj1.radius = 100;
        obj1.color = "blue";
        double area1 = obj1.calcArea();
        System.out.println("obj1원의 면적=" + area1);

        Circle obj2 = new Circle(); // 참조 변수 선언 후 new Circle()로 객체를 생성
        obj2.radius = 200;
        obj2.color = "red";
        double area2 = obj2.calcArea();
        System.out.println("obj2원의 면적=" + area2);

    }
}