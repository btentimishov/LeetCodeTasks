package easy;

public class DefangingAnIPAddress1108 {


    public String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();
        for (char c: address.toCharArray()) {
            builder.append(c == '.' ? "[.]" : c);
        }
        return builder.toString();
    }
}
