
public class Program {
    private final String input;
    public Program(String input){
        this.input = input;
        new Scanner(this);
    }
    public void run(){
        while(Scanner.getLastIndex()<input.length()) {
            Token scannedToken = Scanner.scan();
            System.out.println(scannedToken);
        }
    }
    public String getInput() {return input;}
    public char getInput(int idx) {return input.toCharArray()[idx];}
}
