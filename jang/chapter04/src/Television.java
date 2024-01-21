// 예제 4-2
// Television 클래스에 생성자를 추가하여 업그레이드 해보자. 생성자는 객체가 생성될 때, channel, volume, onOff 필드를 초기화 한다.
/*
실행 결과
채널은 7이고 볼륨은 10입니다.
채널은 11이고 볼륨은 20입니다.
 */

public class Television {

    private int channel; // 채널 번호
    private int volume; // 볼륨
    private boolean onOff; // 전원 상태

    // 여기에 생성자를 추가하여 보자
    // 생성자는 객체가 생성될 때 객체를 초기화하는 특수한 메서드
    Television(int c, int v, boolean o) {
        channel = c;
        volume = v;
        onOff = o;
    }

    void print() {
        System.out.println("채널은 " + channel + "이고 불륨은 " + volume + "입니다.");
    }

    public static void main(String[] args) {
        Television myTv = new Television(24, 10, true);
        // Television 이라는 클래스, myTv라는 오브젝트(Television의 인스턴스), new Television은 생성자인데 여기서 위에 생성자를 초기화했으니 (24, 10, true)를 넣어준 모습이다
        myTv.print(); // 인스턴스 메소드
        Television yourTv = new Television(12, 8, true);
        // Television 이라는 클래스, youtTv라는 오브젝트(Television의 인스턴스), new Television은 생성자인데 여기서 위에 생성자를 초기화했으니 (12, 8, true)를 넣어준다
        yourTv.print();; // 인스턴스 메소드
    }
}
