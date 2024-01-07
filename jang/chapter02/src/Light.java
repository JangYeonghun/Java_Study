// 예제 2-1
// 빛이 1년 동안 진행하는 거리를 게산해 보자. long형의 정수 변수를 사용하여야 한다.
// 빛의 속도는 초당 300000km 이다.
// 실행 결과: 빛이 1년 동안 가는 거리 : 9460800000000 km.
public class Light {
    public static void main(String[] args) {
    final long lightSpeed = 300000;
    long distance;

    distance = 60 * 60 * 24 * 365 * lightSpeed;

        System.out.println("빛이 1년 동안 가는 거리 : " + distance + " km.");
    }
}
