package hussar.common;

public enum TokenCode {
    plus(Color.RESET.colorCode, "+"),
    increment(Color.RESET.colorCode, "++"),
    minus(Color.RESET.colorCode, "-"),
    decrement(Color.RESET.colorCode, "--"),
    multiplication(Color.RESET.colorCode, "*"),
    divide(Color.RESET.colorCode, "/"),
    power(Color.RESET.colorCode, "**"),

    eq(Color.RESET.colorCode, " = "),
    lesser(Color.RESET.colorCode, "<"),
    greater(Color.RESET.colorCode, ">"),


    l_bracket(Color.PURPLE.colorCode, "("),
    r_bracket(Color.PURPLE.colorCode, ")"),
    l_buckle(Color.RESET.colorCode, "{"),
    r_buckle(Color.RESET.colorCode, "}"),

    number(Color.RESET.colorCode, ""),
    id_name(Color.YELLOW.colorCode, ""),

    number_id(Color.RED.colorCode, "int "),
    string_id(Color.RED.colorCode, "String "),
    char_id(Color.RED.colorCode, "Char "),
    array_id(Color.RED.colorCode, "List "),

    if_symbol(Color.CYAN.colorCode, "if("),
    for_symbol(Color.GREEN.colorCode, "for("),
    while_symbol(Color.BLUE.colorCode, "while("),
    print_symbol(Color.BLUE.colorCode, "System.out.print"),

    dot(Color.CYAN.colorCode, ";\n}"),
    coma(Color.CYAN.colorCode, ";\n"),
    colon(Color.CYAN.colorCode, "){\n"),
    apostrophe(Color.CYAN.colorCode, "\""),
    r_arrow(Color.CYAN.colorCode, ""),
    l_arrow(Color.CYAN.colorCode, ""),

    unknown(Color.PURPLE_BACKGROUND.colorCode, ""),
    blank(Color.RESET.colorCode, " "),
    EOF(Color.RESET.colorCode, "");

    final String printColor;
    final String javaVersion;
    TokenCode(String printColor, String javaVersion) {
        this.printColor = "\u001B[" + printColor + "m";
        this.javaVersion = javaVersion;
    }
}
