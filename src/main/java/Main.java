import org.apache.commons.lang3.StringUtils;
import util.Input;

public class Main {
    public static void main(String[] args) {

        Input input = new Input();
        // todo 3 a) Tell us if the text entered is aNum.
        System.out.println("Enter a number: ");
        System.out.println("StringUtils.isNumeric(input.getString()) = " + StringUtils.isNumeric(input.getString()));

        // todo 3 b) Flip the case of String. For ex) "Hello World" -> "hELLO wORLD"
        System.out.println("Enter your name: ");
        StringUtils.swapCase(input.getString());

        // todo 3 c) Reverses the String
        System.out.println("Reverse?");
        System.out.println("StringUtils.reverse(input.getString()) = " + StringUtils.reverse(input.getString()));

    }
}
