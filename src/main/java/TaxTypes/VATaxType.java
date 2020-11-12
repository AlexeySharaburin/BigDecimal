package TaxTypes;

import Tax.TaxType;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VATaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal result1 = amount.multiply(BigDecimal.valueOf(0.18));
        BigDecimal result = result1.divide(BigDecimal.valueOf(1.18), 3, RoundingMode.HALF_UP);

        return result;
//        return (amount * 0.18 / 1.18);
    }

    @Override
    public void thisType() {
        System.out.println(" - это НДС 18% ");
    }
}
