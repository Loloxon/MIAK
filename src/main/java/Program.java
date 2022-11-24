import java.util.ArrayList;
import java.util.List;

public class Program {
    private final String input;
    public Program(String input){
        this.input = input;
        new Scanner(this);
    }
    public void run(){
        Token scannedToken;
        do{
            scannedToken = Scanner.scan();
//            System.out.println(scannedToken);
            scannedToken.print();
        }while (scannedToken.getCode()!=TokenCode.EOF);
    }
    public String getInput() {return input;}
    public char getInput(int idx) {return input.toCharArray()[idx];}
}
