import java.util.Arrays;
import java.util.Collections;
public class Code09_09 {
    public static void main(String[] args){
        String[] strAry = {"해린","혜인","하니","민지","다니엘"};
        System.out.println("원본 : " + Arrays.toString(strAry));
        //Arrays.toString(배열명) => 배열 전체값을 하나의 문자열로 만들어줌

        Collections.reverse(Arrays.asList(strAry)); //Collections.reverse => 배열 반전
                                                    // Arrays.asList => 배열을 '리스트'라는 자료형으로 변환

        System.out.println("역순 : " + Arrays.toString(strAry));
    }
}
