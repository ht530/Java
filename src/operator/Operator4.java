package operator;
/*
연산자 우선순위 외우려고 하지말고 상식선에서 생각하고 애매하면 괄호를 사용
누구나 코드를 보고 쉽고 명확하게 이해할 수 있어야 한다.
복잡하면 명확하게 괄호를 넣어라
개발에서 가장 중요한 것은 단순함과 명확함이다! 애매하거나 복잡하면 안된다
 */
public class Operator4 {

    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;   //(2*2) + (3*3)
        int sum4 = (2 * 2) + (3 * 3);   //sum3 같다
        System.out.println("sum4 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }
}
