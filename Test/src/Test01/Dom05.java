package Test01;

import java.util.Arrays;
import java.util.Random;

/*（1）在编程竞赛中，有10位评委随机为参赛的选手打分

        （2）求选手的最后得分（去掉一个最高分和一个最低分后其余8位评委打分的平均值）

        （3）随机分数范围：0~10，包含0和10
        (10分)反馈该题
        上传

        上一题*/
public class Dom05 {
    public static void main(String[] args) {
        //3
        int[] array = new int[10];
        Random r = new Random();
        int max = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int i1 = r.nextInt(11);
            array[i] = i1;
            count+=array[i];
            if (array[i] > max) {
                max = array[i];
            }

        }//6
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
       /* System.out.println(Arrays.toString(array));
        System.out.println(max);
        System.out.println(min);*/
        System.out.println("平均分" + (count-max-min)/(array.length-2));
    }
}
