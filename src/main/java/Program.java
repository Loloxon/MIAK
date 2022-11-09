
public class Program {
    String input;
    Scanner scanner;
    public Program(String input){
        this.input = input;
        scanner = new Scanner(this);
    }
    public void run(){
        while(Scanner.getLastIndex()<input.length()) {
            Token scannedToken = Scanner.scan();
            System.out.println(scannedToken);
        }
    }
    public String getInput() {
        return input;
    }
    public char getInput(int idx) {
        char[] inputAsArray = input.toCharArray();
        return inputAsArray[idx];
    }
}
