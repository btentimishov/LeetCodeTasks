package DailyByteTasks;

/*

This question is asked by Amazon. Given a string representing the sequence of moves a robot vacuum makes, return whether or not it will return to its original position. The string will only contain L, R, U, and D characters, representing left, right, up, and down respectively.

Ex: Given the following strings...

"LR", return true
"URURD", return false
"RUULLDRD", return true

* */
public class VacuumCleanerRoute {

    public static void main(String[] args) {
        String s1 = "LR";
        String s2 = "URURD";
        String s3 = "RUULLDRD";


        System.out.println(isVCHome(s1));
        System.out.println(isVCHome(s2));
        System.out.println(isVCHome(s3));

    }

    static boolean isVCHome(String route) {
        String[] arr = route.split("");
        //every time vacuum cleaner moves right we plus +1 to rightLeftState and every time vacuum cleaner moves left we minus -1 to rightLeftState
        int rightLeftState = 0;
        //every time vacuum cleaner moves up we plus +1 to upDownState and every time vacuum cleaner moves down we minus -1 to upDownState
        int upDownState = 0;


        for (String s : arr) {
            switch (s) {
                case "R" -> rightLeftState++;
                case "L" -> rightLeftState--;
                case "U" -> upDownState++;
                case "D" -> upDownState--;
            }
        }


        return upDownState == 0 && rightLeftState == 0;
    }
}
