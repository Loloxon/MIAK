package hussar;

import hussar.common.*;

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
                if(Objects.equals(s, "czy"))         //loops
                    return new Token(TokenCode.if_symbol, stringBuilder);
                if(Objects.equals(s, "dla"))
                    return new Token(TokenCode.for_symbol, stringBuilder);
                if(Objects.equals(s, "dopoki"))
                    return new Token(TokenCode.while_symbol, stringBuilder);

                if(Objects.equals(s, "liczba"))
                    return new Token(TokenCode.number_id, stringBuilder);
                if(Objects.equals(s, "litera"))
                    return new Token(TokenCode.char_id, stringBuilder);
                if(Objects.equals(s, "slowo"))
                    return new Token(TokenCode.string_id, stringBuilder);
                if(Objects.equals(s, "ciag"))
                    return new Token(TokenCode.array_id, stringBuilder);
                if(Objects.equals(s, "pokaz"))
                    return new Token(TokenCode.print_symbol, stringBuilder);

                return new Token(TokenCode.id_name, stringBuilder);
            }
            if (c == '.') {
                return new Token(TokenCode.dot, c);
            }
            if (c == ',') {
                return new Token(TokenCode.coma, c);
            }
            if (c == ':') {
                return new Token(TokenCode.colon, c);
            }
            if (c == '\"') {
                return new Token(TokenCode.apostrophe, c);
            }

            if (c == '+') {
                stringBuilder.append(c);
                if(lastIndex < program.getInput().length()){
                    c = program.getInput(lastIndex);
                    if(c == '+'){
                        lastIndex++;
                        return new Token(TokenCode.increment, stringBuilder);
                    }
                }
                return new Token(TokenCode.plus, stringBuilder);
            }

            if (c == '-') {
                stringBuilder.append(c);
                if(lastIndex < program.getInput().length()){
                    c = program.getInput(lastIndex);
                    if(c == '>' || c== '-'){
                        stringBuilder.append(c);
                        lastIndex++;
                    }
                }
                String s = String.valueOf(stringBuilder);

                if(Objects.equals(s, "->"))
                    return new Token(TokenCode.r_arrow, stringBuilder);
                if(Objects.equals(s, "--"))
                    return new Token(TokenCode.decrement, stringBuilder);

                return new Token(TokenCode.minus, stringBuilder);
            }
            if (c == '*') {
                return new Token(TokenCode.multiplication, c);
            }
            if (c == '^') {
                return new Token(TokenCode.power, c);
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
            if (c == '>') {
                return new Token(TokenCode.greater, c);
            }
            if (c == '<') {
                stringBuilder.append(c);
                if(lastIndex < program.getInput().length()){
                    c = program.getInput(lastIndex);
                    if(c == '-'){
                        lastIndex++;
                        return new Token(TokenCode.l_arrow, stringBuilder);
                    }
                }
                return new Token(TokenCode.lesser, stringBuilder);
            }
            if (c == '=') {
                return new Token(TokenCode.eq, c);
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