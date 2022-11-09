import java.util.ArrayList;

public class Scanner {
    private static final ArrayList<Token> singleDigitTokens = new ArrayList<>();
    private static Program program;
    private static int lastIndex = 0;
    public Scanner(Program program){
        Scanner.program = program;
        addSingleDigitToken("plus", '+');
        addSingleDigitToken("minus", '-');
        addSingleDigitToken("multiplication", '*');
        addSingleDigitToken("divide", '/');
        addSingleDigitToken("l_brace", '(');
        addSingleDigitToken("r_brace", ')');
    }
    private void addSingleDigitToken(String code, char value){
        singleDigitTokens.add(new Token(code, value));
    }
    public static Token scan(){
        char c = program.getInput(lastIndex);
        lastIndex++;
        StringBuilder number = new StringBuilder();
        if(Character.isDigit(c)){
            number.append(c);
            while(lastIndex<program.getInput().length()){
                c = program.getInput(lastIndex);
                if(Character.isDigit(c)) {
                    number.append(c);
                    lastIndex++;
                }
                else{break;}
            }
            return new Token("number", String.valueOf(number));
        }
        for(Token SDT:singleDigitTokens){
            if(c==SDT.getValue().charAt(0)){return SDT;}
        }
        return new Token("unknown", c);
    }
    public static int getLastIndex() {
        return lastIndex;
    }
}