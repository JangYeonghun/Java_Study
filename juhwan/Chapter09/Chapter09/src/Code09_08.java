import java.util.Arrays;
import java.util.Collections;
public class Code09_08 {
    public static void main(String[] args){
        int[] numAry = {33,99,11,77,22,88,66,44};
        Arrays.sort(numAry); // 오름차순정렬
            for(int data: numAry){ // 배열
                System.out.print(data + " ");
            }
            System.out.println(); //엔터
            String[] strAry = {"한빛","아카데미","난생","자바","열공"};
            Arrays.sort(strAry,Collections.reverseOrder()); //내림차순정렬
            for (String data : strAry){
                System.out.print(data + " ");
        }
    }
}
