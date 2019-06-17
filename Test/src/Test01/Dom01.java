package Test01;

import java.util.Scanner;

/*通过键盘录入的方式录入一个学生的考试成绩，请根据成绩判断该学生属于哪个级别

            90-100      优秀

            80-90        好

            70-80        良

            60-70        及格

            60以下       不及格
            (10分)反馈该题
            上传

            上一题*/
public class Dom01 {
        public static void main(String[] args) {
            //3
            System.out.println("请输入成绩：");
            //5
            Scanner sc = new Scanner(System.in);
            int i1 = sc.nextInt();
            if(90<=i1&&i1<=100){
                System.out.println("优秀");
            }else if(80<=i1&&i1<=89){
                System.out.println("好");
            }else if (70<=i1&&i1<=79){
                System.out.println("良");
            } else if (60<=i1&&i1<=69){
                System.out.println("及格");
            }else if (0<=i1&&i1<=59){
                System.out.println("不及格");
            }else if (100<=i1||i1<0){
                System.out.println("输入错误！！！");//2
            }
            }

}
//10分