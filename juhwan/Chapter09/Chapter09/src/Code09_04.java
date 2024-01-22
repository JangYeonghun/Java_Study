public class Code09_04 {
    public static void main(String[] args){
        int ary1[] = {100,200,300,400}; // 배열을 선언하는 동시에 직접 초깃값을 대입
        int ary2[] = new int[]{100,200,300}; // 배열을 선언하는 동시에 new연산자와 함께 초깃값을 대입
        int ary3[]; // 배열을 선언한 후
        ary3 = new int[]{100,200}; //초깃값을 대입
        int[] ary4 = new int[1]; // 배열을 선언하는 동시에 크기를 1로 지정한 후
        ary4[0]=100; // 값을 대입

        for (int i = 0 ;i<4;i++)
            System.out.printf("ary1[%d]==>%d\t",i,ary1[i]);
        System.out.println();

        for (int i = 0 ;i<3;i++)
            System.out.printf("ary2[%d]==>%d\t",i,ary2[i]);
        System.out.println();

        for (int i = 0 ;i<2;i++)
            System.out.printf("ary3[%d]==>%d\t",i,ary3[i]);
        System.out.println();

        for (int i = 0 ;i<1;i++)
            System.out.printf("ary4[%d]==>%d\t",i,ary4[i]);
        System.out.println();
    }
}
