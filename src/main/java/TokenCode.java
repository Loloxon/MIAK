//        final String ANSI_RESET = "\u001B[0m";
//        final String ANSI_BLACK = "\u001B[30m";
//        final String ANSI_RED = "\u001B[31m";
//        final String ANSI_GREEN = "\u001B[32m";
//        final String ANSI_YELLOW = "\u001B[33m";
//        final String ANSI_BLUE = "\u001B[34m";
//        final String ANSI_PURPLE = "\u001B[35m";
//        final String ANSI_CYAN = "\u001B[36m";
//        final String ANSI_WHITE = "\u001B[37m";
//
//        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
//        final String ANSI_RED_BACKGROUND = "\u001B[41m";
//        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
//        final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
//        final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
//        final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
//        final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
//        final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

public enum TokenCode {
    plus("\u001B[0m"),
    minus("\u001B[0m"),
    multiplication("\u001B[0m"),
    divide("\u001B[0m"),
    l_bracket("\u001B[0m"),
    r_bracket("\u001B[0m"),
    number("\u001B[0m"),
    unknown("\u001B[0m"),
    ident("\u001B[36m"),
    if_symbol("\u001B[31m"),
    for_symbol("\u001B[32m"),
    while_symbol("\u001B[33m"),
    l_buckle("\u001B[0m"),
    r_buckle("\u001B[0m"),
    blank("\u001B[0m"),
    EOF("\u001B[0m");

    final String printColor;
    
    private TokenCode(String printColor) {
        this.printColor = printColor;
    }
}
