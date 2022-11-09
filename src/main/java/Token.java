public class Token {
    private final String code;
    private final String value;
    public Token(String code, String value){
        this.code = code;
        this.value = value;
    }
    public Token(String code, char value){
        this.code = code;
        this.value = Character.toString(value);
    }
    public String getValue(){
        return value;
    }
    @Override
    public String toString() {return "Token{" + code + ", '" + value + "'}";}
}
