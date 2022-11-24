public enum TokenCode {
    plus(Color.RESET.colorCode),
    minus(Color.RESET.colorCode),
    multiplication(Color.RESET.colorCode),
    divide(Color.RESET.colorCode),
    l_bracket(Color.PURPLE.colorCode),
    r_bracket(Color.PURPLE.colorCode),
    number(Color.RESET.colorCode),
    unknown(Color.RESET.colorCode),
    ident(Color.YELLOW.colorCode),
    if_symbol(Color.CYAN.colorCode),
    for_symbol(Color.GREEN.colorCode),
    while_symbol(Color.BLUE.colorCode),
    l_buckle(Color.RESET.colorCode),
    r_buckle(Color.RESET.colorCode),
    blank(Color.WHITE_BACKGROUND.colorCode),
    EOF(Color.RESET.colorCode);

    final String printColor;
    private TokenCode(String printColor) {
        this.printColor = "\u001B[" + printColor + "m";
    }
}
