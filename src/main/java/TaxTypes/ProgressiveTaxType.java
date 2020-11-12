package TaxTypes;

import Tax.TaxType;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProgressiveTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal tax;
        BigDecimal max = new BigDecimal(100_000);
        if ((amount.compareTo(max) == 0) || (amount.compareTo(max) < 0)) {
            tax = amount.multiply(BigDecimal.valueOf(0.1));
        } else {
            tax = amount.multiply(BigDecimal.valueOf(0.15));
        }

        return tax;
    }

    @Override
    public void thisType() {
        System.out.println(" - это прогрессивный налог ");
    }
}
