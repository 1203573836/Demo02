package Test01;
     /* （1）珠穆朗玛峰高度为8844.43米，有一张足够大的纸，厚度为0.0001米；

              （2）请问，折叠多少次后，纸的厚度可以超过珠穆朗玛峰的高度？
              (10分)反馈该题
              上传

              上一题*/
public class Dom03 {
         public static void main(String[] args) {
             int a = 1;
             int count = 0;
             //2
             for ( a = 0; a <= 88444300; a++) {//5
                 a*=2;
              count++;
             }
             System.out.println(count);
         }
}
//2