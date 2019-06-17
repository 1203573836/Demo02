package Test01;
/*1）打印出四位数字中个位+百位=十位+千位并且个位数为偶数，千位数为奇数的数字,
        并打印出符合条件的数字和个数(按照以下加粗字体格式输出：符合条件的数字,每行显示5个,用空格隔开）

        （2）打印格式：

        1012 1034 1056 1078 1100

        1122 1144 1166 1188 1210

        //……

        符合条件的数字总共有: 165个*/
public class Dom02 {
    public static void main(String[] args) {
        int count =0;
        //4
        for (int i = 1000; i < 10000; i++) {
            int ge =i%10;
            int shi =i/10%10;
            int bai = i/100%10;
            int qian =i/1000%10;
            if(ge+bai==shi+qian&&ge%2==0&&qian%2!=0){
                count++;
                if (count%5==0){//4
                    System.out.println(i);
                }else {
                    System.out.print(i+" ");
                }
            }

        }

        System.out.println("符合条件的共有"+count+"个");
    }
}
