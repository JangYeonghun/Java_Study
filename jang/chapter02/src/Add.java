public class Add {
    // 클래스 정의
    // 클래스의 이름과 동일해야 한다
    // class는 class를 선언하는 키워드(모든 프로그램 언어에서 특정 기능을 수행하기 위해 만들어 놓은 단어)
    // 클래스는 자바 프로그램의 빌딩 블록
    // 이 클래스들이 모여서 자바 프로그램이 된다
    // 클래스는 껍대기, 빌딩 블록은 오브젝트
    // 클래스 안에 오브젝트를 여러개 만들 수 있다

    public static void main(String[] args) {
        // 메소드 main()이 시작되는 문장
        // 클래스 내에 선언된 함수가 메소드이다
        // 메소드는 { 로 시작해서 } 로 끝난다

        int x;
        int y;
        int sum;

        x = 100;
        y = 200;
        sum = x + y;

        System.out.println("100과 200의 합 = " + sum);
    }

}
