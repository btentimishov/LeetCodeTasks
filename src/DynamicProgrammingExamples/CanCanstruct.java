package DynamicProgrammingExamples;

public class CanCanstruct {

    public static void main(String[] args) {
        CanCanstruct canCanstruct = new CanCanstruct();
        String[] arr1 = {"ab", "abc", "cd", "def", "abcd"};
        String[] arr2 = {"bo", "rd", "ate", "t", "ska", "sk", "boar"};
        String[] arr3 = {"a", "p", "ent", "enter", "ot", "o", "t"};
        String[] arr4 = {"e", "ee", "eee", "eeee", "eeeee"};
        System.out.println(canCanstruct.canConstruct("abcdef", arr1 )); //true
        System.out.println(canCanstruct.canConstruct("skateboard", arr2 )); //false
        System.out.println(canCanstruct.canConstruct("enterapotentpot", arr3 )); //true
        System.out.println(canCanstruct.canConstruct("eeeeeeeeeeeeeeeeeeeeeeef", arr4 )); //fale

    }


    private boolean canConstruct(String target, String[] wordBank) {

    }
}
