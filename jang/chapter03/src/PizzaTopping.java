// 예제 3-14
// 5가지 피자 토핑의 종류를 문자열 배열에 저장하고 배열에 저장된 문자열을 꺼내서 화면에 출력해 보자
/*
실행 결과
Pepperoni Mushrooms Onions Sausage Bacon
 */
public class PizzaTopping {
    public static void main(String[] args) {
        String[] toppings = {"Pepperoni", "Mushromms", "Onions", "Sausage", "Bacon"};

        for (int i = 0; i < toppings.length; i++) {
            System.out.print(toppings[i] + " ");
        }

        // 10개의 실수를 저장하여 출력하여 보자
        double[] actualNum = new double[10];

        for (int i = 0; i < actualNum.length; i++) {
            double randNum = Math.random() * 100;
            actualNum[i] = randNum;

            System.out.print(actualNum[i] + " ");
        }
    }
}
