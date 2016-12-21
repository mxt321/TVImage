package net.bjyfkj.caa.util;

import net.bjyfkj.caa.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YFKJ-1 on 2016/12/10.
 */

public class addLocalImgUtil {

    public static List<Integer> getlocalImages(int positon) {
        List<Integer> localImages = new ArrayList<>();
        switch (positon) {
            case 0://负一层（1）
                localImages.add(R.drawable.a1_1);
                localImages.add(R.drawable.a1_2);
                localImages.add(R.drawable.a1_3);
                localImages.add(R.drawable.a1_4);
                localImages.add(R.drawable.a1_5);
                break;
            case 1://负一层（2）
                localImages.add(R.drawable.a1_1);
                localImages.add(R.drawable.a1_2);
                localImages.add(R.drawable.a1_3);
                localImages.add(R.drawable.a1_4);
                localImages.add(R.drawable.a1_5);
                break;
            case 2://负一层（3）
                localImages.add(R.drawable.a2_1);
                localImages.add(R.drawable.a2_2);
                localImages.add(R.drawable.a2_3);
                break;
            case 3://负一层（4）
                localImages.add(R.drawable.nullpic);
                break;
            case 4://负一层（5）
                localImages.add(R.drawable.nullpic);
                break;
            case 5://一层（1）
                localImages.add(R.drawable.b1_1);
                localImages.add(R.drawable.b1_2);
                localImages.add(R.drawable.b1_3);
                break;
            case 6://一层（2）
                localImages.add(R.drawable.b2_1);
                localImages.add(R.drawable.b2_2);
                localImages.add(R.drawable.b2_3);
                break;
            case 7://一层（3）
                localImages.add(R.drawable.b3_1);
                localImages.add(R.drawable.b3_2);
                localImages.add(R.drawable.b3_3);
                break;
            case 8://一层（4）
                localImages.add(R.drawable.b4_1);
                localImages.add(R.drawable.b4_2);
                localImages.add(R.drawable.b4_3);
                break;
            case 9://一层（5）
                localImages.add(R.drawable.b5_1);
                localImages.add(R.drawable.b5_2);
                localImages.add(R.drawable.b5_3);
                localImages.add(R.drawable.b5_4);
                break;
            case 10://二层（1）
                localImages.add(R.drawable.c1_1);
                localImages.add(R.drawable.c1_2);
                localImages.add(R.drawable.c1_3);
                break;
            case 11://二层（2）
                localImages.add(R.drawable.c2_1);
                localImages.add(R.drawable.c2_2);
                localImages.add(R.drawable.c2_3);
                break;
            case 12://二层（3）
                localImages.add(R.drawable.c3_1);
                localImages.add(R.drawable.c3_2);
                localImages.add(R.drawable.c3_3);
                break;
            case 13://二层（4）
                localImages.add(R.drawable.c4_1);
                localImages.add(R.drawable.c4_2);
                localImages.add(R.drawable.c4_3);
                break;
            case 14://二层（5）
                localImages.add(R.drawable.c5_1);
                localImages.add(R.drawable.c5_2);
                localImages.add(R.drawable.c5_3);
                break;
            case 15://三层（1）
                localImages.add(R.drawable.d1_1);
                localImages.add(R.drawable.d1_2);
                localImages.add(R.drawable.d1_3);
                break;
            case 16://三层（2）
                localImages.add(R.drawable.d2_1);
                localImages.add(R.drawable.d2_2);
                localImages.add(R.drawable.d2_3);
                break;
            case 17://三层（3）
                localImages.add(R.drawable.d3_1);
                localImages.add(R.drawable.d3_2);
                localImages.add(R.drawable.d3_3);
                break;
            case 18://三层（4）
                localImages.add(R.drawable.d4_1);
                localImages.add(R.drawable.d4_2);
                break;
            case 19://三层（5）
                localImages.add(R.drawable.d5_1);
                localImages.add(R.drawable.d5_2);
                break;
        }
        return localImages;
    }


}
