import java.util.function.Predicate;

public class Token {
    public String code;
    public String value;
    public Token(String code, String value){
        this.code = code;
        this.value = value;
    }

    public boolean isToken(){
        return true;
    }

    @Override
    public String toString() {
        return "Token{" +
                "code='" + code + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
