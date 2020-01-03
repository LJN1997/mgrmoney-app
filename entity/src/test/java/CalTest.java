import org.junit.Test;

import java.math.BigDecimal;

public class CalTest {
    public static void main(String[] args) {
        System.out.println(0.05+0.01); //0.060000000000000005
        System.out.println(1-0.42); //0.5800000000000001
        System.out.println(4.015*100);//401.49999999999994
        System.out.println(123.3/100);//1.2329999999999999
    }
    @Test
    public void testCal(){
        //--加数
        BigDecimal a = BigDecimal.valueOf(1.0);
        BigDecimal b = BigDecimal.valueOf(0.42);
        System.out.println(a.subtract(b).doubleValue());//0.58

    }
}
