package POOExercises.B_Methods;

public class Floatation {
    //Attributes
    private float Value;
    private double totalValue;
    private float portion;
    private int months;
    private static float monthlyRate = 0.022f;

    //Constructors

    //Get and set methods
    public void setValue(float value) {
        Value = value;
    }

    public float getValue() {
        return Value;
    }
    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    //Other methods
    public void financingCalculator(float value, int months){
         this.totalValue = value * Math.pow(1 + monthlyRate, months);

        this.portion = (float) (totalValue / months);

        showResultFloatation();
    }

    public void showResultFloatation(){
        System.out.println("Value: R$" + this.Value);
        System.out.println("MonthlyRate : " + monthlyRate + "% ao mês");
        System.out.println("Portion: R$" + this.portion);
        System.out.println("Months: " + this.months + "x");
        System.out.println("Total Value: " + this.totalValue);
    }
}
