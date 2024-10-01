package scope;

public class Scope3_2 {

    public static void main(String[] args) {
        int m = 10;
//        int temp = 0;   //비효율적인 메모리 사용 (if안에서 사용하면됨), 코드 복잡성 증가
        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
        System.out.println("temp = " + temp);

    }
}
