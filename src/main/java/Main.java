public class Main {
    public static void main(String[] args){
        String input;
//        input = "8+4*45-(5*3)";
        input = "for(while i=4 iff*545)";
        System.out.println(input);
        Program program = new Program(input);
        program.run();
    }
}
