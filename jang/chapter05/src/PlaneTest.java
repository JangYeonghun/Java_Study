// 비행기를 나타내는 Plane라는 이름의 클래스를 설계하라
// Plane 클래스는 제작사, 모델, 최대 승객수를 필드로 가지고 있다
// - 필드를 정의하라. 모든 필드는 private 멤버로 하라
// - 모든 필드에 대한 접근자와 설정자 메소드를 작성한다
// - Plane 클래스의 생성자 중 몇 개를 중복 정의하라. 생성자는 모든 데이터를 받을 수도 있고 아니면 하나도 받지 않을 수 있다
// - PlaneTest라는 이름의 테스트 클래스를 만드는데 main()에서 Plane 객체 여러 개를 생성하고 접근자와 설정자를 호출하여 보라
// - Plane 클래스에서 지금까지 생성된 비행기의 개수를 나타내는 정적변수인 planes를 추가하고 생성자에서 증가시켜 보자
// - Plane 클래스에 정적변수 planes의 값을 반환하는 정적메소드인 getPlanes()를 추가하고 main()에서 호출하여 보라
/*
실행 결과
식별번호 : 1 모델 : aa 승객수 : 200
식별번호 : 2 모델 : bb 승객수 : 300
식별번호 : 3 모델 : cc 승객수 : 150
 */
class Plane {
    // 접근지정자 public(동일클래스, 동일패키지, 자식클래스, 전체세계), 정적 멤버(변수, 필드)
    public static int plane = 0;
    // 접근지정자 private(동일클래스), 필드(멤버 변수, 인스턴스 변수)
    private String manufacturer;
    private String model;
    private int maxPassengers;

    // 생성자 정의
    public Plane() {
        plane++;
    }

    // 생성자 중복 정의
    public Plane(String manufacturer, String model, int maxPassengers) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxPassengers = maxPassengers;
        plane++;
    }

    // 제작사
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // 모델
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // 승객수
    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    // 생성된 비행기 갯수
    public static int getPlanes() {
        return plane;
    }
}

public class PlaneTest {
    public static void main(String[] args) {
        // Plane 클래스, plane1 오브젝트, new Plane() 생성자
        Plane plane1 = new Plane("Boeing", "737", 200);
        Plane plane2 = new Plane("Airbus", "A320", 180);
        Plane plane3 = new Plane();

        // plane3 오브젝트(썼으니 인스턴스), .~ 인스턴스 메소드
        plane3.setManufacturer("Boeing");
        plane3.setModel("777");
        plane3.setMaxPassengers(300);

        System.out.println("식별번호 : 1 모델 : " + plane1.getModel() + " 승객수 : " + plane1.getMaxPassengers());
        System.out.println("식별번호 : 2 모델 : " + plane2.getModel() + " 승객수 : " + plane2.getMaxPassengers());
        System.out.println("식별번호 : 3 모델 : " + plane3.getModel() + " 승객수 : " + plane3.getMaxPassengers());

        System.out.println("지금까지 생성된 비행기의 개수 : " + Plane.getPlanes());
    }
}