package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku36 {
    public static void main(String[] args) {

    }


    public boolean isValidSudoku(char[][] board) {

        //we need horizontal map?
        //we need vertical map?
        //we need boxed map?
        Map<Integer, Set<Character>> hMap = new HashMap<>();
        Map<Integer, Set<Character>> vMap = new HashMap<>();
        Map<Integer, Set<Character>> boxMap = new HashMap<>();


        //we should be able to detect box

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char c = board[i][j];
                if (Character.isDigit(c)) {
                    //check if in horizontal line already exists this char. If yes return false (key will be j)
                    Set<Character> hSet = hMap.containsKey(j) ? hMap.get(j) : new HashSet<>();

                    //check if in vertical line already exists this char. If yes return false (key will be i)
                    Set<Character> vSet = vMap.containsKey(i) ? vMap.get(i) : new HashSet<>();

                    //check if in the box already exists this char. If yes return false (key will be from (0 to 9)). We need the method for detecting box. if(i,j -> 0-2 then 0; i,j -> )
                    int boxKey = getBoxNumber(i, j);
                    Set<Character> boxSet = boxMap.containsKey(boxKey) ? boxMap.get(boxKey) : new HashSet<>();


                    if (!boxSet.add(c)) return false;
                    if (!vSet.add(c)) return false;
                    if (!hSet.add(c)) return false;

                    //if all checks are passed we should add char in all map.
                    boxMap.put(boxKey, boxSet);
                    hMap.put(j, hSet);
                    vMap.put(i, vSet);
                }
            }
        }
        return true;
    }

    int getBoxNumber(int v, int h) {
        if (v >= 0 && v <= 2) {
            if (h >= 0) if (h <= 2) return 0;
            if (h >= 3) if (h <= 5) return 1;
            if (h >= 6) if (h <= 8) return 2;
        }
        if (v >= 3 && v <= 5) {
            if (h >= 0) if (h <= 2) return 3;
            if (h >= 3) if (h <= 5) return 4;
            if (h >= 6) if (h <= 8) return 5;
        }
        if (v >= 6 && v <= 8) {
            if (h >= 0) if (h <= 2) return 6;
            if (h >= 3) if (h <= 5) return 7;
            if (h >= 6) if (h <= 8) return 8;
        }
        return 0;
    }
}
