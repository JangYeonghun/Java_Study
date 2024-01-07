// 예제 2-5
// 간단한 예제를 작성하여 확인해 보자
public class TypeConversion {
    public static void main(String[] args) {
        int i;
        double f;

        f = 5 / 4;
        System.out.println(f); // 1.0

        f = (double) 5 / 4;
        System.out.println(f); // 1.25

        i = (int) 1.3 + (int) 1.8;
        System.out.println(i); // 2
    }
}
