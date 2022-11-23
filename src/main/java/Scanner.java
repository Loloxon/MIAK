import java.util.Objects;

public class Scanner {
    private static Program program;
    private static int lastIndex = 0;
    public Scanner(Program program){
        Scanner.program = program;
    }
    public static Token scan(){
        try {
            char c = program.getInput(lastIndex);
            StringBuilder stringBuilder = new StringBuilder();
            lastIndex++;

            if (Character.isDigit(c)) {             //digit
                stringBuilder.append(c);
                while (lastIndex < program.getInput().length()) {
                    c = program.getInput(lastIndex);
                    if (Character.isDigit(c)) {
                        stringBuilder.append(c);
                        lastIndex++;
                    } else {
                        break;
                    }
                }
                return new Token(TokenCode.number, String.valueOf(stringBuilder));
            }
            if (Character.isLetter(c)) {            //identificator
                stringBuilder.append(c);
                while (lastIndex < program.getInput().length()) {
                    c = program.getInput(lastIndex);
                    if (Character.isLetter(c) || Character.isDigit(c)) {
                        stringBuilder.append(c);
                        lastIndex++;
                    } else {
                        break;
                    }
                }
                String s = String.valueOf(stringBuilder);
                if(Objects.equals(s, "if"))         //loops
                    return new Token(TokenCode.if_symbol, stringBuilder);
                if(Objects.equals(s, "for"))
                    return new Token(TokenCode.for_symbol, stringBuilder);
                if(Objects.equals(s, "while"))
                    return new Token(TokenCode.while_symbol, stringBuilder);
                return new Token(TokenCode.ident, stringBuilder);
            }
            if (c == '+') {
                return new Token(TokenCode.plus, c);
            }
            if (c == '-') {
                return new Token(TokenCode.minus, c);
            }
            if (c == '*') {
                return new Token(TokenCode.multiplication, c);
            }
            if (c == '/') {
                return new Token(TokenCode.divide, c);
            }
            if (c == '(') {
                return new Token(TokenCode.l_bracket, c);
            }
            if (c == ')') {
                return new Token(TokenCode.r_bracket, c);
            }
            if (c == '{') {
                return new Token(TokenCode.l_buckle, c);
            }
            if (c == '}') {
                return new Token(TokenCode.r_buckle, c);
            }
            if (c == ' '){
                return new Token(TokenCode.blank, c);
            }
            return new Token(TokenCode.unknown, c);
        }
        catch (ArrayIndexOutOfBoundsException e){
            return new Token(TokenCode.EOF, "EOF");
        }
    }
}