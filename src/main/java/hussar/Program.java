package hussar;


import hussar.common.*;

import java.util.ArrayList;

public class Program {
    private final String input;
    public Program(String input){
        this.input = input;
        new Scanner(this);
    }
    public void run(){
        Token scannedToken;
        ArrayList<Token> scannedTokens = new ArrayList<>();
        do{
            scannedToken = Scanner.scan();
            scannedTokens.add(scannedToken);
            scannedToken.print();
        }while (scannedToken.getCode()!= TokenCode.EOF);
        scannedTokens.forEach(Token::printJV);
    }
    public String getInput() {return input;}
    public char getInput(int idx) {return input.toCharArray()[idx];}
}
