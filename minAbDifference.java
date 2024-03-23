import java.util.*;
public class minAbDifference {
    public static void main(String[] args) {
        int val1[] = {2,3,1,7};
        int val2[] = {9,7,4,2};

        Arrays.sort(val1);
        Arrays.sort(val2);

        for(int i = 0 ; i<val1.length ; i++){
            for (int j = 0 ; j<val2.length ; j++){
                int diff[] = new int[]{val1[i] - val2[j]};

                for(int n =0 ; n<diff.length ; n++){
                    System.out.println(n);
                }
            }

        }



    }
}
