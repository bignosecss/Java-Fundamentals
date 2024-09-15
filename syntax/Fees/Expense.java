public class Expense {
    
    /**
     * These variables are the monthly enpenses.
     */
    double eat;
    double wear;
    double live;
    double transportation;

    public Expense(double e, double w, double l, double t) {
        this.eat = e;
        this.wear = w;
        this.live = l;
        this.transportation = t;
    }

    /**
     * Calculate the total expenses per month.
     * @param E
     * @return
     */
    public static double calcTotalMonthly(Expense E) {
        return E.eat + E.wear + E.live + E.transportation;
    }
}
