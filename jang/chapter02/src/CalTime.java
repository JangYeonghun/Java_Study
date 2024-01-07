// 예제 2-3
// 지구에서 태양 다음으로 가장 가까운 별 센타우리 별까지 빛의 속도로 걸리는 시간을 구해보자
// 센타우리는 지구로부터 40 * 10^12 km 떨어져 있다
// 빛의 속도는 300000 km/sec 이다
// 천문학에서 사용하는 숫자들은 매우 크기 때문에 double을 쓴다 40 * 10^12km는 40e12로 표현하는 것이 편리하다
// 실행 결과: 걸리는 시간은 4.227972264501945광년입니다.
public class CalTime {
    public static void main(String[] args) {
        final double distance = 40e12;
        final double lightSpeed = 300000;
        final double year = 60 * 60 * 24 * 365;

        double calcTime = distance / (lightSpeed * year);
        System.out.println("걸리는 시간은 " + calcTime + "광년입니다.");
    }
}