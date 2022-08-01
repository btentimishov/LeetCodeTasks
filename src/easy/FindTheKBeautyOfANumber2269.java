package easy;

public class FindTheKBeautyOfANumber2269 {
    public static void main(String[] args) {
        FindTheKBeautyOfANumber2269 find = new FindTheKBeautyOfANumber2269();

        System.out.println("Final output is: " + find.divisorSubstrings(240, 2));
        System.out.println("Final output is: " + find.divisorSubstrings(430043, 2));
    }


    public int divisorSubstrings(int num, int k) {

        String s = String.valueOf(num);

        int value = Integer.parseInt(s.substring(0, k));
        int result = num % value == 0 ? 1 : 0;

        for (int i = 1; i <= s.length() - k; i++) {

            String window = s.substring(i, i + k);
            value = Integer.parseInt(window);
            if (value == 0) continue;

            if (num % value == 0) result++;
        }
        return result;

    }
}
