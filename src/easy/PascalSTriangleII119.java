package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalSTriangleII119 {

    public static void main(String[] args) {
        PascalSTriangleII119 pascal = new PascalSTriangleII119();
        System.out.println(pascal.getRow(4));
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer[]> list = new ArrayList<>();
        Integer[] arr1 = {1};
        Integer[] arr2 = {1, 1};
        list.add(arr1);
        list.add(arr2);


        int i = 2;
        while (i <= rowIndex) {
            Integer[] tempArr = new Integer[i + 1];
            int j = 0;
            while (j < i + 1) {
                if ((j == 0) || (j == i)) {
                    tempArr[j] = 1;
                } else if (j == 1 || j == i - 1) {
                    tempArr[j] = i;
                } else {
                    Integer[] prevArr = list.get(i-1);
                    tempArr[j] = prevArr[j] + prevArr[j - 1];
                }
                j++;
            }
            list.add(tempArr);
            i++;
        }

        return Arrays.asList(list.get(rowIndex));
    }

}
