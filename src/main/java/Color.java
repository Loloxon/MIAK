public enum Color {
    RESET("0"),
    BLACK("30"),
    RED("31"),
    GREEN("32"),
    YELLOW("33"),
    BLUE("34"),
    PURPLE("35"),
    CYAN("36"),
    WHITE("37"),

    BLACK_BACKGROUND("40"),
    RED_BACKGROUND("41"),
    GREEN_BACKGROUND("42"),
    YELLOW_BACKGROUND("43"),
    BLUE_BACKGROUND("44"),
    PURPLE_BACKGROUND("45"),
    CYAN_BACKGROUND("46"),
    WHITE_BACKGROUND("47");

    final String colorCode;
    private Color(String colorCode) {
        this.colorCode = colorCode;
    }
}
