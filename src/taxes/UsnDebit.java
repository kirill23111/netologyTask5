package taxes;

public class UsnDebit extends TaxSystem{
        public int calcTaxFor(int debit, int credit) {
            return (int) (debit * 0.06);
        }
    }

