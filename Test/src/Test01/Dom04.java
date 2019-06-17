package Test01;

/*请分别设计求长方形面积和周长的方法，通过方法传参的方式，将长方形的长和宽传入并将结果返回，
最后将长方形的面积和周长的结果进行打印输出；

        友情提示：长方形的面积=长*宽，长方形的周长=（长+宽）*2；*/
public class Dom04 {
    public static void main(String[] args) {
        method(10, 20);
    }

    public static void method(int a, int b) {
        int c = (a + b) * 2;
        int d = a * b;
        System.out.println("周长" + c);
        System.out.println("面积" + d);
    }
}
//8