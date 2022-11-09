import java.util.ArrayList;

public class Main {
    public static String input = "";
    public static void main(String[] args){
        input = "8+4*45-(5*3)";
        Scaner scaner = new Scaner(this);
        ArrayList<Token> input_tokens = scaner.Scan(input);
        for (Token input_token : input_tokens) {
            System.out.println(input_token);
        }
    }
}
