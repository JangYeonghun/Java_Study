// Programming Exercise 10
// {1.0, 2.0, 3.0, 4.0}과 같은 초기값을 가지는 double형의 배열 생성
// 모든 배열 요소를 출력한 후에 모든 요소를 더하여 합을 출력하고, 요소 중에서 가장 큰 값을 찾아서 출력하는 프로그램 작성
/*
실행 결과
1.0 2.0 3.0 4.0
합은 10.0
최대값은 4.0
 */
public class Test7 {
    public static void main(String[] args) {
        double sum = 0, max = 0, num, nextNum = 0;
        double[] numList = {1.0, 2.0, 3.0, 4.0};
        
        for (int i = 0; i < numList.length; i++) {
            System.out.print(numList[i] + " ");
            sum += numList[i];
            
            num = numList[i];
            if (num >= nextNum) {
                max = num;
            } else {
                max = nextNum;
            }
            nextNum = numList[i];
        }
        System.out.println("\n합은 " + sum);
        System.out.println("최대값은 " + max);
    }
}
