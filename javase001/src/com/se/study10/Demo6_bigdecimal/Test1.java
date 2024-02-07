package com.se.study10.Demo6_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test1 {
    public static void main(String[] args) {
        //计算精度损失
        System.out.println(0.1 + 0.2);      //0.30000000000000004
        System.out.println(1.0 - 0.32);     //0.6799999999999999
        System.out.println(1.015 * 100);    //101.49999999999999
        System.out.println(1.301 / 100);    //0.013009999999999999
        double a = 0.1;
        double b = 0.2;

        // 1、把浮点型数据封装成BigDecimal对象，再来参与运算。
        // a、public BigDecimal(double val) 得到的BigDecimal对象是无法精确计算浮点型数据的。 注意：不推荐使用这个，
        // b、public BigDecimal(String val)  得到的BigDecimal对象是可以精确计算浮点型数据的。 可以使用。
        // c、public static BigDecimal valueOf(double val): 通过这个静态方法得到的BigDecimal对象是可以精确运算的。是最好的方案。
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);

        // 2、public BigDecimal add(BigDecimal augend): 加法
        BigDecimal c1 = a1.add(b1);
        System.out.println(c1);

        // 3、public BigDecimal subtract(BigDecimal augend): 减法
        BigDecimal c2 = a1.subtract(b1);
        System.out.println(c2);

        // 4、public BigDecimal multiply(BigDecimal augend): 乘法
        BigDecimal c3 = a1.multiply(b1);
        System.out.println(c3);

        // 5、public BigDecimal divide(BigDecimal b): 除法
        BigDecimal c4 = a1.divide(b1);
        System.out.println(c4);

        // 6、public BigDecimal divide(另一个BigDecimal对象，精确几位，舍入模式) : 除法，可以设置精确几位。
        BigDecimal d1 = BigDecimal.valueOf(0.1);
        BigDecimal d2 = BigDecimal.valueOf(0.3);
        BigDecimal d3 = d1.divide(d2,2, RoundingMode.HALF_UP);
        System.out.println(d3);

        // 7、public double doubleValue() : 把BigDecimal对象又转换成double类型的数据。
        double db1=c1.doubleValue();
        double db2=d3.doubleValue();
        printDouble(db1);
        printDouble(db2);
    }
    public static void printDouble(Double d){
        System.out.println(d);
    }
}
