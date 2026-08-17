package POOExercises.D_Enums.ModelClass;


public class WeekDays{
    public void showDayWeek(Days day) {
        if (day.isDUtil()) {
            System.out.println(day + " (" + day.getDescription() + ") é um dia útil.");
        } else {
            System.out.println(day + " (" + day.getDescription() + ") não é um dia útil.");
        }
    }
}
