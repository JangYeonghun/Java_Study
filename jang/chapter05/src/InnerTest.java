// 예제 5-7
// 내부 클래스는 어떤 특정한 클래스에서만 사용되는 클래스를 정의할때 많이 사용된다
// 예를 들어서 Circle 클래스를 정의하는데 원의 중심을 표시하기 위해서 Point 클래스가 필요하다면
// Point 클래스를 내부 클래스로 정의할 수 있다

class Circle {
    class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    int radius;
    Point center;

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.center = new Point(x, y);
    }

    double calcArea() {
        return 3.14 * radius * radius;
    }
}
public class InnerTest {
    public static void main(String args[]) {
        Circle obj = new Circle(10, 0, 0);
        System.out.println("원의 면적=" + obj.calcArea());
    }
}
