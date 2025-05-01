package taxes;

public class UsnDebCrTax extends TaxSystem{
        public int calcTaxFor(int debit, int credit) {
            int profit = debit - credit;
            int tax = (int) (profit * 0.15);
            return Math.max(tax, 0);}
    }
