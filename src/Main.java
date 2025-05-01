import taxes.TaxSystem;
import taxes.UsnDebCrTax;
import taxes.UsnDebit;

public class Main {
    public static void main(String[] args) {
        TaxSystem usnDebit = new UsnDebit();
        TaxSystem usnDbCrTax = new UsnDebCrTax();

        Company myCompany = new Company("YYY", usnDebit);

        myCompany.shiftMoney(100);
        myCompany.shiftMoney(-250);
        myCompany.payTaxes();

        myCompany.shiftMoney(500);
        myCompany.shiftMoney(-300);
        myCompany.setTaxSystem(usnDbCrTax);
        myCompany.payTaxes();
    }
}