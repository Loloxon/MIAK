import java.util.ArrayList;
import java.util.List;

public class Program {
    private final String input;
    public Program(String input){
        this.input = input;
        new Scanner(this);
    }
    public void run(){
        Token scannedToken;
        List<Token> scannedTokens = new ArrayList<>();
        do{
            scannedToken = Scanner.scan();
            scannedTokens.add(scannedToken);
            System.out.println(scannedToken);
        }while (scannedToken.getCode()!=TokenCode.EOF);
        printFormatted(scannedTokens);
    }
    private void printFormatted(List<Token> tokens){
        tokens.forEach(Token::print);
    }
    public String getInput() {return input;}
    public char getInput(int idx) {return input.toCharArray()[idx];}
}
