import java.util.ArrayList;

public class Scanner {
    private static final ArrayList<Token> librarySingleDigit = new ArrayList<>();
    static Program program;
    static int lastIndex = 0;
    public Scanner(Program program){
        Scanner.program = program;
        librarySingleDigit.add(new Token("plus", "+"));
        librarySingleDigit.add(new Token("minus", "-"));
        librarySingleDigit.add(new Token("multiplication", "*"));
        librarySingleDigit.add(new Token("divide", "/"));
        librarySingleDigit.add(new Token("l_brace", "("));
        librarySingleDigit.add(new Token("r_brace", ")"));
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
        for(Token SDT:librarySingleDigit){
            if(c==SDT.getValue().charAt(0)){
                return SDT;
            }
        }
        return new Token("unknown", c);
    }
    public static int getLastIndex() {
        return lastIndex;
    }

}
