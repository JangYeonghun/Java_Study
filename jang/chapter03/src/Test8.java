// Programming exercise 11
// "Hello", "Java", "World" 를 가지고 있는 문자열의 배열을 생성해서 출력해보자
/*
실행 결과
Hello
Java
World
 */
public class Test8 {
    public static void main(String[] args) {
        String[] coding = {"Hello", "Java", "World"};

        for (int i = 0; i < coding.length; i++) {
            System.out.println(coding[i]);
        }
    }
}
