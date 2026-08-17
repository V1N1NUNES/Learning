package POOExercises.D_Enums.ExecutionClass;

import POOExercises.D_Enums.ModelClass.Days;
import POOExercises.D_Enums.ModelClass.WeekDays;

import java.util.Scanner;

public class WeekDaysExe {
    public static void main(String[] args) {
        Scanner r =  new Scanner(System.in);

        System.out.println("Digite de 1 a 7:");
        int option = r.nextInt();

        Days selectedDay = Days.values()[option];

        if (selectedDay != null) {
            WeekDays weekDays = new WeekDays();
            weekDays.showDayWeek(selectedDay);
        } else {
            System.out.println("Número inválido! Escolha apenas de 1 a 7.");
        }

    }
}
