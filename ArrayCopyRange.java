package academy.devonline.java.basic.section01_setup.section06_setup;

import java.util.Arrays;

public class ArrayCopyRange {
    public static void main(String[] args) {
        int [] source = {1,-2,3,-4,5};
        int startindex = 1;
        int endindex = 3;
        int []desc = new int[endindex - startindex];
        for (int i = 0; i < desc.length; i++) {
            desc[i]=source[i + startindex];
        }
        System.out.println(Arrays.toString(desc));


    }
}
