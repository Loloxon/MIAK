public class Token {
    private final TokenCode code;
    private final String value;
    public Token(TokenCode code, String value){
        this.code = code;
        this.value = value;
    }
    public Token(TokenCode code, char value){
        this.code = code;
        this.value = Character.toString(value);
    }
    public Token(TokenCode code, StringBuilder value) {
        this.code = code;
        this.value = String.valueOf(value);
    }
    public String getValue(){
        return value;
    }
    public TokenCode getCode(){return code;}
    @Override
    public String toString() {return "Token{" + code + ", '" + value + "'}";}

    public void print(){
        if(code!=TokenCode.EOF) {
            System.out.print(code.printColor + value + "\u001B[0m");
        }
    }
}
