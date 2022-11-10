public class Scanner {
    private static Program program;
    private static int lastIndex = 0;
    public Scanner(Program program){
        Scanner.program = program;
    }
    public static Token scan(){
        try {
            char c = program.getInput(lastIndex);
            lastIndex++;
            StringBuilder number = new StringBuilder();
            if (Character.isDigit(c)) {
                number.append(c);
                while (lastIndex < program.getInput().length()) {
                    c = program.getInput(lastIndex);
                    if (Character.isDigit(c)) {
                        number.append(c);
                        lastIndex++;
                    } else {
                        break;
                    }
                }
                return new Token(TokenCode.number, String.valueOf(number));
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
            return new Token(TokenCode.unknown, c);
        }
        catch (ArrayIndexOutOfBoundsException e){
            return new Token(TokenCode.EOF, "EOF");
        }
    }
}