package POOExercises.D_Enums.ModelClass;

public enum Days {
    SUNDAY(1, "It's Sunday day", false),
    MONDAY(2, "It's time for working again...", true),
    TUESDAY(3, "Heya... watever", true),
    WEDNESDAY(4, "watever two", true),
    THURSDAY(5, "Hmmmm...", true),
    FRIDAY(6, "YESSSS BABY", true),
    SATURDAY(7, "😎", false);

    //attributes
    private int day;
    private String description;
    private boolean dUtil;

    //constructor
    Days(int value, String descricao, boolean util) {
        this.day = value;
        this.description = descricao;
        this.dUtil = util;
    }

    //methods
    public int getDay() {
        return day;
    }
    public String getDescription() {
        return description;
    }
    public boolean isDUtil() {
        return dUtil;
    }

    public static Days getByNumero(int numero) {
        for (Days day : Days.values()) {
            if (day.getDay()     == numero) {
                return day;
            }
        }
        return null; // Retorna null se for um número inválido (ex: 8)
    }
}
