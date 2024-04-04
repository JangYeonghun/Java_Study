// 예제 5-1
// 가게에서 하루에 판매되는 피자의 개수를 알고싶다고 하자
// 피자의 개수를 알기 위해서는 지금까지 피자가 얼마나 생성되었는지를 알아야 한다
// 이러한 경우에 정적 변수를 선언하고 생성자에서 증가시키면 된다

class Pizza {
    // 접근지정자 private(동일클래스), 필드(멤버 변수), 인스턴스 변수
    private String toppings;
    //
    // 정적 멤버 or 클래스 멤버, 정적 변수(여러개의 객체가 하나의 변수를 공유해야 할 때)
    static int count = 0;

    // 생성자, 접근지정자 public(동일클래스, 동일패키지, 자식클래스, 전체세계), 매개변수로 String toppings를 받음, 참조변수 this(필드와 생성자를 참조)
    public Pizza(String toppings) {
        this.toppings = toppings;
        count++;
    }
}

public class PizzaTest {
    public static void main(String[] args) {
        // PizzaTest는 클래스, p1 p2 p3는 오브젝트이자 클래스의 인스턴스, new~는 생성자, 매개변수로 ss, c, p 이 들어간다
        Pizza p1 = new Pizza("Super Supreme");
        Pizza p2 = new Pizza("Cheese");
        Pizza p3 = new Pizza("Pepperoni");
        // static 멤버(정적 변수)에 접근할 때에는 무조건 클래스 명으로 접근
        // p1.count 하면 에러가 나온다
        int n = Pizza.count;

        System.out.println("지금까지 판매된 피자 개수 = " + n);
    }
}