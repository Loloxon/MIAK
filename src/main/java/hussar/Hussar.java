package hussar;

public class Hussar {
    public static void main(String[] args){
        String input;
//        input = "8+4*45-(5*3)";
        input = "dopoki liczba x = 4 < 14: slowo witajSwiecie = \"Hello world\", pokaz(witajSwiecie + x), x --.";
        System.out.println(input);
        Program program = new Program(input);
        program.run();
    }
}
