public class CalculateAmountPaidinTaxes {

    public static void main(String[] args) {
        CalculateAmountPaidinTaxes t = new CalculateAmountPaidinTaxes();
        int brackets[][] = { { 3, 50 }, { 7, 10 }, { 12, 25 } };
        int income = 10;
        System.out.println(t.calctax(brackets, income));
    }

    public double calctax(int[][] brackets, int income) {
        int prevamount = 0, i = 0;
        double tax = 0;
        while (i < brackets.length) {
            int earning = Math.min(brackets[i][0], income) - prevamount;
            tax += earning * brackets[i][1] / 100.0;
            prevamount = brackets[i][0];
            if (brackets[i][0] >= income) {
                break;
            }
            i++;
        }
        return tax;
    }
}
