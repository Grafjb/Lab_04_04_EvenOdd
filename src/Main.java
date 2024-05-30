//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numToExamine = 2;

        String result = (numToExamine % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number " + numToExamine + " is " + result);
    }
}