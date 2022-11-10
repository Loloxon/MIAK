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
    public String getValue(){
        return value;
    }
    public TokenCode getCode(){
        return code;}
    @Override
    public String toString() {return "Token{" + code + ", '" + value + "'}";}
}
